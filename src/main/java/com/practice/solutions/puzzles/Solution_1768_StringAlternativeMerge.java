package com.practice.solutions.puzzles;

public class Solution_1768_StringAlternativeMerge {

    /**
     * Merge two strings by alternative characters from each. append the leftovers at the end.
     * @param word1
     * @param word2
     * @return  a string the is made of merging word1 and word2's alternative characters
     */

    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while(i < word1.length() && i < word2.length()) {
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
            i++;
        }

        if (i == word1.length()) {
            sb.append(word2, i, word2.length());
        } else {
            sb.append(word1, i, word1.length());
        }
        return sb.toString();
    }
}
