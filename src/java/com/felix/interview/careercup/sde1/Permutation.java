package com.felix.interview.careercup.sde1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by felix on 4/15/17.
 */
public class Permutation {
    public List<String> permutation(String input){
        List<String> result = new ArrayList<>();
        List<Character> accum = new ArrayList<>(input.length());
        helper(result, accum, input.toCharArray(), 0);
        return result;
    }

    private void helper(List<String> result, List<Character> accum, char[] input, int start) {
        if(accum.size() == input.length){
            String t = accum.stream().map(c-> c.toString()).collect(Collectors.joining());
            result.add(t);
        } else {
            for( int i = start; i < input.length; i++){
                if(accum.contains(input[i])) continue;
                accum.add(input[i]);
                helper(result, accum, input, start);
                accum.remove(accum.size()-1);
            }
        }
    }
}
