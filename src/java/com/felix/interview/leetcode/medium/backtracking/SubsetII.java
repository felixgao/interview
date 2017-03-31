package com.felix.interview.leetcode.medium.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by felix on 3/8/17.
 * https://leetcode.com/problems/subsets-ii/?tab=Description
 * 90
 */
public class SubsetII {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> accum = new ArrayList<>();
        backtrackSubsetWithDup(nums, 0, result, accum);
        return result;
    }

    private void backtrackSubsetWithDup(int[] nums, int pos, List<List<Integer>> result, List<Integer> accum) {
        if(pos <= nums.length){
            result.add(new ArrayList<>(accum));
        }
        int i = pos;
        while(i < nums.length){
            accum.add(nums[i]);
            backtrackSubsetWithDup(nums, i+1, result, accum);
            accum.remove(accum.size()-1);
            i++;
            while (i < nums.length && nums[i] == nums[i - 1]) {i++;}
        }

    }
}
