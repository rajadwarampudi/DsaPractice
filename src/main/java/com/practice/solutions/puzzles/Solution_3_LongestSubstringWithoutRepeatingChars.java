package com.practice.solutions.puzzles;

import java.util.HashMap;
import java.util.Map;

public class Solution_3_LongestSubstringWithoutRepeatingChars {
    public int lengthOfLongestSubstring(String s) {
        int resultLength = 0;

        int sIdx = 0, idx = 0;

        Map<Character, Integer> charIndexMap = new HashMap<>();

        int tempLength = 0;

        while (idx < s.length()) {
            char currentChar  = s.charAt(idx);
            if (charIndexMap.containsKey(currentChar)) {
                resultLength = Math.max(resultLength, tempLength);

                sIdx = Math.max(sIdx, charIndexMap.get(currentChar));
                charIndexMap.put(currentChar, idx);
                tempLength = idx - sIdx;
            } else {
                charIndexMap.put(currentChar, idx);
                tempLength++;
            }
            idx++;
        }

        resultLength = Math.max(resultLength, tempLength);

        return resultLength;
    }
}
