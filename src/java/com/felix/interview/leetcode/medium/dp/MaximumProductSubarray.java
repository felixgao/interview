package com.felix.interview.leetcode.medium.dp;

/**
 * Created by felix on 3/4/17.
 * 152
 * https://leetcode.com/problems/maximum-product-subarray/?tab=Description
 */
public class MaximumProductSubarray {
    public int maxProduct(int[] nums) {
        if(nums == null) return 0;
        int ans = nums[0];

        for(int i = 1, maxSoFar = ans, minSoFar = ans; i < nums.length; i++){

            //with a negative number maxSoFar become minSoFar, and vice versa.
            if(nums[i] < 0){
                int temp = maxSoFar;
                maxSoFar = minSoFar;
                minSoFar = temp;
            }

            maxSoFar = Math.max(nums[i], maxSoFar * nums[i]);
            minSoFar = Math.min(nums[i], minSoFar * nums[i]);

            ans = Math.max(maxSoFar, ans);
        }

        return ans;
    }
}
