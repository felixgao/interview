package com.felix.interview.leetcode.medium.dp;

/**
 * Created by felix on 3/4/17.
 * 213
 * https://leetcode.com/problems/house-robber-ii/?tab=Description
 */
public class HouseRobberII {
    public int rob(int[] nums) {
        return Math.max(
                //include the first house
                robInStright(nums, 0, nums.length-2),
                //does not include the first house
                robInStright(nums, 1, nums.length-1)
        );
    }

    private int robInStright(int[] nums, int start, int end){
        int rob = 0, notRob = 0;
        for(int i = start; i <= end; i++){
            int curRob = notRob + nums[i];
            notRob = Math.max(rob, notRob);
            rob = curRob;
        }
        return Math.max(rob, notRob);
    }
}
