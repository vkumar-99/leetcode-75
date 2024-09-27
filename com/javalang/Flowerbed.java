package com.javalang;

public class Flowerbed {

    public static void main(String[] args) {
        int[] input = {0,1,0};//{1, 0,0, 0, 1};
        Flowerbed flowerbed = new Flowerbed();
        boolean test1 = flowerbed.canPlaceFlowers(input, 1);
        System.out.println("test 1 "+test1);
    }

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        for(int i = 0; i < flowerbed.length && count < n; i++) {
            if(flowerbed[i] == 0) {
                int next = (i == flowerbed.length - 1) ? 0 : flowerbed[i + 1];
                int prev = (i == 0) ? 0 : flowerbed[i - 1];
                if(next == 0 && prev == 0) {
                    flowerbed[i] = 1;
                    count++;
                }
            }
        }
        return count == n;
    }
}
