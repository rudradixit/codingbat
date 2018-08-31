package com.corindiano.codingbat.recursion1;

/**
 * Given a string, compute recursively the number of times lowercase "hi" appears
 * in the string, however do not count "hi" that have an 'x' immedately before them.
 *
 * countHi2("ahixhi") → 1
 * countHi2("ahibhi") → 2
 * countHi2("xhixhi") → 0
 */
class CountHi2 {
    int countHi2(String str) {
        int len = str.length();
        if (len <= 1) return 0;
        if (len == 2) return "hi".equals(str) ? 1 : 0;

        String threeChars = str.substring(0, 3);

        if ("xhi".equals(threeChars)) {
            return countHi2(str.substring(2));
        }

        String twoChars = str.substring(0, 2);

        if ("hi".equals(twoChars)) {
            return 1 + countHi2(str.substring(2));
        }

        return countHi2(str.substring(1));
    }
}