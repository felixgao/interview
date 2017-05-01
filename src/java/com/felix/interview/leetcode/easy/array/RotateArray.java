package com.felix.interview.leetcode.easy.array;

/**
 * 189
 * Rotate an array of n elements to the right by k steps.

 For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
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
