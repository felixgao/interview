package com.felix.interview.leetcode.hard.stack;

/**
 * Created by felix on 3/11/17.
 * 316
 * https://leetcode.com/problems/remove-duplicate-letters/?tab=Description
 */
public class RemoveDuplicateLetters {
    public String removeDuplicateLetters(String s) {
        int[] cnt = new int[26];
        StringBuilder sb = new StringBuilder();
//        int pos = 0; // the position for the smallest s[i]
        for (int i = 0; i < s.length(); i++) cnt[s.charAt(i) - 'a']++;
        for(int i = 0; i < s.length(); i++){
            if(--cnt[s.charAt(i) - 'a'] == 0){
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
