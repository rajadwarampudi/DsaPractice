package com.practice.solutions.puzzles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSolution169MajorityElement {

    @Test
    public void testMajorityElement() {
        Solution_169_MajorityElement solution = new Solution_169_MajorityElement();

        assertEquals(1, solution.majorityElement(new int[]{1,1,2,2,1}));
        assertEquals(2, solution.majorityElement(new int[]{2,2,1,1,1,2,2}));
        assertEquals(-3, solution.majorityElement(new int[]{-1,-2,-3,-1,-2,-3,-1,-2,-3,-4,-3}));
    }
}
