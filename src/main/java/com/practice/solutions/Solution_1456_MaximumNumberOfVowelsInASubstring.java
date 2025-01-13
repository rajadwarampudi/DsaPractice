package com.practice.solutions;

import java.util.Set;

public class Solution_1456_MaximumNumberOfVowelsInASubstring {

    public int maxVowels(String s, int k) {
        int maxVowelCount = 0;

        Set<Character> vowelSet = Set.of('a','e','i','o','u');

        int tempVowelCount = 0;
        int idx = 0;
        while(idx < k) {
            if (vowelSet.contains(s.charAt(idx))) {
                tempVowelCount += 1;
            }
            idx++;
        }

        maxVowelCount = Math.max(tempVowelCount, maxVowelCount);

        while (idx < s.length()) {
            if (vowelSet.contains(s.charAt(idx))) {
                tempVowelCount += 1;
            }
            if (vowelSet.contains(s.charAt(idx - k))) {
                tempVowelCount -= 1;
            }
            maxVowelCount = Math.max(tempVowelCount, maxVowelCount);
            idx++;
        }

        return maxVowelCount;
    }
}
