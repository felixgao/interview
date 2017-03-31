package com.felix.interview.leetcode.medium.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by felix on 3/6/17.
 * 47
 * https://leetcode.com/problems/permutations-ii/?tab=Description
 */
public class PermutationsII {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        boolean[] used = new boolean[nums.length];
        backtrackPermutation(ans, new ArrayList<>(), nums, 0, used);
        return ans;
    }

    private void backtrackPermutation(List<List<Integer>> ans, List<Integer> temp, int[] nums, int start, boolean[] used) {
        if(temp.size() == nums.length){
            ans.add(new ArrayList<>(temp));
        } else {
            for(int i = start; i < nums.length; i++){
                if(used[i] ||
                        //this check only works because we have sorted the elements
                        i>0 && nums[i-1]==nums[i] && !used[i-1] //check if previous is used when current element == previous element
                        ) continue;
                temp.add(nums[i]);
                used[i] = true;
                backtrackPermutation(ans, temp, nums, start, used);
                used[i] = false;
                temp.remove(temp.size()-1);
            }
        }
    }
}
