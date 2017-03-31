package com.felix.interview.leetcode.medium.array;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by felix on 2/2/17.
 */
public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
         List<List<Integer>> res = new LinkedList<>();
         res.add(new ArrayList<>());
         makeSubsets(res,  nums);
         return res;
    }

    private void makeSubsets(List<List<Integer>> res, int[] nums) {
        for(int i =0; i < nums.length; i++) {
            int s = res.size();
            for (int j = 0; j < s; j++) {
                List<Integer> copy = new LinkedList<>(res.get(j));
                copy.add(nums[i]);
                res.add(copy);
            }
        }
    }
}
