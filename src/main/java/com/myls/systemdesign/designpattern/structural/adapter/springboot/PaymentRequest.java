package com.myls.systemdesign.designpattern.structural.adapter.springboot;

public record PaymentRequest(double amount, String currency, String customerId) {
}
