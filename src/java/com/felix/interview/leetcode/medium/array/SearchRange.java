package com.felix.interview.leetcode.medium.array;

import java.util.Arrays;

/**
 * Created by felix on 2/4/17.
 * 34
 * https://leetcode.com/problems/search-for-a-range/
 */
public class SearchRange {
    public int[] searchRange(int[] nums, int target) {
        int start = 0, end = nums.length-1;
        int[] res = new int[2];
        Arrays.fill(res, -1);
        //find the left most index of the target
        while(start < end){
            //look at the right
            int mid = (start+end)/2;
            if(nums[mid] < target){
                start = mid + 1;
            } else { // it is in the left
                end = mid;
            }
        }
        if(nums[start] != target) return res;
        res[0] = start;
        //find the right most index of the target
        end = nums.length-1;
        while(start < end){
            int mid = (start+end)/2;
            if(nums[mid] <= target){
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        res[1]=start-1;
        return res;
    }
}
