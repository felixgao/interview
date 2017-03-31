package com.felix.interview.leetcode.medium.array;

/**
 * Created by felix on 2/4/17.
 */
public class SearchRotatedArray {
    public int search(int[] nums, int target) {
        int start = 0, end = nums.length-1, rot = start;

        //if we have a rotation
        if(nums[start] > nums[end]) {
            while (start < end) {
                int mid = (start + end) / 2;
                if(nums[mid] > nums[end]){
                    start = mid + 1;
                }else{
                    end = mid;
                }
            }
            rot = start;
        }
        start = 0;
        end = nums.length-1;
        //use the rotation to find the target we are looking for
        while(start <= end){
            int mid =  (start + end) / 2;
            int realMid = (mid + rot) % nums.length;
            if(nums[realMid] == target){
                return realMid;
            }
            if(target > nums[realMid]){
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return -1;
    }
}
