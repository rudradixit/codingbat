package com.corindiano.codingbat.recursion1;

/**
 * Given a string, compute recursively a new string where identical chars
 * that are adjacent in the original string are separated from each other by a "*".
 *
 * pairStar("hello") → "hel*lo"
 * pairStar("xxyy") → "x*xy*y"
 * pairStar("aaaa") → "a*a*a*a"
 */
class PairStar {
    private String _pairStar(String str, int idx) {
        int len = str.length();

        if (len <= 1) return str;
        if (idx >= len - 1) return str;

        char c = str.charAt(idx);
        boolean h = str.charAt(idx + 1) == c;

        if (!h) {
            return _pairStar(str, idx + 1);
        } else {
            String sub = c + "*";
            return
                str.substring(0, idx) +
                    sub +
                    _pairStar(str.substring(idx + 1), 0);
        }
    }

    String pairStar(String str) {
        return _pairStar(str, 0);
    }

}