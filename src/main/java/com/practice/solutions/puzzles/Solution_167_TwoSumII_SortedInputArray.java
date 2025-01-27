package com.practice.solutions.puzzles;

public class Solution_167_TwoSumII_SortedInputArray {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];

        int i = 0, j = numbers.length - 1;

        while (i < j) {
            int tempSum = numbers[i] + numbers[j];
            if (tempSum == target) {
                result[0] = i + 1;
                result[1] = j + 1;
                break;
            } else if (tempSum < target) {
                i++;
            } else {
                j--;
            }
        }

        return result;
    }
}
