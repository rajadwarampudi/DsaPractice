package com.practice.solutions.puzzles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSolution3LongestSubstringWithoutRepeatingChars {

    @Test
    public void testLengthOfLongestSubstring() {
        Solution_3_LongestSubstringWithoutRepeatingChars solution = new Solution_3_LongestSubstringWithoutRepeatingChars();

        assertEquals(1, solution.lengthOfLongestSubstring("aaaaaaaa"));
        assertEquals(6, solution.lengthOfLongestSubstring("abcdabsdfl"));
        assertEquals(3, solution.lengthOfLongestSubstring("pwwkew"));
        assertEquals(8, solution.lengthOfLongestSubstring("abcddmnopqrs"));
        assertEquals(12, solution.lengthOfLongestSubstring("abcddm nopqr231s"));
        assertEquals(10, solution.lengthOfLongestSubstring("abcddm no pqr231s"));
    }
}
