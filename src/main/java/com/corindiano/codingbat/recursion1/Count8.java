package com.corindiano.codingbat.recursion1;

/**
 * Given a non-negative int n, compute recursively (no loops)
 * the count of the occurrences of 8 as a digit, except that
 * an 8 with another 8 immediately to its left counts double,
 * so 8818 yields 4. Note that mod (%) by 10 yields the rightmost
 * digit (126 % 10 is 6), while divide (/) by 10 removes the
 * rightmost digit (126 / 10 is 12).
 *
 * count8(8) → 1
 * count8(818) → 2
 * count8(8818) → 4
 */
class Count8 {
    private int _count8(int n, boolean hasLeft8) {
        if (n == 0) return 0;

        int m = n % 10;
        int d = n / 10;
        int h = (m == 8) ? (hasLeft8 ? 2 : 1) : 0;

        return h + _count8(d, h != 0);
    }

    int count8(int n) {
        return _count8(n, false);
    }
}