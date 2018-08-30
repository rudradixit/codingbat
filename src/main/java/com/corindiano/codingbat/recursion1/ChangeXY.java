package com.corindiano.codingbat.recursion1;

/**
 * Given a string, compute recursively (no loops) a new
 * string where all the lowercase 'x' chars have been
 * changed to 'y' chars.
 *
 * changeXY("codex") → "codey"
 * changeXY("xxhixx") → "yyhiyy"
 * changeXY("xhixhix") → "yhiyhiy"
 */
class ChangeXY {
    String changeXY(String str) {
        int len = str.length();

        if (len == 0) return "";

        char c = str.charAt(0);
        char newC = (c == 'x') ? 'y' : c;
        String newStr = (len == 1) ? "" : str.substring(1);

        return newC + changeXY(newStr);
    }
}