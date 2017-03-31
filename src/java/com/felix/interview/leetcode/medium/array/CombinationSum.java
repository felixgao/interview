package com.felix.interview.leetcode.medium.array;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by felix on 2/4/17.
 * 39
 * https://leetcode.com/problems/combination-sum/
 * https://discuss.leetcode.com/topic/46161/a-general-approach-to-backtracking-questions-in-java-subsets-permutations-combination-sum-palindrome-partitioning/2
 */
public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new LinkedList<>();
        findSums(result, new ArrayList<>(candidates.length), candidates, 0, target);
        return result;
    }

    private void findSums(List<List<Integer>> result, ArrayList<Integer> ac, int[] candidates, int start, int target) {
        if(target == 0){
            result.add(new ArrayList<>(ac));
            return;
        }
        if(target < 0) return;

        for(int i = start; i<candidates.length; i++){
            ac.add(candidates[i]);
            findSums(result, ac, candidates, i, target - candidates[i]);
            ac.remove(ac.size()-1);
        }
    }

}
