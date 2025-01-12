package com.practice.solutions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestSolution392Subsequence {

    @Test
    public void testisSubsequence() {
        Solution_392_Subsequence solution = new Solution_392_Subsequence();

        assertTrue(solution.isSubsequence("abc", "afgchjhjbsdscsadfgf"));
        assertFalse(solution.isSubsequence("aabbbbb", "bbbbbbb"));
        assertTrue(solution.isSubsequence("aaaaaaaaaaaaaaa", "sssssssaaaaaaassssffrfdfgaahdfgfdsdfsaaadfsdkfhaaadf"));
        assertTrue(solution.isSubsequence("zzzzdfsdfsdufisf", "zzsdfzzddfsfdfsdfsdfssdfsgjhfgddufihggrgsf"));
        assertFalse(solution.isSubsequence("zzzzdfsdfsdufisf", "zsdfzzddfsfdfsdfsdfssdfsgjhfgddufihggrgsf"));

    }
}
