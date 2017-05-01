package com.felix.interview.techindelight.backtracking;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by felix on 4/9/17.
 */
public class PermutationString {
    public List<String> permutation(String s){
        List<String> result = new ArrayList<>();
        List<Character> accum = new ArrayList<>();
        DFS(s.toCharArray(), result, accum);
        return result;
    }

    private void DFS(char[] chars, List<String> result, List<Character> accum) {
        if(accum.size() == chars.length){
            result.add(accum.stream().map(c -> String.valueOf(c)).collect(Collectors.joining("")));
        }else{
            for(int i = 0; i < chars.length; i++){
                if(accum.contains(chars[i])) continue;
                accum.add(chars[i]);
                DFS(chars, result, accum);
                accum.remove(accum.size()-1);
            }
        }
    }
}
