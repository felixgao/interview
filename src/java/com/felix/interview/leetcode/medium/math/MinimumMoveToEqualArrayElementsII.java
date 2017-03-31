package com.felix.interview.leetcode.medium.math;

import java.util.Arrays;

/**
 * Created by felix on 2/13/17.
 * 462
 * https://leetcode.com/problems/minimum-moves-to-equal-array-elements-ii/
 *
 */
public class MinimumMoveToEqualArrayElementsII {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        int i = 0, j = nums.length-1;
        while(i < j){
            count += nums[j] - nums[i];
            i++;
            j--;
        }
        return count;
    }
}
