package com.felix.interview.leetcode.medium.hashtable;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Created by felix on 2/11/17.
 * 451
 * https://leetcode.com/problems/sort-characters-by-frequency/
 */
public class SortCharactersByFrequency {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.compute(c, (k,v) -> v == null ? 0 : v + 1);
        }
        Map<Character, Integer> finalMap = new LinkedHashMap<>(map.size());
        map.entrySet().stream()
                .sorted(
                        Map.Entry.<Character, Integer>comparingByValue().reversed()
                ).forEachOrdered(
                        e -> finalMap.put(e.getKey(), e.getValue())
        );
        StringBuilder sb = new StringBuilder();
        for(Map.Entry<Character, Integer> entry : finalMap.entrySet()){
            int v = entry.getValue();
            while(v-- >=0 ){
                sb.append(entry.getKey());
            }
        }
        return sb.toString();
    }
}
