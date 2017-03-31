package com.felix.interview.leetcode.hard.dp;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by felix on 2/26/17.
 */
public class ArithmeticSlicesII {
    public int numberOfArithmeticSlices(int[] A) {
        int res = 0;
        Map<Integer, Integer>[] map = new Map[A.length];
        for(int i = 0; i < A.length; i++){
            map[i] = new HashMap<>();
            for(int j = 0; j < i; j++){
                long diff = A[i] - A[j];
                if(diff < Integer.MIN_VALUE || diff > Integer.MAX_VALUE) continue;
                int d = (int) diff;
                int c1 = map[i].getOrDefault(d, 0);
                int c2 = map[j].getOrDefault(d, 0);
                res += c2;
                map[i].put(d, c1 + c2 + 1);
            }
        }
        return res;
    }
}
