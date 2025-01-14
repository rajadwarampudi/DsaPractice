package com.practice.solutions;

import java.util.*;

public class Solution_1657_DetermineTwoStringsAreClose {
    public boolean closeStrings(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();

        if (len1 != len2) return false;

        Map<Character, Integer> charCountMap1 = new HashMap<>();
        Map<Character, Integer> charCountMap2 = new HashMap<>();

        for (int i = 0; i < len1; i++) {
            charCountMap1.put(word1.charAt(i), charCountMap1.getOrDefault(word1.charAt(i), 0) + 1);
            charCountMap2.put(word2.charAt(i), charCountMap2.getOrDefault(word2.charAt(i), 0) + 1);
        }

        if(!charCountMap1.keySet().equals(charCountMap2.keySet())) return false;

        List<Integer> word1CharCounts = new ArrayList<>(charCountMap1.values());
        Collections.sort(word1CharCounts);
        List<Integer> word2CharCounts = new ArrayList<>(charCountMap2.values());
        Collections.sort(word2CharCounts);

        return word1CharCounts.equals(word2CharCounts);
    }
}
