package com.corindiano.codingbat.recursion1;

/**
 * Given a non-negative int n, return the count of the occurrences of 7 as a
 * digit, so for example 717 yields 2. (no loops). Note that mod (%) by 10
 * yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes
 * the rightmost digit (126 / 10 is 12).
 *
 * count7(717) → 2
 * count7(7) → 1
 * count7(123) → 0
 */
class Count7 {
    int count7(int n) {
        if (n == 0) return 0;

        int m = n % 10;
        int d = n / 10;
        int count7 = (m == 7) ? 1 : 0;

        return count7 + count7(d);
    }
}