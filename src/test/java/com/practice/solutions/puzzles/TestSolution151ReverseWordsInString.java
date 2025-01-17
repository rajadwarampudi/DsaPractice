package com.practice.solutions.puzzles;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSolution151ReverseWordsInString {

    @Test
    public void testReverseWords() {
        Solution_151_ReverseWordsInString solution = new Solution_151_ReverseWordsInString();

        assertEquals("world hello", solution.reverseWords("  hello world  "));

    }
}
