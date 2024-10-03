package com.javalang;

import java.util.Stack;

public class IncreasingTripletSeq {

    public static void main(String[] args) {
        int[] input = {20,100,10,12,5,13};
        System.out.println(increasingTriplet(input));
    }

    public static boolean increasingTriplet(int[] nums) {
        int min = Integer.MAX_VALUE;
        int mid = Integer.MAX_VALUE;

        for(int num: nums) {
            if(num <= min){
                min = num;
            }else if(num <= mid){
                mid = num;
            }else
                return true;
        }
        return false;
    }
}
