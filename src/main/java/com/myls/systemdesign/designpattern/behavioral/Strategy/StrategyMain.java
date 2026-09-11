//package com.myls.systemdesign.designpattern.behavioral.Strategy;
//
//public class StrategyMain {
//
//	public static void main(String[] args) {
//
//		StrategyCheckoutService checkOut = new StrategyCheckoutService(new NoDiscount());
//		System.out.println(checkOut.checkOut(200));
//		checkOut.setStrategy(new PercentageDiscount(.15));
//		System.out.println(checkOut.checkOut(200));
//		checkOut.setStrategy(new FixedAmountDiscount(10));
//		System.out.println(checkOut.checkOut(200));
//	}
//
//}
