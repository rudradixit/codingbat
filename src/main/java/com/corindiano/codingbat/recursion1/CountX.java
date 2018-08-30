package com.corindiano.codingbat.recursion1;

/**
 * Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the string.
 *
 *
 * countX("xxhixx") → 4
 * countX("xhixhix") → 3
 * countX("hi") → 0
 */
class CountX {
    public int countX(String str) {
        if (str.isEmpty()) return 0;

        int len = str.length();
        int first = str.charAt(0);
        String newStr = (len == 1) ? "" : str.substring(1);
        int h = (first == 'x') ? 1 : 0;

        return h + countX(newStr);
    }
}