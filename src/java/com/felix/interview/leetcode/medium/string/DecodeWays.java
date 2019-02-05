package com.felix.interview.leetcode.medium.string;

/**
 * Created by felix on 2/19/17.
 * 91
 * https://leetcode.com/problems/decode-ways/?tab=Description
 */
public class DecodeWays {
    //bottom up solution
    public int numDecodings(String s) {
        int n = s.length();
        if(n == 0) return 0;

        // We can explain memo[n] and memo[n-1] using the following cases:
        // Case 1: all zero string. The 1 here won't have any effect. Statement "continue" in the for loop will lead to
        // mem[0] = 0.
        // Case 2: zero is in the last digit i.e. 10. Still two ways of decoding. 1 or 10. memo[n] =1 and memo[n-1] = 1.
        // Adds up to 2.
        // Case 3: zero is not in the last digit i.e. 11. Still two ways of decoding. 1 or 11.
        // Case 4: i.e. 30 82. These numbers only has 1 way of decoding. This is taken care of by the for loop by
        // moving memo[n-1] with 1 to memo[n-2].
        int[] memo = new int[n+1];
        memo[n] = 1;
        memo[n-1] = s.charAt(n-1) != '0' ?  1 : 0; //last char is 0, then we have only one way to decode, since n is already at 1, we put 0 there.
        // if last char is not 0, then we have case 3, so there are two ways to decode the last two digits, we put 1
        for(int i = n-2; i >= 0; i--){
            if(s.charAt(i) != '0'){
                memo[i] = (Integer.parseInt(s.substring(i,i+2))<=26) ?
                        memo[i+1]+memo[i+2] :
                        memo[i+1];
            }
        }
        return memo[0];
    }
}
