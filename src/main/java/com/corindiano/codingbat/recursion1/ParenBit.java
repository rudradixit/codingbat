package com.corindiano.codingbat.recursion1;

/**
 * Given a string that contains a single pair of parenthesis, compute
 * recursively a new string made of only of the parenthesis and their
 * contents, so "xyz(abc)123" yields "(abc)".
 *
 * parenBit("xyz(abc)123") → "(abc)"
 * parenBit("x(hello)") → "(hello)"
 * parenBit("(xy)1") → "(xy)"
 */
class ParenBit {
    private String _parentBit(String str, int idx) {
        int len = str.length();

        if (idx >= len) return "";

        char c = str.charAt(idx);

        if (c != '(' && c != ')')
            return _parentBit(str, idx + 1);

        if (c == '(') {
            String newStr = str.substring(idx);
            return _parentBit(newStr, 1);
        }

        if (c == ')') {
            return str.substring(0, idx + 1);
        }

        return "";
    }

    String parenBit(String str) {
        return _parentBit(str, 0);
    }
}