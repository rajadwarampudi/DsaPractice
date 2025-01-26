package com.practice.solutions.puzzles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSolution209MinimumSizeSubArraySum {

    @Test
    public void testMinSubArrayLen() {
        Solution_209_MinimumSizeSubarraySum solution = new Solution_209_MinimumSizeSubarraySum();

        assertEquals(2, solution.minSubArrayLen(7, new int[]{2,3,1,2,4,3}));

        assertEquals(1, solution.minSubArrayLen(4, new int[]{1,4,4}));

        assertEquals(0, solution.minSubArrayLen(11, new int[]{1,1,1,1,1,1,1,1,1,1}));
        assertEquals(11, solution.minSubArrayLen(11, new int[]{1,1,1,1,1,1,1,1,1,1,1}));

    }
}
