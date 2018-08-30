package com.corindiano.codingbat.recursion1;

/**
 * We'll say that a "pair" in a string is two instances of a char separated
 * by a char. So "AxA" the A's make a pair. Pair's can overlap, so "AxAxA"
 * contains 3 pairs -- 2 for A and 1 for x. Recursively compute the number
 * of pairs in the given string.
 *
 * countPairs("axa") → 1
 * countPairs("axax") → 2
 * countPairs("axbx") → 1
 */
class CountPairs {
    public int countPairs(String str) {
        int len = str.length();

        if (len < 3) return 0;

        char f = str.charAt(0);
        char t = str.charAt(2);
        int count = (f == t) ? 1 : 0;

        return count + countPairs(str.substring(1));
    }
}