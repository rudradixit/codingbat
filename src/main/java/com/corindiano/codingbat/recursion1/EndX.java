package com.corindiano.codingbat.recursion1;

/**
 * Given a string, compute recursively a new string where all the
 * lowercase 'x' chars have been moved to the end of the string.
 *
 * endX("xxre") → "rexx"
 * endX("xxhixx") → "hixxxx"
 * endX("xhixhix") → "hihixxx"
 */
class EndX {
    private String _endX(String str, int start, int end) {
        int len = str.length();

        if (len <= 1) return str;
        if (start > end) return str;

        char c = str.charAt(start);

        if (c == 'x') {
            String newStr =
                str.substring(0, start) +
                    str.substring(start + 1) +
                    c;

            return _endX(newStr, start, end - 1);
        } else {
            return _endX(str, start + 1, end);
        }
    }

    String endX(String str) {
        return _endX(str, 0, str.length() - 1);
    }
}