package com.javalang;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class MoveZeros {

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeros(nums);
    }
    public static void moveZeros(int[] nums) {
        int i =0;
        for(int num: nums)
            if(num != 0)
                nums[i++] = num;
        while(i < nums.length) {
            nums[i++] = 0;
        }
    }

    private static void printArr(int[] arr) {
        for(int n: arr) {
            System.out.print(n);
        }
    }
}
