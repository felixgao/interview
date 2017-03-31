package com.felix.interview.leetcode.medium.binarysearch;

/**
 * Created by felix on 2/25/17.
 * 162
 * https://leetcode.com/problems/find-peak-element/?tab=Description
 */
public class FindPeakElement {
    public int findPeakElement(int[] nums) {
        int lo = 0, hi = nums.length;
        while(lo < hi){
            if(hi - lo <= 1){
                return nums[hi] > nums[lo] ? hi : lo;
            }
            int midIndex = (lo + hi)/2;
            int midValue = nums[midIndex];
            int left  = midIndex - 1 >= 0 ? nums[midIndex-1] : Integer.MIN_VALUE;
            int right = midIndex + 1 < nums.length ? nums[midIndex+1] : Integer.MAX_VALUE;
            if(midValue > right && midValue > left) return midIndex;
            if(midValue < right) lo = midIndex;
            else hi = midIndex - 1;
        }
        return lo;
    }
}
