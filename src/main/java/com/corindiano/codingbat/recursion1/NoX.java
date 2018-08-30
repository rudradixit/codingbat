package com.corindiano.codingbat.recursion1;

/**
 * Given a string, compute recursively a new string where all the 'x' chars have been removed.
 *
 *
 * noX("xaxb") → "ab"
 * noX("abc") → "abc"
 * noX("xx") → ""
 */
public class NoX {
    private String _noX(String str, int idx) {
        int len = str.length();

        if (idx >= len) return str;
        if (len == 0) return "";

        char c = str.charAt(idx);

        if (c == 'x') {
            String newStr = str.substring(0, idx);
            newStr += (idx + 1) >= len ? "" : str.substring(idx + 1);

            return _noX(newStr, 0);
        }

        return _noX(str, idx + 1);
    }

    String noX(String str) {
        return _noX(str, 0);
    }
}