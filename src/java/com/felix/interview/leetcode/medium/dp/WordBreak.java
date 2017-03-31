package com.felix.interview.leetcode.medium.dp;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by felix on 3/5/17.
 * 139
 * https://leetcode.com/problems/word-break/?tab=Description
 */
public class WordBreak {
    public boolean wordBreak(String s, List<String> wordDict) {
        return wordBreak(s, 0, s.length(), new HashSet<>(wordDict));
    }

    private boolean wordBreak(String s, int start, int end, Set<String> wordDict){
        if (start == end){
            return true;
        }
        boolean ans = false;
        for(int i = start; i < s.length(); i++){
            if(wordDict.contains(s.substring(start, i+1))){
                ans = ans | wordBreak(s, i+1, end, wordDict);
            }
        }
        return ans;
    }

    public boolean wordBreakDp(String s, List<String> wordDict){
        boolean [] memo = new boolean[s.length()+1];
        memo[0] = true;

        for(int i = 1; i <= s.length(); i++){
            for(int j = 0; j < i; j++){
                if(memo[j] && wordDict.contains(s.substring(j, i))){
                    memo[i] = true;
                    break;
                }
            }
        }
        return memo[s.length()];
    }
}
