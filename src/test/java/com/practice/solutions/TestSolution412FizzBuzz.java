package com.practice.solutions;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSolution412FizzBuzz {

    @Test
    public void testFizzBuzzSolution() {
        Solution_412_FizzBuzz fizzBuzzSolution = new Solution_412_FizzBuzz();

        assertEquals(fizzBuzzSolution.fizzBuzz(3), List.of("1", "2", "Fizz"));
        assertEquals(fizzBuzzSolution.fizzBuzz(5), List.of("1", "2", "Fizz","4", "Buzz"));
        assertEquals(fizzBuzzSolution.fizzBuzz(18), List.of("1", "2", "Fizz","4", "Buzz", "Fizz", "7", "8",
                "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz", "16", "17", "Fizz"));
    }
}
