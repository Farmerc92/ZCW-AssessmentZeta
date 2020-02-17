package com.zipcodewilmington.assessment1.part5;

import static com.zipcodewilmington.assessment1.part1.BasicStringUtils.reverse;

public class Palindrome {

    public Integer countPalindromes(String input){
        int count = 0;
        String build = "";
        for (int i = 0; i < input.length(); i++) {
            build += String.valueOf(input.charAt(i));
            if (build != reverse(build)){
                countPalindromes(input.substring(i, input.length()));
            }
            else {
                count++;
            }
        }
        return count;
    }
}
