package com.corindiano.codingbat.recursion1;

/**
 * Given a string, compute recursively (no loops) the number of "11"
 * substrings in the string. The "11" substrings should not overlap.
 *
 * count11("11abc11") → 2
 * count11("abc11x11x11") → 3
 * count11("111") → 1
 */
class Count11 {
    int count11(String str) {
        int len = str.length();

        if (len <= 1) return 0;

        boolean has11 = "11".equals(str.substring(0, 2));

        if (has11) {
            String newStr = (len == 2)? "" : str.substring(2);
            return 1 + count11(newStr);
        } else {
            return count11(str.substring(1));
        }
    }
}