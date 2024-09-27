package com.javalang;

import java.util.Arrays;
import java.util.List;

public class Candies {

    public static void main(String[] args) {
        int[] kidsWithCandiesArray = {2, 3, 5, 1, 3};
        Candies candies = new Candies();
        System.out.println(candies.kidsWithCandies(kidsWithCandiesArray, 3));
    }

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandyKid = Arrays.stream(candies).max().getAsInt(); // Find the kid with max candies
        return Arrays.stream(candies)
                .mapToObj(c -> c + extraCandies >= maxCandyKid ? true: false)
                .toList();
    }
}
