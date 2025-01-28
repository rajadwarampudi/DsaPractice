package com.practice.solutions.puzzles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSolution80RemoveDuplicatesFromSortedArrayII {

    @Test
    public void testRemoveDuplicates() {
        Solution_80_RemoveDuplicatesFromSortedArrayII solution = new Solution_80_RemoveDuplicatesFromSortedArrayII();

        int[] nums = new int[]{1,1,1,2,2,3};
        assertEquals(5, solution.removeDuplicates(nums));
        assertArrayEquals(new int[]{1,1,2,2,3,3}, nums);

        nums = new int[]{0,0,1,1,1,1,2,3,3};
        assertEquals(7, solution.removeDuplicates(nums));
        assertArrayEquals(new int[]{0,0,1,1,2,3,3,3,3}, nums);

        nums = new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        assertEquals(2, solution.removeDuplicates(nums));
        assertArrayEquals(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}, nums);

        nums = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13};
        assertEquals(13, solution.removeDuplicates(nums));
        assertArrayEquals(new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13}, nums);
    }
}
