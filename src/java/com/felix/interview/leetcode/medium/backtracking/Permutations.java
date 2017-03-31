package com.felix.interview.leetcode.medium.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by felix on 3/6/17.
 * 46
 * https://leetcode.com/problems/permutations/?tab=Description
 */
public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        backtrackPermutation(ans, new ArrayList<>(), nums, 0);
        return ans;
    }

    private void backtrackAllSubset(List<List<Integer>> ans, List<Integer> save, int[] nums, int start) {
        ans.add(new ArrayList<>(save));
        for(int i = start; i < nums.length; i++){
            save.add(nums[i]);
            backtrackAllSubset(ans, save, nums, start+1);
            save.remove(save.size()-1);
        }
    }

    private void backtrackPermutation(List<List<Integer>> ans, List<Integer> save, int[] nums, int start){
        if(save.size() == nums.length){
            ans.add(new ArrayList<>(save));
        }else {
            for (int i = start; i < nums.length; i++) {
                if(save.contains(nums[i])) continue;
                save.add(nums[i]);
                backtrackPermutation(ans, save, nums, start);
                save.remove(save.size() - 1);
            }
        }
    }
}
