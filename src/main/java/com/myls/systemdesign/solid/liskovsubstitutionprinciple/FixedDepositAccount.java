package com.myls.systemdesign.solid.liskovsubstitutionprinciple;

public class FixedDepositAccount extends Account {

	private double balance = 10000;

	@Override
	public void withdraw(double amount) {
		throw new UnsupportedOperationException("Withdraw is not allowed for fixed deposit");
	}

	@Override
	public double getBalance() {
		return balance;
	}

}
