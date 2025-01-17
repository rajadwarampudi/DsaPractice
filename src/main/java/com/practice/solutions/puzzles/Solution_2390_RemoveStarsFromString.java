package com.practice.solutions.puzzles;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution_2390_RemoveStarsFromString {
    public String removeStars(String s) {
        Deque<Character> charsStack = new ArrayDeque<>();

        for (char ch : s.toCharArray()) {
            if(ch == '*') {
                if (charsStack.peek() != null) {
                    charsStack.pop();
                }
            } else {
                charsStack.push(ch);
            }
        }

        StringBuilder sb = new StringBuilder();
        while (charsStack.peekLast() != null) {
            sb.append(charsStack.pollLast());
        }

        return sb.toString();
    }
}
