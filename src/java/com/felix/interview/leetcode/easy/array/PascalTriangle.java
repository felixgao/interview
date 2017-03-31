package com.felix.interview.leetcode.easy.array;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by felix on 1/29/17.
 * 118
 */
public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>(numRows);
        List<Integer> v = new ArrayList<>(1);
        v.add(1);
        result.add(v);

        for(int i = 1; i<numRows; i++){
            List<Integer> t = new LinkedList<>(result.get(i-1));
            t.add(0,1);
            for(int j = 1; j< t.size() -1; j++){
                t.set(j, t.get(j)+ t.get(j+1));
            }
            result.add(t);
        }
        return result;
    }
}
