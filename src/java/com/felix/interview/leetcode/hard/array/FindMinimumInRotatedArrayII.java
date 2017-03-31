package com.felix.interview.leetcode.hard.array;

/**
 * Created by felix on 2/5/17.
 * https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/
 * 154
 */
public class FindMinimumInRotatedArrayII {
    public int findMin(int[] nums) {
        int start = 0, end = nums.length-1;
        if(nums[start] < nums[end]){
            return start;
        }
        while(start < end){
            int mid = (start + end)/2;
            if(nums[mid] <= nums[end]){
                end = mid;
            }else{
                start = mid + 1;
            }
        }
        return start;
    }
}
