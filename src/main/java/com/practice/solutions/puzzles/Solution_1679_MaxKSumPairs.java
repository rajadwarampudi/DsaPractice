package com.practice.solutions.puzzles;

import java.util.Arrays;

public class Solution_1679_MaxKSumPairs {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);

        int i = 0, j = nums.length - 1;
        int operationCount = 0;

        while (i < j) {
            int tempSum = nums[i] + nums[j];
            if(tempSum == k) {
                operationCount++;
                i++;
                j--;
            } else if (tempSum > k) {
                j--;
            } else {
                i++;
            }
        }
        return operationCount;
    }
}
