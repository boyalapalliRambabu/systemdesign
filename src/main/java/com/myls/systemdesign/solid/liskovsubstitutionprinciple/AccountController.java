package com.myls.systemdesign.solid.liskovsubstitutionprinciple;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {

	private final AccountService accountService;

	private final SavingsAccountLatest savingsAccount;
	private final FixedDepositAccountLatest fixedDepositAccount;

	public AccountController(AccountService accountService, SavingsAccountLatest savingsAccount,
			FixedDepositAccountLatest fixedDepositAccount) {
		this.accountService = accountService;
		this.savingsAccount = savingsAccount;
		this.fixedDepositAccount = fixedDepositAccount;

	}

	@GetMapping("/savings/balance")
	public double savingsBalance() {
		return accountService.getBalance(savingsAccount);
	}

	@PostMapping("/savings/withdraw")
	public String withdraw(@RequestParam double amount) {

		accountService.withdraw(savingsAccount, amount);

		return "Withdrawal successful";
	}

	@GetMapping("/fixed-deposit/balance")
	public double fixedDepositBalance() {

		return accountService.getBalance(fixedDepositAccount);
	}
}
