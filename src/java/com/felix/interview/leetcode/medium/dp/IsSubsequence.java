package com.felix.interview.leetcode.medium.dp;


/**
 * Created by felix on 3/5/17.
 * 392
 * https://leetcode.com/problems/is-subsequence/?tab=Description
 */
public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        if(s.length() == 0) return true;
        int sIndex = 0, tIndex = 0;

        while(sIndex < s.length() && tIndex < t.length()){
            if(s.charAt(sIndex) == t.charAt(tIndex)){
                sIndex++;
                if(sIndex == s.length()){
                    return true;
                }
            }
            tIndex++;
        }
        return false;
    }
}
