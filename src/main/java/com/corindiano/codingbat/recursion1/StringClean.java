package com.corindiano.codingbat.recursion1;

/**
 * Given a string, return recursively a "cleaned" string where adjacent chars that
 * are the same have been reduced to a single char. So "yyzzza" yields "yza".
 *
 * stringClean("yyzzza") → "yza"
 * stringClean("abbbcdd") → "abcd"
 * stringClean("Hello") → "Helo"
 */
class StringClean {
    private String _stringClean(String str, Character prevLastChar) {
        int len = str.length();
        if (len == 1) {
            if (str.charAt(0) == prevLastChar) return "";
            return str;
        }

        int lastIdx = len - 1;
        char lastChar = str.charAt(lastIdx);
        String newStr = str.substring(0, lastIdx);

        if (prevLastChar != null && lastChar == prevLastChar) {
            return _stringClean(newStr, prevLastChar);
        }

        return _stringClean(newStr, lastChar) + lastChar;
    }

    String stringClean(String str) {
        return _stringClean(str, null);
    }
}