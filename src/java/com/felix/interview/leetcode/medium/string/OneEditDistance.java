package com.felix.interview.leetcode.medium.string;

/**
 * Created by felix on 3/25/17.
 */
public class OneEditDistance {
    public boolean isOneEditDistance(String s, String t) {
        int diff = 0, sSize = s.length(), tSize = t.length();
        if (Math.abs(sSize - tSize) > 1) return false;
        int i = 0, j = 0;
        while(i < sSize && j < tSize && diff < 2){
            if(s.charAt(i) != t.charAt(j)){
                diff++;
                if(sSize < tSize){
                    j++;
                } else if ( sSize > tSize){
                    i++;
                } else {
                    i++;
                    j++;
                }

            } else {
                i++;
                j++;
            }
        }
        while (i++ < sSize || j++ < tSize){
            diff++;
        }
        return diff <= 1 ? true : false;
    }
}
