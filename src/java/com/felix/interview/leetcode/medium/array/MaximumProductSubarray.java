package com.felix.interview.leetcode.medium.array;

/**
 * Created by felix on 2/2/17.
 * THIS SOLUTION ONLY WORKS FOR SINGLE NEGATIVE NUMBERS
 */
public class MaximumProductSubarray {
    public int maxProduct(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        int maxHerePrevious = nums[0], minHerePrevious = nums[0];
        int maxHere = 0, minHere = 0;
        int maxSoFar = nums[0];

        for(int i = 1; i < nums.length; i++){
            maxHere = Math.max(Math.max(maxHere * nums[i], maxHerePrevious * nums[i]), nums[i]);
            minHere = Math.min(Math.min(minHere * nums[i], minHerePrevious * nums[i]), nums[i]);
            maxSoFar = Math.max(maxHere, maxSoFar);
            maxHerePrevious = maxHere;
            minHerePrevious = minHere;
        }
        return maxSoFar;
    }
}
