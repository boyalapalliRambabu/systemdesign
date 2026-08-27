package com.myls.systemdesign.designpattern.structural.adapter.springboot;

public record PaymentResponse(boolean success, String transactionId, String message) {
}
