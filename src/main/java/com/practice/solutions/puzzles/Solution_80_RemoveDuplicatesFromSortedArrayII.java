package com.practice.solutions.puzzles;

public class Solution_80_RemoveDuplicatesFromSortedArrayII {
    public int removeDuplicates(int[] nums) {
        int k = 1;

        int currentValue = nums[0];
        int currentValueCount = 1;

        for(int i = 1; i < nums.length; i++) {
            if (nums[i] == currentValue) {
                currentValueCount++;

                if (currentValueCount <= 2) {
                    nums[k] = nums[i];
                    k++;
                }
            } else {
                nums[k] = nums[i];
                k++;
                currentValue = nums[i];
                currentValueCount = 1;
            }
        }

        return k;

    }
}
