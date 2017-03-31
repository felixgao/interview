package com.felix.interview.leetcode.hard.array;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by felix on 2/6/17.
 * 128
 * https://leetcode.com/problems/longest-consecutive-sequence/
 *
 */
public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int res = 0;
        for(int n : nums){
            if(!map.containsKey(n)){
                int left = map.getOrDefault(n-1, 0);
                int right = map.getOrDefault(n+1, 0);
                int temp = left + right + 1;
                map.put(n, temp);
                res = Math.max(res, temp);
                map.computeIfPresent(n-left, (k,v) -> v = temp);
                map.computeIfPresent(n+right, (k,v) -> v = temp);
            }
        }
        return res;
    }
}
