package com.practice.solutions.puzzles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSolution1768StringAlternativeMerge {

    @Test
    public void testSolution_1768_StringAlternativeMerge() {
        Solution_1768_StringAlternativeMerge solution = new Solution_1768_StringAlternativeMerge();

        assertEquals(solution.mergeAlternately("abc", "def"), "adbecf");
        assertEquals(solution.mergeAlternately("pq", "rstu"), "prqstu");
        assertEquals(solution.mergeAlternately("rstu", "pq"), "rpsqtu");
    }
}
