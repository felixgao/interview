package com.felix.interview.leetcode.medium.binarysearch;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by felix on 2/22/17.
 * 436
 * https://leetcode.com/problems/find-right-interval/?tab=Description
 */
public class FindRightInterval {
    public int[] findRightInterval(int[][] intervals) {
        int[] res = new int[intervals.length];
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(int i = 0; i < intervals.length; i++){
            map.put(intervals[i][0], i);
        }
        for(int i = 0; i < res.length; i++){
            Map.Entry<Integer, Integer> v = map.ceilingEntry(intervals[i][1]);
            res[i] = v == null ? -1 : v.getValue();
        }
        return res;
    }
}
