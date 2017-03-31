package com.felix.interview.leetcode.medium.string;

import java.util.Arrays;

/**
 * Created by felix on 2/20/17.
 * 3
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/?tab=Description
 */
public class LongestSubstringWithoutRepeating {
    public int lengthOfLongestSubstring(String s) {
        int[] flag = new int[255];
        Arrays.fill(flag, -1);
        int start = 0, longest = 0, len = s.length();
        for(int i = 0; i < len; i++){
            if(flag[s.charAt(i)] >= start){
                longest = Math.max(longest, i - start);
                start = flag[s.charAt(i)] + 1;
            }
            flag[s.charAt(i)] = i;
        }
        return Math.max(longest, len - start);
    }
}
