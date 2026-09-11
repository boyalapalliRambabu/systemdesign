package com.myls.systemdesign.designpattern.structural.facade;

import org.springframework.stereotype.Service;

@Service
public class OrderFacade {

	private final InventoryService inventoryService;
	private final PaymentService paymentService;
	private final ShippingService shippingService;
	private final NotificationServicelatest notificationService;

	public OrderFacade(InventoryService inventoryService, PaymentService paymentService,
			ShippingService shippingService, NotificationServicelatest notificationService) {

		this.inventoryService = inventoryService;
		this.paymentService = paymentService;
		this.shippingService = shippingService;
		this.notificationService = notificationService;
	}

	public OrderResponse placeOrder(OrderRequest request) {

		// 1. Check inventory
		boolean available = inventoryService.checkAvailability(request.getProductId(), request.getQuantity());

		if (!available) {

			return new OrderResponse(false, null, "Product is out of stock");
		}

		// 2. Reserve inventory
		inventoryService.reserveStock(request.getProductId(), request.getQuantity());

		String paymentId = null;

		try {

			// 3. Process payment
			paymentId = paymentService.processPayment(request.getCustomerId(), request.getAmount());

			// 4. Create order ID
			String orderId = "ORD-" + System.currentTimeMillis();

			// 5. Create shipment
			String shipmentId = shippingService.createShipment(orderId, request.getAddress());

			// 6. Send notification
			notificationService.sendOrderConfirmation(request.getCustomerId(), orderId);

			return new OrderResponse(true, orderId, "Order placed successfully");

		} catch (Exception e) {

			// Rollback payment if it happened
			if (paymentId != null) {
				paymentService.refundPayment(paymentId);
			}

			// Release reserved inventory
			inventoryService.releaseStock(request.getProductId(), request.getQuantity());

			return new OrderResponse(false, null, "Order failed: " + e.getMessage());
		}
	}

}
