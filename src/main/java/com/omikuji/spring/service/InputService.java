package com.omikuji.spring.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;

public class InputService {
	
	public Map<String, String> validateHandling(Errors errors){
		Map<String, String> validatorResult = new HashMap<>();
		
		for(FieldError error : errors.getFieldErrors()) {
			String validKeyName = String.format("valid_%s", error.getField());
			validatorResult.put(validKeyName, error.getDefaultMessage());
		}
		
		return validatorResult;
	}
	
}
