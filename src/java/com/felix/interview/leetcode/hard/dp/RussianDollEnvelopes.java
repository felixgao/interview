package com.felix.interview.leetcode.hard.dp;

import java.util.Arrays;

/**
 * Created by felix on 2/28/17.
 * 354
 * https://leetcode.com/problems/russian-doll-envelopes/?tab=Description
 */
public class RussianDollEnvelopes {
    public int maxEnvelopes(int[][] envelopes) {
        if(envelopes == null || envelopes.length == 0 || envelopes[0] == null || envelopes[0].length != 2){
            return 0;
        }

        Arrays.sort(envelopes, (a, b) -> {
           if(a[0] == b[0]){
               return b[1] - a[1];
           } else {
               return a[0] - b[0];
           }
        });

        int[] memo = new int[envelopes.length];
        int len = 0;
        for(int[] e : envelopes){
            int index = Arrays.binarySearch(memo, 0, len, e[1]);
            if(index < 0)
                index = -(index + 1);
            memo[index] = e[1];
            if(index == len)
                len++;
        }
        return len;
    }
}
