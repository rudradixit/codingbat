package com.corindiano.codingbat.recursion2;

/**
 * Given an array of ints, is it possible to divide the ints into two groups,
 * so that the sums of the two groups are the same. Every int must be in one
 * group or the other. Write a recursive helper method that takes whatever
 * arguments you like, and make the initial call to your recursive helper
 * from splitArray(). (No loops needed.)
 *
 *
 * splitArray([2, 2]) → true
 * splitArray([2, 3]) → false
 * splitArray([5, 2, 3]) → true
 */
public class SplitArray {
    private boolean _splitArray(int[] nums, int start, int sumA, int sumB) {
        if (start >= nums.length) return (sumA == sumB);

        if (_splitArray(nums, start + 1, sumA + nums[start], sumB)) return true;
        if (_splitArray(nums, start + 1, sumA, sumB + nums[start])) return true;

        return false;
    }

    public boolean splitArray(int[] nums) {
        return _splitArray(nums, 0, 0, 0);
    }
}