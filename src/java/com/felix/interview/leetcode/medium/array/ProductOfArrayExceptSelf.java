package com.felix.interview.leetcode.medium.array;

import java.util.Arrays;

/**
 * Created by felix on 1/30/17.
 * 238
 * https://leetcode.com/problems/product-of-array-except-self/
 *
 *
 Given an array of n integers where n > 1, nums, return an array output such that output[i] is equal to
 the product of all the elements of nums except nums[i].

 Solve it without division and in O(n).

 For example, given [1,2,3,4], return [24,12,8,6]
 */
public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums){
        int[] result = new int[nums.length];
        Arrays.fill(result, 1);
        //fill result[i] equals the previous with [1, nums[0]*1, nums[0}*nums[1], ... nums[0]*...*nums[n-1]]
        // all the multiples except the last element
        //ex. [1, 1, 2, 6]
        for(int i=1; i < nums.length; i++) {
            result[i] = result[i-1] * nums[i-1];
        }
        //multiple it backward, since we primed result[0] with 1 the first loop does nothing
        //then we updated result[0] with the actual value of all the numbers in the array multiplied
        for(int i=nums.length-1; i>0; i--){
            result[i] *= result[0];
            result[0] *= nums[i];
        }
        return result;
    }
}
