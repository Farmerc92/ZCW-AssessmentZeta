package com.zipcodewilmington.assessment1.part5;

import static com.zipcodewilmington.assessment1.part1.BasicStringUtils.reverse;

public class Palindrome {

    public Integer countPalindromes(String input){
        int length = input.length();
        int count = 0;
        String palindrome = "";
        char[] charArray = input.toCharArray();
        Character[] array = new Character[length];
        for (int c = 0; c < length; c++) {
            array[c] = charArray[c];
        }
        for (int i = 0; i < length; i++) {
            palindrome = "";
            for (int j = i; j < length; j++) {
                palindrome += array[j].toString();
                if (palindrome.equals(reverse(palindrome))){
                    count++;
                }
            }
        }
        return count;
    }
}
