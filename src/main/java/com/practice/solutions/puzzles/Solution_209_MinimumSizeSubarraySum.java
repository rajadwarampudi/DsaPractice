package com.practice.solutions.puzzles;

public class Solution_209_MinimumSizeSubarraySum {
    public int minSubArrayLen(int target, int[] nums) {
        int minimalLength = Integer.MAX_VALUE;

        int i = 0, j = 0;
        int len = nums.length;
        int tempSum = 0;
        while (i <= j && j < len) {
            if (nums[j] >= target) {
                return 1;
            }
            tempSum += nums[j];
            while (tempSum >= target)
            {
                minimalLength = Math.min(minimalLength, j - i + 1);
                tempSum -= nums[i];
                i++;
            }
            j++;
        }

        return minimalLength == Integer.MAX_VALUE ? 0 : minimalLength;
    }
}
