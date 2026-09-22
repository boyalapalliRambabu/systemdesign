package com.myls.systemdesign.designpattern.behavioral.state;

public class StateMain {

	public static void main(String[] args) {
		OrderState order = new OrderState(1001L);
		System.out.println("Initial status: " + order.getStatus());
		System.out.println("\n--- PAY ---");
		order.pay();
		System.out.println("Status: " + order.getStatus());

		System.out.println("\n--- SHIP ---");
		order.ship();
		System.out.println("Status: " + order.getStatus());

		System.out.println("\n--- DELIVER ---");
		order.deliver();
		System.out.println("Status: " + order.getStatus());

		System.out.println("\n--- CANCEL ---");
		order.cancel();

		System.out.println("Status: " + order.getStatus());
	}
}
