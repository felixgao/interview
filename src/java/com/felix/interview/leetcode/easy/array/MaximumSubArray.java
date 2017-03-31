package com.felix.interview.leetcode.easy.array;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by felix on 1/29/17.
 * 53
 */
public class MaximumSubArray {
    public int maxSubArray(int[] nums) {
        int maxSoFar=nums[0], maxEndsHere=nums[0];
        for(int i = 1; i<nums.length; i++){
            maxEndsHere = Math.max(maxEndsHere+nums[i], nums[i]);
            maxSoFar = Math.max(maxEndsHere, maxSoFar);
        }
        return maxSoFar;
    }
}
