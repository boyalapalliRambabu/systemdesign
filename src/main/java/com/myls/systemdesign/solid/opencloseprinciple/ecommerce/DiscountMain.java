package com.myls.systemdesign.solid.opencloseprinciple.ecommerce;

public class DiscountMain {

	public static void main(String[] args) {
		DiscountService dis = new DiscountService();

		int amount = 1000;
		DiscountPolicy newUser = new NewUserDiscount();

		double res = dis.applyDiscount(newUser, amount);
		System.out.println(res);
	}
}
