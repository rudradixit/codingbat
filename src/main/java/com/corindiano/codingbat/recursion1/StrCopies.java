package com.corindiano.codingbat.recursion1;

/**
 * Given a string and a non-empty substring sub, compute recursively
 * if at least n copies of sub appear in the string somewhere,
 * possibly with overlapping. N will be non-negative.
 *
 *
 * strCopies("catcowcat", "cat", 2) → true
 * strCopies("catcowcat", "cow", 2) → false
 * strCopies("catcowcat", "cow", 1) → true
 */
class StrCopies {
    private int _strCopies(String str, String sub) {
        int len = str.length();
        int lenS = sub.length();

        if (len == 0) return 0;
        if (lenS > len) return 0;

        String init = str.substring(0, lenS);

        if (init.equals(sub)) {
            return 1 + _strCopies(str.substring(1), sub);
        }

        return _strCopies(str.substring(1), sub);
    }

    boolean strCopies(String str, String sub, int n) {
        int results = _strCopies(str, sub);

        return n <= results;
    }
}