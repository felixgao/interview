package com.felix.interview.leetcode.medium.string;

/**
 * Created by felix on 2/20/17.
 * 5
 * https://leetcode.com/problems/longest-palindromic-substring/?tab=Description
 */
public class LongestPalindromSubstring {
    public String longestPalindrome(String s) {
        String p = s.substring(0, 1);
        for(int i = 1; i < s.length()-1; i++){
            String t = isPalindrome(s, i, i);
            if(t.length() > p.length()){
                p = t;
            }
            t = isPalindrome(s, i, i+1);
            if(t.length() > p.length()){
                p = t;
            }
        }
        return p;
    }

    private String isPalindrome(String s, int startIndex1, int startIndex2){
        while(startIndex1 >=0 && startIndex2 < s.length() &&
                s.charAt(startIndex1) == s.charAt(startIndex2)
                ){
            startIndex1--;
            startIndex2++;
        }
        return s.substring(startIndex1+1, startIndex2);
    }
}

