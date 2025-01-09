package com.practice.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution_1431_GreatestNumberOfCandies {
    /**
     * Check problem number 1431 in leetcode
     * @param candies
     * @param extraCandies
     * @return
     */
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int currentMaxCandies = Arrays.stream(candies).max().orElseThrow(() -> new RuntimeException("Array is empty")); // exception never occurs
        List<Boolean> resultList = new ArrayList<>();

        for (int candyCount : candies) {
            if (candyCount + extraCandies > currentMaxCandies) {
                resultList.add(true);
            } else {
                resultList.add(false);
            }
        }

        return resultList;

    }
}
