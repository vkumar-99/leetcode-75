package com.javalang;

import java.util.Arrays;

public class CompressString {

    public static void main(String[] args) {
       char[] chars = {'a','a','b','b','c','c','c'};//{'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        System.out.println(compress(chars));
        printArr(chars);
    }
    public static int compress(char[] chars) {
        int ans = 0;
        for(int i = 0; i < chars.length; ) {
            final char letter = chars[i];
            int count  = 0;
            while(i < chars.length && chars[i] == letter) {
                ++count;
                ++i;
            }
            chars[ans++] = letter;
            if(count > 1) {
                for(char c: String.valueOf(count).toCharArray()) {
                    chars[ans++] = c;
                }
            }
        }
        return ans;
    }

    private static void printArr(char[] chars) {
        for (char c: chars){
            System.out.print(c);
        }
    }
}
