package com.felix.interview.leetcode.easy.array;

/**
 * Created by felix on 1/27/17.
 * 189
 * O(k*n)
 */
public class RotateArray {
    public void rotate(int[] nums, int k) {
        if (nums == null) return;
        while(k > 0){
            int save = nums[nums.length-1];
            for(int i = nums.length-1; i > 0; i--){
                nums[i] = nums[i-1];
            }
            nums[0] = save;
            k--;
        }
    }
}
