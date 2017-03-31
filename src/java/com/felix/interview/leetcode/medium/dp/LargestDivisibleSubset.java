package com.felix.interview.leetcode.medium.dp;

import java.util.*;

/**
 * Created by felix on 3/3/17.
 * 368
 * https://leetcode.com/problems/largest-divisible-subset/?tab=Description
 */
public class LargestDivisibleSubset {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        Map<Integer, Set<Integer>> map = new HashMap<>();
        map.put(-1, new HashSet<>());
        Arrays.sort(nums);
        for(int num : nums){
            Set<Integer> tSet = new HashSet<>();
            for(Map.Entry<Integer, Set<Integer>> entry : map.entrySet()){
                if(num % entry.getKey() == 0){
                    if(entry.getValue().size() > tSet.size()){
                        tSet = entry.getValue();
                    }
                }
            }
            tSet = new HashSet<>(tSet);
            tSet.add(num);
            map.put(num, tSet);
        }
        return new ArrayList<>(map.values().stream().max(Comparator.comparingInt(Set::size)).get());
    }
}
