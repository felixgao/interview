package com.felix.interview.leetcode.medium.array;

/**
 * Created by felix on 2/2/17.
 * the array may contains duplicates
 */
public class SearchRotatedArrayII {
    public boolean search(int[] nums, int target) {
        return contains(nums, 0, nums.length -1, target);
    }

    private boolean contains(int[] nums, int start, int end, int target){
        if(start > end) return false;

        while(start <= end) {

            int mid = (start + end) / 2;
            if (nums[mid] == target) return true;
            //start < mid, then start .. mid is sorted
            if(nums[start] < nums[mid]){
                // [start .. target .. mid]
                if(nums[start] <= target && target < nums[mid] ){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            // start > mid then mid .. end is in order
            } else if ( nums[start] > nums[mid] ){
                //[mid .. target .. end]
                if (nums[mid] < target && target <= nums[end]){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            } else {
                start++;
            }
        }
        return false;
    }
}
