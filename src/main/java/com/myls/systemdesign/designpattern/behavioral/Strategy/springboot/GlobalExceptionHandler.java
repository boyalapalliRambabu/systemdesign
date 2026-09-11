package com.myls.systemdesign.designpattern.behavioral.Strategy.springboot;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(InvalidPromotionException.class)
	public ResponseEntity<ErrorResponse> handleInvalidPromotion(InvalidPromotionException ex) {

		ErrorResponse response = new ErrorResponse("INVALID_PROMOTION", ex.getMessage());

		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
	}

	@ExceptionHandler(IllegalArgumentException.class)
	public ResponseEntity<ErrorResponse> handleIllegalArgument(IllegalArgumentException ex) {

		ErrorResponse response = new ErrorResponse("INVALID_REQUEST", ex.getMessage());

		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
	}
}
