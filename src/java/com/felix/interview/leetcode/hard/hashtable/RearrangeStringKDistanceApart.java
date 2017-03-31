package com.felix.interview.leetcode.hard.hashtable;

/**
 * Created by felix on 2/11/17.
 * 358
 */
public class RearrangeStringKDistanceApart {
    public String rearrangeString(String str, int k) {
        int len = str.length();
        int[] count = new int[256];
        int[] valid = new int[256];
        for(int i = 0; i < len; i++){
            count[str.charAt(i) - 'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < len; i++){
            int candidatePosition = findValidMax(count, valid, i);
            if( candidatePosition == -1 ) return "";
            count[candidatePosition]--;
            valid[candidatePosition] = i + k;
            sb.append((char) ('a' + candidatePosition));
        }
        return sb.toString();
    }

    private int findValidMax(int[] count, int[] valid, int idx) {
        int max = Integer.MIN_VALUE, candidatePosition = -1;
        for(int i = 0; i < count.length; i++){
            if(count[i] > 0
                    && count[i] > max
                    && idx >= valid[i]){
                max = count[i];
                candidatePosition = i;
            }
        }
        return candidatePosition;
    }
}
