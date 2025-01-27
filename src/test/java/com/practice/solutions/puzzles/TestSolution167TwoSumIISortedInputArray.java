package com.practice.solutions.puzzles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSolution167TwoSumIISortedInputArray {

    @Test
    public void testLengthOfLongestSubstring() {
        Solution_167_TwoSumII_SortedInputArray solution = new Solution_167_TwoSumII_SortedInputArray();

        assertArrayEquals(new int[]{1,2}, solution.twoSum(new int[]{2,7,11,15},9));
        assertArrayEquals(new int[]{1,3}, solution.twoSum(new int[]{2,2,4},6));
        assertArrayEquals(new int[]{1,2}, solution.twoSum(new int[]{-1,0},-1));
    }
}
