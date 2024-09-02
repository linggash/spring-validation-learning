package com.linggash.spring_validation_learning.helper;

import org.springframework.stereotype.Component;

@Component
public class StringHelper {

    public boolean isPalindrome(String value){
        String reverse = new StringBuilder(value).reverse().toString();
        return value.equals(reverse);
    }

}
