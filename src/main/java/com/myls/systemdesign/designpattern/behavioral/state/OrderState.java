package com.myls.systemdesign.designpattern.behavioral.state;

public class OrderState {
	private Long orderId;
	private OrderStatus status;

	public OrderState(Long orderId) {
		this.orderId = orderId;
		this.status = OrderStatus.CREATED;
	}

	public void pay() {

		if (status == OrderStatus.CREATED) {
			System.out.println("Payment is successful");
			status = OrderStatus.PAID;
		} else if (status == OrderStatus.PAID) {
			System.out.println("Order is alredy paid");
		} else if (status == OrderStatus.SHIPPED) {
			System.out.println("Order is already shipped");
		} else if (status == OrderStatus.DELIVERED) {
			System.out.println("Order is already delivered");
		} else if (status == OrderStatus.CANCELLED) {
			System.out.println("Cancelled order cannot be paid");
		}
	}

	public void ship() {

		if (status == OrderStatus.CREATED) {

			System.out.println("Cannot ship unpaid order");

		} else if (status == OrderStatus.PAID) {

			System.out.println("Order shipped");

			status = OrderStatus.SHIPPED;

		} else if (status == OrderStatus.SHIPPED) {

			System.out.println("Order is already shipped");

		} else if (status == OrderStatus.DELIVERED) {

			System.out.println("Order is already delivered");

		} else if (status == OrderStatus.CANCELLED) {

			System.out.println("Cancelled order cannot be shipped");
		}
	}

	public void deliver() {

		if (status == OrderStatus.CREATED) {

			System.out.println("Cannot deliver unpaid order");

		} else if (status == OrderStatus.PAID) {

			System.out.println("Cannot deliver before shipping");

		} else if (status == OrderStatus.SHIPPED) {

			System.out.println("Order delivered");

			status = OrderStatus.DELIVERED;

		} else if (status == OrderStatus.DELIVERED) {

			System.out.println("Order is already delivered");

		} else if (status == OrderStatus.CANCELLED) {

			System.out.println("Cancelled order cannot be delivered");
		}
	}

	public void cancel() {
		if (status == OrderStatus.CREATED) {

			System.out.println("Order cancelled");

			status = OrderStatus.CANCELLED;

		} else if (status == OrderStatus.PAID) {

			System.out.println("Payment refunded");

			System.out.println("Order cancelled");

			status = OrderStatus.CANCELLED;

		} else if (status == OrderStatus.SHIPPED) {

			System.out.println("Cannot cancel shipped order");

		} else if (status == OrderStatus.DELIVERED) {

			System.out.println("Delivered order cannot be cancelled");

		} else if (status == OrderStatus.CANCELLED) {

			System.out.println("Order is already cancelled");
		}
	}

	public OrderStatus getStatus() {
		return status;
	}
}
