package com.felix.interview.leetcode.medium.array;

/**
 * Created by felix on 2/2/17.
 */
public class FindMinRotatedArray {
    public int findMin(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        int start = 0, end = nums.length-1;
        while(start < end){
            if(nums[start] < nums[end]){
                return start;
            }
            int mid = (start + end)/2;
            if(nums[start] < nums[mid]){
                start = mid + 1;
            }else{
                end = mid;
            }
        }
        return start;
    }
}
