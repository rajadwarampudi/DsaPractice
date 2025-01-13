package com.practice.solutions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSolution1456MaximumNumberOfVowelsInSubstring {

    @Test
    public void testReverseWords() {
        Solution_1456_MaximumNumberOfVowelsInASubstring solution = new Solution_1456_MaximumNumberOfVowelsInASubstring();

        assertEquals(3, solution.maxVowels("abciiidef", 3));
        assertEquals(1, solution.maxVowels("a", 1));
        assertEquals(70, solution.maxVowels("aeiouaeiouaeiouaeiouaeiouaeiouaeiouaeiouaeiouaeiouaeiouaeiou" +
                "aeiouaeiouaeiouaeiouaeiouaeiouaeiouaeiouaeiouaeiouaeiouaeiouaeiouaeiouaeiouaeiouaeiouaeiouaeiou" +
                "aeiouaeiouaeiouaeiouaeiouaeiouaeiouaeiouaeiouaeiouaeiouaeiouaeiouaeiouaeiouaeiouaeiouaeiouaei" +
                "ouaeiouaeiouaeiouaeiouaeiouaeiouaeiouaeiouaeiouaeiou", 70));

    }
}
