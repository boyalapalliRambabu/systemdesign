package com.myls.systemdesign.solid.liskovsubstitutionprinciple;

public interface WithdrawableAccount extends AccountLatest {
	void withdraw(double amount);
}
