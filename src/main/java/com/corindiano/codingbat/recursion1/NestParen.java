package com.corindiano.codingbat.recursion1;

/**
 * Given a string, return true if it is a nesting of zero or more
 * pairs of parenthesis, like "(())" or "((()))". Suggestion: check
 * the first and last chars, and then recur on what's inside them.
 *
 * nestParen("(())") → true
 * nestParen("((()))") → true
 * nestParen("(((x))") → false
 */
class NestParen {
    boolean nestParen(String str) {
        int len = str.length();

        if (len == 0) return true;
        if (len == 1) return false;

        char f = str.charAt(0);
        char l = str.charAt(len - 1);

        if (f == '(' && l == ')') {
            return nestParen(str.substring(1, len - 1));
        }

        return false;
    }

}