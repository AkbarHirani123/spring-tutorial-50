package com.caveofprogramming.spring.web.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.apache.commons.validator.routines.EmailValidator;

public class ValidEmailImpl implements ConstraintValidator<ValidEmail, String>{

	private int min;
	
	public void initialize(ValidEmail constraintAnnotation) {
		min = constraintAnnotation.min();
	}

	public boolean isValid(String email, ConstraintValidatorContext context) {
		if(email.length() < min) {
			return false;
		}
		
		if(!EmailValidator.getInstance(false).isValid(email)) {
			return false;
		}
		return true;
	}

}
