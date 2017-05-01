package com.felix.interview.techindelight.dynamicprogramming;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 *
 */
public class WordBreak {
    public boolean wordBreakDP(String words, Collection<String> dict){
        Set<String> dicts = new HashSet<>(dict);
        boolean[] memo = new boolean[words.length()+1];
        memo[0] = true;

        for(int i = 1; i <= words.length(); i++){
            for(int j = 0; j < i; j++){
                if(
                        memo[j] &&
                        dicts.contains(words.substring(j, i))
                        ){
                    memo[i] = true;
                    break;
                }
            }
        }
        return memo[words.length()];
    }
}
