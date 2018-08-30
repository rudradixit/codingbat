package com.corindiano.codingbat.recursion1;

/**
 * Given a string, compute recursively (no loops) the number of times lowercase "hi" appears in the string.
 *
 *
 * countHi("xxhixx") → 1
 * countHi("xhixhix") → 2
 * countHi("hi") → 1
 */
class CountHi {
    int countHi(String str) {
        int len = str.length();

        if (len <= 1) return 0;

        char f = str.charAt(0);
        char s = str.charAt(1);
        int h = (f == 'h' && s == 'i') ? 1 : 0;
        int substrIdx = (h == 1) ? 2 : 1;
        String newStr = str.substring(substrIdx);

        return h + countHi(newStr);
    }
}