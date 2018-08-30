package com.corindiano.codingbat.recursion1;

/**
 * Given a non-negative int n, return the sum of its digits
 * recursively (no loops). Note that mod (%) by 10 yields the
 * rightmost digit (126 % 10 is 6), while divide (/) by 10
 * removes the rightmost digit (126 / 10 is 12).
 *
 * sumDigits(126) → 9
 * sumDigits(49) → 13
 * sumDigits(12) → 3
 */
class SumDigits {
    int sumDigits(int n) {
        if (n == 0) return 0;

        int m = n % 10;
        int d = n / 10;

        return m + sumDigits(d);
    }
}