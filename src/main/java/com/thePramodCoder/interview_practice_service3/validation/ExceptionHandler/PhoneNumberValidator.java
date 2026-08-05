package com.thePramodCoder.interview_practice_service3.validation.ExceptionHandler;


import com.thePramodCoder.interview_practice_service3.validation.PhoneNumber;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class PhoneNumberValidator implements ConstraintValidator<PhoneNumber, String> {

    private static final String PHONE_NUMBER = "^(\\+91[\\-\\s]?)?[6-9][0-9]{9}$)";

    @Override
    public boolean isValid(String phoneNumber, ConstraintValidatorContext constraintValidatorContext) {
        if(phoneNumber==null || phoneNumber.isBlank()){
            return false;
        }
       return phoneNumber.matches(PHONE_NUMBER);
    }
}
