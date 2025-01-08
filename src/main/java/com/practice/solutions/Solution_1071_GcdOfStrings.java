package com.practice.solutions;

public class Solution_1071_GcdOfStrings {
    /**
     * returns the GCD of string as per following condition
     * For two strings s and t, we say "t divides s"
     * if and only if s = t + t + t + ... + t + t (i.e., t is concatenated with itself one or more times).
     * Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.
     * @param str1
     * @param str2
     * @return a string result of gcd of strings
     */
    public String gcdOfStrings(String str1, String str2) {
        if ((str1 + str2).equals(str2 + str1)) {
            return str1.substring(0, gcd(str1.length(), str2.length()));
        }

        return "";
    }

    private int gcd(int a, int b) {
        if (a == 0) return b;

        return gcd(b % a, a);
    }
}
