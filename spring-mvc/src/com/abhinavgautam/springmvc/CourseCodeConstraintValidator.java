package com.abhinavgautam.springmvc;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {

	private String coursePrefix;

	@Override
	public void initialize(CourseCode courseCode) {
		coursePrefix = courseCode.value();
	}

	@Override
	public boolean isValid(String formCode, ConstraintValidatorContext constraintValidatorContext) {
		boolean result;
		if (formCode != null) {
			result = formCode.startsWith(coursePrefix);
		} else {
			result = true;
		}
		return result;
	}

}
