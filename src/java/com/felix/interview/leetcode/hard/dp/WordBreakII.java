package com.felix.interview.leetcode.hard.dp;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by felix on 2/27/17.
 * 140
 * https://leetcode.com/problems/word-break-ii/?tab=Description
 *
 For example, given
 s = "catsanddog",
 dict = ["cat", "cats", "and", "sand", "dog"].

 A solution is ["cats and dog", "cat sand dog"].
 */
public class WordBreakII {
    public List<String> wordBreak(String s, List<String> wordDict) {
        List<String> result = new ArrayList<>();
        processString(s,0, s.length(), new HashSet(wordDict), new ArrayList<>(), result);
        return result;
    }

    private void processString(String s, int start, int length, Set<String> wordDict, List<String> track, List<String> result) {
        if(start == length){
            StringBuilder sb = new StringBuilder(track.get(0));
            for(int i = 1; i < track.size(); i ++){
                sb.append(" ").append(track.get(i));
            }
            result.add(sb.toString());
            return;
        }

        for(int i = start; i < length; i++){
            String substr = s.substring(start, i+1);
            if(wordDict.contains(substr)){
                track.add(substr);
                processString(s, i+1, length, wordDict, track, result);
                track.remove(track.size()-1);
            }
        }
    }
}
