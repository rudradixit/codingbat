package com.corindiano.codingbat.recursion1;

/**
 * Given a string and a non-empty substring sub, compute recursively the number of times that sub appears in the string, without the sub strings overlapping.
 *
 *
 * strCount("catcowcat", "cat") → 2
 * strCount("catcowcat", "cow") → 1
 * strCount("catcowcat", "dog") → 0
 */
class StrCount {
    int strCount(String str, String sub) {
        int len = str.length();
        int lenSub = sub.length();
        if (len == 0) return 0;
        if (lenSub > len) return 0;

        String initial = str.substring(0, lenSub);
        String newStr;

        if (initial.equals(sub)) {
            newStr = str.substring(lenSub);
            return 1 + strCount(newStr, sub);
        } else {
            newStr = str.substring(1);
            return strCount(newStr, sub);
        }
    }
}