package com.felix.interview.leetcode.hard.dp;

/**
 * Created by felix on 2/28/17.
 * 312
 * https://leetcode.com/problems/burst-balloons/?tab=Description
 */
public class BurstBalloons {
    public int maxCoins(int[] nums) {
        //creating a new array without zero ballons
        int[] positiveNums = new int[nums.length + 2];
        int n = 1;
        for(int x : nums) if(x > 0) positiveNums[n++] = x;
        positiveNums[0] = positiveNums[n++] = 1; //add the boundry coin

        int[][] memo = new int[n][n];
        return burst(positiveNums, memo, 0, n - 1);
    }

    private int burst(int[] nums, int[][] memo, int left, int right) {
        if(left + 1 == right) return 0; // we have reached the dummy element at the end
        if(memo[left][right] > 0) return memo[left][right]; // we have encountered a memorized cell
        int ans = 0;
        for(int i = left + 1; i < right; i++){
            ans = Math.max(
                    ans, //
                    nums[left]*nums[i]*nums[right]
                    + burst(nums, memo, left, i)
                    + burst(nums, memo, i, right)
                    );
        }
        memo[left][right] = ans;
        return ans;
    }
}
