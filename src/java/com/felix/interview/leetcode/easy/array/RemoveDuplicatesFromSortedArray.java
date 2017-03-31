package com.felix.interview.leetcode.easy.array;

/**
 * Created by felix on 1/29/17.
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 * 26
 */
public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        if(nums.length < 2) return nums.length;
        int uniqueCounts = 1;
        for(int i = 1; i<nums.length; i++){
            //if the previous number is not the same as current one
            if(nums[i] != nums[i-1]){
                //assign the position where last uniqueCounts is to the current value.
                //then increment unique counts by 1
                nums[uniqueCounts++] = nums[i];
            }
        }
        return uniqueCounts;
    }
}
