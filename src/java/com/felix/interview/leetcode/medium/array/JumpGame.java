package com.felix.interview.leetcode.medium.array;

/**
 * Created by felix on 2/4/17.
 * 55
 * https://leetcode.com/problems/jump-game/
 *
 */
public class JumpGame {
    public boolean canJump(int[] nums) {
        boolean result = true;
        int zeroCount = 0;
        for(int i = nums.length-1; i >= 0; i--){
            if(nums[i] == 0){
                zeroCount++;
                continue;
            }
            if(zeroCount - nums[i] >= 0){
                result = false;
            }else{
                result = true;
                zeroCount=0;
            }
            if(zeroCount > 0) zeroCount++;
        }
        return result;
    }

    public boolean canJumpOptimized(int A[]) {
        int i = 0;
        int n = A.length;
        for (int reach = 0; i < n && i <= reach; ++i)
            reach = Math.max(i + A[i], reach);
        return i == n;
    }
}
