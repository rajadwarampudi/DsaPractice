package com.practice.solutions;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSolution412FizzBuzz {

    @Test
    public void testFizzBuzzSolution() {
        Solution_412_FizzBuzz fizzBuzzSolution = new Solution_412_FizzBuzz();

        assertEquals(List.of("1", "2", "Fizz"), fizzBuzzSolution.fizzBuzz(3));
        assertEquals(List.of("1", "2", "Fizz","4", "Buzz"), fizzBuzzSolution.fizzBuzz(5));
        assertEquals(List.of("1", "2", "Fizz","4", "Buzz", "Fizz", "7", "8",
                "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz", "16", "17", "Fizz"), fizzBuzzSolution.fizzBuzz(18));
    }
}
