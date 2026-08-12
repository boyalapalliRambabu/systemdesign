//package com.myls.systemdesign.solid.opencloseprinciple.payment;
//
//import java.math.BigDecimal;
//
//public class PaymentMain {
//
//	public static void main(String[] args) {
//
//		PaymentServiceLatest payment = new PaymentServiceLatest();
//
//		PaymentRequest req = new PaymentRequest("TXN-1232", new BigDecimal("3000"));
//
//		PaymentMethod cardPayment = new CardPayment();
//
//		PaymentResponse res = payment.process(cardPayment, req);
//		System.out.println(res);
//
//		PaymentMethod upiPayment = new UpiPayment();
//		res = payment.process(upiPayment, req);
//		System.out.println(res);
//
//		PaymentMethod netBanking = new NetBankingPayment();
//
//		res = payment.process(netBanking, req);
//		System.out.println(res);
//	}
//}
