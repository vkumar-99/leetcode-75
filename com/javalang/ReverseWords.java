package com.javalang;

public class ReverseWords {

    public static void main(String[] args) {
        String input = "a good   example";
        String reverseString = reverseWords(input);
        System.out.println(reverseString);
        System.out.println(reverseString.equals("example good a"));
    }

    public static String reverseWords(String s) {
        s = s.strip();
        String[] s1 = s.split("\\s+");
        int lt = 0; int rt = s1.length - 1;
        while(lt < rt) {
            String temp = s1[lt].strip();
            s1[lt] = s1[rt].strip();
            s1[rt] = temp;
            lt++;
            rt--;
        }
       return String.join(" ",s1);
    }
}
