package com.felix.interview.leetcode.medium.binarysearch;

/**
 * Created by felix on 2/23/17.
 * 329
 * https://leetcode.com/problems/is-subsequence/?tab=Description
 */
public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        int sIndex = 0, tIndex = 0;
        for(int i = 0; i < t.length(); i++){
            if(t.charAt(i) == s.charAt(sIndex)){
                sIndex++;
            }
        }
        return sIndex == s.length();
    }
}
