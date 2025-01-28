package com.practice.solutions.puzzles;

public class Solution_169_MajorityElement {
    public int majorityElement(int[] nums) {
        int currentMajorityElement = nums[0];
        int majorityElementCount = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == currentMajorityElement) {
                majorityElementCount += 1;
            } else {
                majorityElementCount -= 1;
                if (majorityElementCount == 0) {
                    currentMajorityElement = nums[i];
                    majorityElementCount = 1;
                }
            }
        }

        return currentMajorityElement;
    }
}
