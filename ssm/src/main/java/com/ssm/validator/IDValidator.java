package com.ssm.validator;


import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
/**
 * Created by chen on 2016/8/24.
 */
public class IDValidator implements ConstraintValidator<ID,String>{


        @Override
        public void initialize(ID constraintAnnotation) {
        }


        @Override
        public boolean isValid(String value, ConstraintValidatorContext context) {
            if (value.length()!=1) {
                return false;
            }
            return true;
        }

}
