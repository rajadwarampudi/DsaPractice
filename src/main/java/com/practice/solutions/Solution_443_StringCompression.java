package com.practice.solutions;

public class Solution_443_StringCompression {

    public int compress(char[] chars) {
        char currentChar = chars[0];
        char currentCharCount = 1;
        char currentUpdatingIndex = 0;

        for (int i = 1; i < chars.length; i++) {
            if (chars[i] != currentChar) {
                chars[currentUpdatingIndex++] = currentChar;
                if (currentCharCount > 1) {
                    for (char ch : Integer.toString(currentCharCount).toCharArray()) {
                        chars[currentUpdatingIndex++] = ch;
                    }
                }
                currentChar = chars[i];
                currentCharCount = 1;
            } else {
                currentCharCount += 1;
            }
        }

        chars[currentUpdatingIndex++] = currentChar;
        if (currentCharCount > 1) {
            for (char ch : Integer.toString(currentCharCount).toCharArray()) {
                chars[currentUpdatingIndex++] = ch;
            }
        }

        return currentUpdatingIndex;
    }
}
