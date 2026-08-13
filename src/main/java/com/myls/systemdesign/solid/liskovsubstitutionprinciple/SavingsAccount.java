package com.myls.systemdesign.solid.liskovsubstitutionprinciple;

public class SavingsAccount extends Account {

	private double balance = 10000;

	@Override
	public void withdraw(double amount) {
		balance -= amount;
	}

	@Override
	public double getBalance() {
		return balance;
	}

}
