package com.felix.interview.leetcode.medium.backtracking;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by felix on 3/8/17.
 * 89
 * https://leetcode.com/problems/gray-code/?tab=Description
 *
 * i xor i>>1 will cause a single bit change in the value
 *
 */
public class GrayCode {
    public List<Integer> grayCode(int n) {
        List<Integer> result = new LinkedList<>();
        for (int i = 0; i < 1 << n; i++) result.add(i ^ i >> 1);
        return result;
    }
}
