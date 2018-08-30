package com.corindiano.codingbat.recursion1;

/**
 * Given a string, compute recursively (no loops) a new string where all appearances
 * of "pi" have been replaced by "3.14".
 *
 *
 * changePi("xpix") → "x3.14x"
 * changePi("pipi") → "3.143.14"
 * changePi("pip") → "3.14p"
 */
class ChangePi {
    private String _changePi(String str, int idx) {
        int len = str.length();

        if (len <= 1) return str;
        if (idx >= len - 1) return str;

        char f = str.charAt(idx);
        char s = str.charAt(idx + 1);
        boolean hasPi = (f == 'p' && s == 'i');

        if (hasPi) {
            String newStr = (idx + 2) >= len ? "" : str.substring(idx + 2);
            return str.substring(0, idx) + "3.14" + _changePi(newStr, 0);
        }

        return _changePi(str, idx + 1);
    }

    String changePi(String str) {
        return _changePi(str, 0);
    }
}