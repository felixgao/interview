package com.felix.interview.leetcode.easy.array;

/**
 * Created by felix on 1/29/17.
 */
public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int low =0, high = nums.length-1;
        while(low <= high){
            int mid = (low+high)/2;
            if(target == nums[mid]){
                return mid;
            }else if(nums[mid] > target){
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}
