package com.felix.interview.leetcode.medium.dp;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by felix on 3/5/17.
 * 120
 * https://leetcode.com/problems/triangle/?tab=Description
 */
public class Triangle {
    public int minimumTotal(List<List<Integer>> triangle) {
        List<Integer> memo = new ArrayList<>();
        if (triangle.size() == 1) return triangle.get(0).get(0);
        for(int i = 0; i <= triangle.get(triangle.size()-1).size(); i++){
            memo.add(0);
        }

        //start from the last layer and build up
        for(int l = triangle.size()-1; l >= 0; l--){
            List<Integer> level = triangle.get(l);
            for(int i = 0; i < level.size(); i++){
                memo.set(i, Math.min(memo.get(i), memo.get(i+1))+level.get(i));
            }
        }
        return memo.get(0);
    }
}
