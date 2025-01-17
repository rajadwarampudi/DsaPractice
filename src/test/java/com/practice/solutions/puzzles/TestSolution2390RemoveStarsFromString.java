package com.practice.solutions.puzzles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSolution2390RemoveStarsFromString {

    @Test
    public void testReverseWords() {
        Solution_2390_RemoveStarsFromString solution = new Solution_2390_RemoveStarsFromString();

        assertEquals("lecoe", solution.removeStars("leet**cod*e"));
        assertEquals("", solution.removeStars("leet****"));
    }
}
