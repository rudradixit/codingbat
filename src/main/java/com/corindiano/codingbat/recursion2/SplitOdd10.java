package com.corindiano.codingbat.recursion2;

/**
 * Given an array of ints, is it possible to divide the ints into two groups,
 * so that the sum of one group is a multiple of 10, and the sum of the other
 * group is odd. Every int must be in one group or the other. Write a recursive
 * helper method that takes whatever arguments you like, and make the initial
 * call to your recursive helper from splitOdd10(). (No loops needed.)
 *
 * splitOdd10([5, 5, 5]) → true
 * splitOdd10([5, 5, 6]) → false
 * splitOdd10([5, 5, 6, 1]) → true
 */
public class SplitOdd10 {
    private boolean isM10 (int n) { return n % 10 == 0; }
    private boolean isOdd (int n) { return n % 2 == 1; }

    private boolean _splitOdd10(int[] nums, int start, int sumA, int sumB) {
        if (start >= nums.length) return (
            (isM10(sumA) && isOdd(sumB)) ||
                (isM10(sumB) && isOdd(sumA))
        );

        if (_splitOdd10(nums, start + 1, sumA + nums[start], sumB)) return true;
        if (_splitOdd10(nums, start + 1, sumA, sumB + nums[start])) return true;

        return false;
    }

    public boolean splitOdd10(int[] nums) {
        return _splitOdd10(nums, 0, 0, 0);
    }
}