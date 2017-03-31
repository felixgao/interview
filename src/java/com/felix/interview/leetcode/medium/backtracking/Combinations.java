package com.felix.interview.leetcode.medium.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by felix on 3/9/17.
 * https://leetcode.com/problems/combinations/?tab=Description
 * 77
 */
public class Combinations {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> accum = new ArrayList<>();
        backtrackCombinations(n, k, 1, result, accum);
        return result;
    }

    private void backtrackCombinations(int n, int k, int start, List<List<Integer>> result, List<Integer> accum) {
        if(accum.size() == k){
            result.add(new ArrayList<>(accum));
        } else {
            for(int i = start; i < n + 1; i++){
                accum.add(i);
                backtrackCombinations(n, k, i+1, result, accum);
                accum.remove(accum.size()-1);
            }
        }
    }
}
