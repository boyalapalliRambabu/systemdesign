package com.myls.systemdesign.solid.singleresposibilityprinciple.loan;

public class LoanServicelatest {

	private final LoanCalculator calculator;
	private final LoanRepository repository;
	private final SmsService smsService;

	public LoanServicelatest(LoanCalculator calculator, LoanRepository repository, SmsService smsService) {
		this.calculator = calculator;
		this.repository = repository;
		this.smsService = smsService;
	}

	public void processLoan(Object obj) {
		calculator.calculateEmi(obj);
		repository.save(obj);
		smsService.sendSms(obj);
	}
}
