package com.felix.interview.leetcode.hard.array;

/**
 * Created by felix on 2/8/17.
 */
public class JumpGameII {
    public int jump(int[] nums) {
        int steps = 0, currentJumps = 0, nextJumps = 0;
        for(int i = 0; i < nums.length; i++){
            if (i - 1 == currentJumps){
                steps++;
                currentJumps = nextJumps;
            }
            nextJumps = Math.max(nextJumps, i+nums[i]);
        }
        return steps;
    }
}
