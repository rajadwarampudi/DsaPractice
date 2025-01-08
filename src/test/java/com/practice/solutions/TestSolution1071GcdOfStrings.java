package com.practice.solutions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSolution1071GcdOfStrings {

    @Test
    public void testGcdOfStrings() {
        Solution_1071_GcdOfStrings solution = new Solution_1071_GcdOfStrings();
        assertEquals(solution.gcdOfStrings("ABAB", "AB"), "AB");
        assertEquals(solution.gcdOfStrings("AB", "ABAB"), "AB");
        assertEquals(solution.gcdOfStrings("RAJA", "PROG"), "");

    }
}
