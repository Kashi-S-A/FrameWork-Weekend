package com.tyss.sb.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AppExceptionHandler {

	@ExceptionHandler(ArithmeticException.class)
	public String catchArithmeticException(ArithmeticException e) {
		return e.getMessage();
	}
	
	@ExceptionHandler(NullPointerException.class)
	public String catchNullPointerException(NullPointerException e) {
		return e.getMessage();
	}
}
