package com.myls.systemdesign.solid.singleresposibilityprinciple.order;

public class OrderServicelatest {

	private final InventryService inventry;
	private final PaymentGateway payment;
	private final OrderRepository repository;
	private final EmailService emaiService;
	private final LoyaltyService loyalty;

	public OrderServicelatest(InventryService inventry, PaymentGateway payment, OrderRepository repository,
			EmailService emaiService, LoyaltyService loyalty) {
		super();
		this.inventry = inventry;
		this.payment = payment;
		this.repository = repository;
		this.emaiService = emaiService;
		this.loyalty = loyalty;
	}

	public void placeOrder(Object obj) {
		inventry.reserveStock(obj);
		payment.payment(obj);
		repository.save(obj);
		emaiService.sendEmail(obj);
		loyalty.addRewardPoints(obj);
	}
}
