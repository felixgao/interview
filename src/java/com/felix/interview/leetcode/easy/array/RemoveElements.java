package com.felix.interview.leetcode.easy.array;

/**
 * Created by felix on 1/29/17.
 * 27
 */
public class RemoveElements {
    public int removeElement(int[] nums, int val) {
        int valIndex = 0, size = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] != val){
                size++;
                int t = nums[valIndex];
                nums[valIndex] = nums[i];
                nums[i] = t;
                valIndex++;
            }
        }
        return size;
    }
}
