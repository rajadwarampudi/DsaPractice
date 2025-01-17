package com.practice.solutions.puzzles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestSolution238ProductOfArrayExceptSelf {

    @Test
    public void testProductExceptSelf() {
        Solution_238_ProductOfArrayExceptSelf solution = new Solution_238_ProductOfArrayExceptSelf();

        assertArrayEquals(new int[]{24, 12, 8, 6}, solution.productExceptSelf(new int[]{1, 2, 3, 4}));
        assertArrayEquals(new int[]{0, 0, 9, 0, 0}, solution.productExceptSelf(new int[]{-1, 1, 0, -3, 3}));
    }
}
