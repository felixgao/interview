package com.felix.interview.leetcode.easy.array;

/**
 * Created by felix on 1/27/17.
 */
public class MaxConsecutiveOnes {
    static final int ONE = 1;
    public int findMaxConsecutiveOnes(int[] nums) {
        if(nums == null) return 0;
        int max = 0, maxSoFar=0;
        for(int n : nums) {
            if (ONE == n) {
                maxSoFar++;
            } else {
                maxSoFar = 0;
            }
            max = Math.max(max, maxSoFar);
        }
        return max;
    }
}
