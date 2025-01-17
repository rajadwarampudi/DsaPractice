package com.practice.solutions.puzzles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSolution1679MaxKSumPairs {
    @Test
    public void testMaxOperations() {
        Solution_1679_MaxKSumPairs solution = new Solution_1679_MaxKSumPairs();

        assertEquals(2, solution.maxOperations(new int[]{1,2,3,4}, 5));
        assertEquals(0, solution.maxOperations(new int[]{1}, 5));
        assertEquals(13, solution.maxOperations(new int[]{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}, 2));
        assertEquals(1, solution.maxOperations(new int[]{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,1,1,1,1,1,1,1,1,1}, 3));
    }
}
