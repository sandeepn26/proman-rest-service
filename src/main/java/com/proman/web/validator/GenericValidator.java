package com.proman.web.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class GenericValidator implements
ConstraintValidator<ContactNumberConstraint, String> {
	
	private String pattern = "*";

	@Override
	public void initialize(ContactNumberConstraint constraint) {
		this.pattern = constraint.pattern();
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext arg1) {
		// TODO Auto-generated method stub
		return false; //value != null && !value.isEmpty();
	}
	
}