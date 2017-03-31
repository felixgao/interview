package com.felix.interview.leetcode.hard.array;

/**
 * Created by felix on 2/11/17.
 * One assumption is that the numbers are within the size of the array
 * if the first element is not zero, then we need to find the minimum element first
 * then do the same thing.
 */
public class FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            int val = nums[i];
            nums[i] = nums[val - 1];
            nums[val -1] = val;
        }
        for(int i = 0; i < nums.length; i++){
            int val = nums[i];
            if(i != val-1){
                return val + 1;
            }
        }
        //the last number must be the missing number
        return nums.length;
    }
}
