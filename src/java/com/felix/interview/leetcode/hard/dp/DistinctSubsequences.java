package com.felix.interview.leetcode.hard.dp;

import java.util.Arrays;

/**
 * Created by felix on 2/26/17.
 * 115
 * https://leetcode.com/problems/distinct-subsequences/?tab=Description
 *
 * https://discuss.leetcode.com/topic/9488/easy-to-understand-dp-in-java/2
 *
 *
 *          S = [rabbbit]
 [] mem[0]   = [11111111]
 [r]mem[1] =   [01111111]
 [a]mem[2] =   [00111111]
 [b]mem[3] =   [00012333]
 [b]mem[4] =   [00001333]
 [i]mem[5] =   [00000033]
 [t]mem[6] =   [00000003]
 *
 */
public class DistinctSubsequences {
    public int numDistinct(String S, String T) {
        // array creation
        int[][] memo = new int[T.length()+1][S.length()+1];
        // filling the first row: with 1s
        Arrays.fill(memo[0], 1);

        // the first column is 0 by default in every other rows but the first, which we need.

        for(int i=0; i<T.length(); i++) {
            for(int j=0; j<S.length(); j++) {
                if(T.charAt(i) == S.charAt(j)) {
                    memo[i+1][j+1] = memo[i][j]  //previous row
                            + memo[i+1][j]; //current row
                } else {
                    memo[i+1][j+1] = memo[i+1][j];
                }
            }
        }
        return memo[T.length()][S.length()];
    }
}
