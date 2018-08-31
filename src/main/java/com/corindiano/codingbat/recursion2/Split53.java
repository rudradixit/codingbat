package com.corindiano.codingbat.recursion2;

/**
 * Given an array of ints, is it possible to divide the ints into two groups,
 * so that the sum of the two groups is the same, with these constraints: all
 * the values that are multiple of 5 must be in one group, and all the values
 * that are a multiple of 3 (and not a multiple of 5) must be in the other.
 * (No loops needed.)
 *
 * split53([1, 1]) → true
 * split53([1, 1, 1]) → false
 * split53([2, 4, 2]) → true
 */
public class Split53 {
    private boolean isM5 (int n) { return n % 5 == 0; }
    private boolean isM3N5 (int n) { return (n % 5 != 0) && (n % 3 == 0); }

    private boolean _split53(int[] nums, int start, int sumA, int sumB) {
        if (start >= nums.length) return (sumA == sumB);

        int n = nums[start];
        boolean isM = isM5(n) || isM3N5(n);

        if (!isM) {
            if (_split53(nums, start + 1, sumA + n, sumB)) return true;
            if (_split53(nums, start + 1, sumA, sumB + n)) return true;
        } else {
            if (isM5(n)) {
                if (_split53(nums, start + 1, sumA + n, sumB)) return true;
            } else {
                if (_split53(nums, start + 1, sumA, sumB + n)) return true;
            }
        }

        return false;
    }

    public boolean split53(int[] nums) {
        return _split53(nums, 0, 0, 0);
    }
}