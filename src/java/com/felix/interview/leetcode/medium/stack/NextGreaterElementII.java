package com.felix.interview.leetcode.medium.stack;

import java.util.Arrays;
import java.util.Stack;

/**
 * Created by felix on 3/10/17.
 * 503
 * https://leetcode.com/problems/next-greater-element-ii/?tab=Description
 */
public class NextGreaterElementII {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length, next[] = new int[n];
        Arrays.fill(next, -1);
        Stack<Integer> stack = new Stack<>(); // index stack
        for (int i = 0; i < n * 2; i++) {
            int num = nums[i % n];
            while (!stack.isEmpty() && nums[stack.peek()] < num)
                next[stack.pop()] = num;
            if (i < n) stack.push(i);
        }
        return next;
    }
}
