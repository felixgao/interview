package com.felix.interview.leetcode.medium.string;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by felix on 3/25/17.
 * 187
 * https://leetcode.com/problems/repeated-dna-sequences/#/description
 */
public class RepeatedDNASequence {
    public List<String> findRepeatedDnaSequences(String s) {
        Map<String, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder(s.substring(0, 10));
        map.put(sb.toString(), 1);
        for(int i = 10; i < s.length(); i++){
            //create a rolling window
            sb.append(s.charAt(i));
            sb.deleteCharAt(0);
            map.compute(sb.toString(), (k,v) -> v == null ? 1 : v + 1);
        }
        return map.entrySet().stream().filter(e -> e.getValue() > 1).map(e -> e.getKey()).collect(Collectors.toList());
    }
}
