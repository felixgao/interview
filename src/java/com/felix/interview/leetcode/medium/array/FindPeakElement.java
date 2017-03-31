package com.felix.interview.leetcode.medium.array;

/**
 * Created by felix on 2/1/17.
 * 162
 * https://leetcode.com/problems/find-peak-element/
 */
public class FindPeakElement {
    public int findPeakElement(int[] nums) {
        int s = 0, e = nums.length-1;
        return findPeak(nums, s, e);
    }

    private int findPeak(int[]nums, int start, int end){
        if ((end - start) <= 1){
            // return the actual value
//            return Math.max(nums[start], nums[end]);
            //return the index
            return nums[start] > nums[end] ? start : end;
        }
        int midIndex = (start + end)/2;
        int mid = nums[midIndex];
        int left = mid - 1 >= 0 ? nums[mid - 1] : Integer.MIN_VALUE;
        int right = mid + 1 < nums.length ? nums[mid + 1] : Integer.MIN_VALUE;
        if (left > mid){
            return findPeak(nums, start, mid);
        } else {
            return findPeak(nums, mid, end);
        }
    }
}
