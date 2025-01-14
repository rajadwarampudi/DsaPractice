package com.practice.solutions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestSolution1657DetermineTwoStringsAreClose {

    @Test
    public void testReverseWords() {
        Solution_1657_DetermineTwoStringsAreClose solution = new Solution_1657_DetermineTwoStringsAreClose();

        assertTrue(solution.closeStrings("abc", "bca"));
        assertTrue(solution.closeStrings("cabbba", "abbccc"));
        assertFalse(solution.closeStrings("a", "aa"));
        assertFalse(solution.closeStrings("abbccddd", "aabcccde"));
        assertFalse(solution.closeStrings("abdasdlakdfsadfsdflkfjsdlfkjasahbfsdkfjdsflkajrasdrf", "abdasdlakdfsadfsdflkfjsdlfkjasahfsdkfjdsflkajrasdrf"));
    }
}
