package com.practice.solutions.puzzles;

public class Solution_283_Move_Zeroes {
    public void moveZeroes(int[] nums) {
        int i = 0, j = 1;

        while (j < nums.length) {
            if (nums[i] != 0) {
                i++;
            } else {
                if (nums[j] != 0) {
                    nums[i] = nums[j];
                    nums[j] = 0;
                    i++;
                }
            }
            j++;
        }
    }
}
