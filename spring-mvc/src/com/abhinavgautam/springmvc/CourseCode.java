package com.abhinavgautam.springmvc;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = CourseCodeConstraintValidator.class)
@Retention(RUNTIME)
@Target({ FIELD, METHOD })
public @interface CourseCode {
	// Define default course code
	public String value() default "CODE";
	// Define default error message
	public String message() default "Must start with CODE";
	// Define default groups
	public Class<?>[] groups() default {}; 
	// Define default payloads
	public Class<? extends Payload>[] payload() default {};
}
