package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
        String str1 = str.substring(0,1).toUpperCase();
        String str2 = str1 + str.substring(1,str.length());
        return str2;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        StringBuilder str1 = new StringBuilder(str);
        StringBuilder reverseStr1 = str1.reverse();
        return reverseStr1.toString();
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        String reverse = reverse(str);
        String reverseCamel = camelCase(reverse);
        return reverseCamel;
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
        return str.substring(1, str.length() -1);
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        char[] array = str.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if ('A' <= array[i] && array[i] <= 'Z'){
                array[i] += 32;
            }
            else if ('a' <= array[i] && array[i] <= 'z'){
                array[i] -= 32;
            }
        }
        String results = new String(array);
        return results;
    }
}
