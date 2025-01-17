package com.practice.solutions.puzzles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSolution11ContainerWithMostWater {

    @Test
    public void testReverseWords() {
        Solution_11_ContainerWithMostWater solution = new Solution_11_ContainerWithMostWater();

        assertEquals(49, solution.maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
        assertEquals(1, solution.maxArea(new int[]{1,1}));
        assertEquals(189, solution.maxArea(new int[]{9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,10}));
        assertEquals(210, solution.maxArea(new int[]{10,9,9,9,9,9,9,9,9,9,20,9,9,9,9,9,9,9,9,9,9,10}));

    }
}
