package com.felix.interview.leetcode.medium.string;

/**
 * Created by felix on 2/19/17.
 * 151
 * https://leetcode.com/problems/reverse-words-in-a-string/?tab=Description
 */
public class ReverseWords {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        int start = 0, end = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' '){
                sb.insert(0, s.charAt(i));
                if(start < end){
                    sb.insert(0, s.substring(start, end+1));
                }
                start = i + 1;
            } else {
                end = i;
            }
        }
        if(start < end){
            sb.insert(0, s.substring(start-1, start));
            sb.insert(0, s.substring(start, end+1));
        }
        return sb.toString();
    }
}
