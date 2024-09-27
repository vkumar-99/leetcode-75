package com.javalang;

import java.util.Arrays;
import java.util.List;

public class ReverseVowels {

    public static void main(String[] args) {
        String output = reverseVowels("IceCreAm");
        System.out.println(output.equals("AceCreIm"));
    }

    public static String reverseVowels(String s) {
        List listOfVowels = Arrays.asList('a','e','i','o','u','A','E','I','O','U');
        char[] arr = s.toCharArray();
        int lt = 0;
        int rt = s.length()-1;
        char ltSwap = Character.MIN_VALUE, rtSwap = Character.MIN_VALUE;
        while (rt > lt) {
            if(!listOfVowels.contains(arr[lt])) {
                lt++;
                continue;
            }
            if(!listOfVowels.contains(arr[rt])) {
                rt--;
                continue;
            }
            char temp = arr[lt];
            arr[lt] = arr[rt];
            arr[rt] =  temp;
            lt++;
            rt--;
        }
        return new String(arr);
    }
}
