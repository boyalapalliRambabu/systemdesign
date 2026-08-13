package com.myls.systemdesign.solid.liskovsubstitutionprinciple;

import org.springframework.stereotype.Service;

@Service
public class SavingsAccountLatest implements WithdrawableAccount {

	private double balance = 10000;

	@Override
	public void withdraw(double amount) {

		if (amount <= 0) {
			throw new IllegalArgumentException("Amount must be greater than zero");
		}

		if (amount > balance) {
			throw new IllegalArgumentException("Insufficient balance");
		}

		balance -= amount;
	}

	@Override
	public double getBalance() {
		return balance;
	}

}
