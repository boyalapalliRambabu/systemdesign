package com.myls.systemdesign.solid.liskovsubstitutionprinciple;

import org.springframework.stereotype.Service;

@Service
public class FixedDepositAccountLatest implements AccountLatest {

	private double balance = 10000;

	@Override
	public double getBalance() {
		return balance;
	}

}
