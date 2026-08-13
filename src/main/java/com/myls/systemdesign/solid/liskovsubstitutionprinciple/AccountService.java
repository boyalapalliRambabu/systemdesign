package com.myls.systemdesign.solid.liskovsubstitutionprinciple;

import org.springframework.stereotype.Service;

@Service
public class AccountService {

	public double getBalance(AccountLatest account) {
		return account.getBalance();
	}

	public void withdraw(WithdrawableAccount account, double amount) {
		account.withdraw(amount);
	}
}
