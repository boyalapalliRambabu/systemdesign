package com.myls.systemdesign.solid.opencloseprinciple.payment;

public class PaymentService {

	public PaymentResponse process(String type, PaymentRequest req) {

		if (type.equals("CARD")) {
			// Card payment logic
			return new PaymentResponse(true, "Card payment successfull");
		} else if (type.equals("UPI")) {
			// Upi payment logic
			return new PaymentResponse(true, "Upi payment successfull");

		} else if (type.equals("NETBANKING")) {
			return new PaymentResponse(true, "Netbanking payment sucessfull");
		}
		return new PaymentResponse(false, "Unsupported payment type");

	}

	// problem

//	New payment type
//    ↓
//   Modify PaymentService
//    ↓
//    Test PaymentService again
}
