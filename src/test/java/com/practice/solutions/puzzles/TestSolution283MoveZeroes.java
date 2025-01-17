package com.practice.solutions.puzzles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestSolution283MoveZeroes {

    @Test
    public void testMoveZeroes() {
        Solution_283_Move_Zeroes solution = new Solution_283_Move_Zeroes();

        int[] nums = new int[]{0,1,0,3,12};
        solution.moveZeroes(nums);
        assertArrayEquals(new int[]{1,3,12,0,0}, nums);

        int[] numsScenario2 = new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0};
        solution.moveZeroes(numsScenario2);
        assertArrayEquals(new int[]{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}, numsScenario2);

    }
}
