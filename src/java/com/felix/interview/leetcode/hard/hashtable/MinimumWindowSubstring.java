package com.felix.interview.leetcode.hard.hashtable;

/**
 * Created by felix on 2/11/17.
 * 76
 * https://leetcode.com/problems/minimum-window-substring/
 */
public class MinimumWindowSubstring {
    public String minWindow(String s, String t) {
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        int [] map = new int[128];
        for(char c : tArray) map[c]++;
        int counter = tArray.length, begin=0, end = 0, d = Integer.MAX_VALUE, head = 0;
        while(end < sArray.length){
            if(map[sArray[end++]]-->0) counter--;
            while(counter == 0) {
                if(end - begin < d) {
                    head = begin;
                    d = end - head;
                }
                if (map[sArray[begin++]]++ == 0) counter++;
            }
        }
        return d == Integer.MAX_VALUE ? "" : s.substring(head, head+d);
    }
}

