package com.felix.interview.leetcode.medium.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by felix on 3/9/17.
 * 78
 * https://leetcode.com/problems/subsets/?tab=Description
 */
public class Subset {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> accum = new ArrayList<>();
        backtrackSubset(nums, 0, result, accum);
        return result;
    }

    private void backtrackSubset(int[] nums, int idx, List<List<Integer>> result, List<Integer> accum) {
        result.add(new ArrayList<>(accum));

        for(int i = idx; i < nums.length; i++){
            accum.add(nums[i]);
            backtrackSubset(nums, i + 1, result, accum);
            accum.remove(accum.size() - 1);
        }

    }
}
