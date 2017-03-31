package com.felix.interview.leetcode.medium.array;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by felix on 1/31/17.
 */
public class CombinationSumIII {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new LinkedList<>();
        findCombination(result, new LinkedList<>(), k, n, 1);
        return result;
    }

    private void findCombination(List<List<Integer>> res, List<Integer> acc, int k, int n, int start){
        if(acc.size() > k){
            return;
        }
        if(acc.size() == k && n == 0){
            List<Integer> r = new LinkedList<>(acc);
            res.add(r);
            return;
        }
        for(int i = start; i<= 9; i++){
            acc.add(i);
            findCombination(res, acc, k, n-i, i+1);
            acc.remove(acc.size() -1); // remove the last added
        }
    }
}
