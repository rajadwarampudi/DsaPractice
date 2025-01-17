package com.practice.solutions.puzzles;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSolution1431GreatestNumberOfCandies {

    @Test
    public void testFizzBuzzSolution() {
        Solution_1431_GreatestNumberOfCandies solution = new Solution_1431_GreatestNumberOfCandies();

        assertEquals(List.of(false, false, false, true, true), solution.kidsWithCandies(new int[]{1, 2, 3, 4, 5}, 2));
        assertEquals(List.of(false, false, false, false, true), solution.kidsWithCandies(new int[]{100, 100, 100, 100, 102}, 1));
    }
}
