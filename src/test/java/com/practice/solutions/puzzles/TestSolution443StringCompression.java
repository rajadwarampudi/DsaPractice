package com.practice.solutions.puzzles;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSolution443StringCompression {

    @Test
    public void testCompress() {
        Solution_443_StringCompression solution = new Solution_443_StringCompression();

        char[] charsScenario1 = new char[] {'a', 'a','a','b','b', '1','c','c','C'};
        assertEquals(8, solution.compress(charsScenario1));
        assertArrayEquals(new char[]{'a','3','b','2','1','c','2','C'}, Arrays.copyOf(charsScenario1, 8));

        char[] charsScenario2 = createCharArrayWithSameLetter(1240);
        assertEquals(5, solution.compress(charsScenario2));
        assertArrayEquals(new char[]{'a','1','2','4','0'}, Arrays.copyOf(charsScenario2, 5));

        char[] charsScenario3 = createCharArrayWithSameLetter(999);
        assertEquals(4, solution.compress(charsScenario3));
        assertArrayEquals(new char[]{'a','9','9','9'}, Arrays.copyOf(charsScenario3, 4));

    }

    private char[] createCharArrayWithSameLetter(int length) {
        char[] chars = new char[length];
        Arrays.fill(chars, 'a');
        return chars;
    }
}
