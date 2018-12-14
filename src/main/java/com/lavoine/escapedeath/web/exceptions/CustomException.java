package com.lavoine.escapedeath.web.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

// Template d'exception customisée en cas de besoin :)
@SuppressWarnings("serial")
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class CustomException extends RuntimeException {
	public CustomException(String s) {
		super(s);
	}
}
