package com.felix.interview.leetcode.medium.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by felix on 3/8/17.
 * 131
 * https://leetcode.com/problems/palindrome-partitioning/?tab=Description
 */
public class PalindromePartitioning {
    public List<List<String>> partition(String s) {
        List<List<String>> resultLst = new ArrayList<>();
        List<String> currLst = new ArrayList<>();
        backTrack(s, 0, resultLst, currLst);
        return resultLst;
    }

    void backTrack(String s, int l, List<List<String>> resultLst, List<String> currLst){
        if(currLst.size() > 0 && l == s.length()){
            resultLst.add(new ArrayList<>(currLst));
        } else {
            for(int i = l; i < s.length(); i++){
                if(isPalindrome(s, l, i)){
                    currLst.add(s.substring(l, i+1));
                    backTrack(s, i+1, resultLst, currLst);
                    currLst.remove(currLst.size()-1);
                }
            }
        }
    }

    boolean isPalindrome(String s, int low, int high){
        while(low < high){
            if(s.charAt(low++) != s.charAt(high--)){
                return false;
            }
        }
        return true;
    }
}
