package com.felix.interview.leetcode.medium.hashtable;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by felix on 2/11/17.
 * 454
 * https://leetcode.com/problems/4sum-ii/
 */
public class FourSumII {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        int n = A.length, result = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                int sum  = -(A[i]+B[j]);
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                int sum = C[i] + D[j];
                result += map.getOrDefault(-1 * sum, 0);
            }
        }
        return result;
    }
}
