package com.corindiano.codingbat.recursion1;

/**
 * Given a string and a non-empty substring sub, compute recursively
 * the largest substring which starts and ends with sub and return its length.
 *
 *
 * strDist("catcowcat", "cat") → 9
 * strDist("catcowcat", "cow") → 3
 * strDist("cccatcowcatxx", "cat") → 9
 */
class StrDist {
    int strDist(String str, String sub) {
        if (str.isEmpty()) return 0;

        int len = str.length();
        int lenS = sub.length();

        if (lenS > len) return 0;

        if (str.substring(0, lenS).equals(sub)) {
            if (str.substring(len - lenS, len).equals(sub)) {
                return len;
            }

            return strDist(str.substring(0, len - 1), sub);
        }

        return (strDist(str.substring(1), sub));
    }
}