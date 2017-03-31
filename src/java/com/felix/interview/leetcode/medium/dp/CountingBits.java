package com.felix.interview.leetcode.medium.dp;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by felix on 3/1/17.
 * 338
 * https://leetcode.com/problems/counting-bits/?tab=Description
 */
public class CountingBits {
    public int[] countBits2(int num){
        int[] f = new int[num + 1];
        for (int i=1; i<=num; i++) f[i] = f[i >> 1] + (i & 1);
        return f;
    }

    public int[] countBits(int num) {
        int[] bits = new int[num+1];
        Arrays.fill(bits, -1);
        for(int i =0; i <= num; i++){
            bits[i] = bitCount(i, bits);
        }
        return bits;
    }

    private int bitCount(int value, int[] bits){
        int oneBits = 0;
        while(value != 0){
            if(bits[value] != -1){
                return oneBits + bits[value];
            }
            oneBits += value & 1;
            value >>= 1;
        }
        return oneBits;
    }
}
