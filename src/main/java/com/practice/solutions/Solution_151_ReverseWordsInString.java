package com.practice.solutions;

public class Solution_151_ReverseWordsInString {
    public String reverseWords(String s) {
            StringBuilder sb = new StringBuilder();

            s = s.trim();

            String[] words = s.split("\\s+");

            for(int i = words.length - 1; i > 0; i--) {
                String word = words[i].trim();
                if (word.isEmpty()) continue;
                sb.append(word).append(" ");
            }
            String word = words[0].trim();
            sb.append(word);

            return sb.toString();
        }
    }
