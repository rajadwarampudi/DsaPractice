package com.practice.solutions.puzzles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestSolution88MergeSortedArray {

    @Test
    public void testMerge() {
        Solution_88_MergeSortedArray solution = new Solution_88_MergeSortedArray();

        int[] num1 = new int[]{1,2,3,0,0,0};
        int[] num2 = new int[]{4,5,6};
        solution.merge(num1, 3, num2, 3);
        assertArrayEquals(num1, new int[]{1,2,3,4,5,6});
    }

    @Test
    public void testMergeWithSecondArrayEmpty() {
        Solution_88_MergeSortedArray solution = new Solution_88_MergeSortedArray();

        int[] num1 = new int[]{1,2,3,0,0,0};
        int[] num2 = new int[]{};
        solution.merge(num1, 3, num2, 0);
        assertArrayEquals(num1, new int[]{1,2,3,0,0,0});
    }

    @Test
    public void testMergeWithFirstArrayEmpty() {
        Solution_88_MergeSortedArray solution = new Solution_88_MergeSortedArray();

        int[] num1 = new int[]{0,0,0};
        int[] num2 = new int[]{4,5,6};
        solution.merge(num1, 0, num2, 3);
        assertArrayEquals(num1, new int[]{4,5,6});
    }

    @Test
    public void testMergeWithJumbledValues() {
        Solution_88_MergeSortedArray solution = new Solution_88_MergeSortedArray();

        int[] num1 = new int[]{1,3,5,7,9,11,13,15,17,19,0,0,0,0,0,0,0,0,0,0};
        int[] num2 = new int[]{2,4,6,8,10,12,14,16,18,20};
        solution.merge(num1, 10, num2, 10);
        assertArrayEquals(num1, new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20});
    }
}
