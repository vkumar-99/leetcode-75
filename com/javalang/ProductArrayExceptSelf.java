package com.javalang;

import java.util.Arrays;

public class ProductArrayExceptSelf {

    public static void main(String[] args) {
        int[] input = {1,2,3,4};
        ProductArrayExceptSelf obj = new ProductArrayExceptSelf();
        int[] output = obj.productExceptSelf(input);
        printArray(output);
    }
    public int[] productExceptSelf(int[] nums) {
        int arrSize = nums.length;
        int[] productArray = new int[arrSize];
        int suffixProduct = 1;

        productArray[0] = 1; //No element previous to element at 0 in input
        for (int i = 1; i < arrSize; i++){
            productArray[i] = productArray[i-1] * nums[i-1];
        }

        for(int k = arrSize-1; k >= 0; k--) {
            productArray[k] = productArray[k] * suffixProduct;
            suffixProduct *= nums[k];
        }
        return productArray;
    }

    private static void printArray(int[] arr){
        Arrays.stream(arr).forEach(System.out::print);
        System.out.println("");
    }
}
