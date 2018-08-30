package com.corindiano.codingbat.recursion1;

/**
 * Count recursively the total number of "abc" and "aba" substrings that appear in the given string.
 *
 *
 * countAbc("abc") → 1
 * countAbc("abcxxabc") → 2
 * countAbc("abaxxaba") → 2
 */
class CountAbc {
    int countAbc(String str) {
        int len = str.length();

        if (len < 3) return 0;

        String threeChars = str.substring(0, 3);
        boolean hasAbc = "abc".equals(threeChars);
        boolean hasAba = "aba".equals(threeChars);

        if (hasAbc || hasAba) {
            return 1 + countAbc(str.substring(2));
        } else {
            return countAbc(str.substring(1));
        }
    }
}