package com.felix.interview.leetcode.easy.stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Created by felix on 3/10/17.
 * https://leetcode.com/problems/next-greater-element-i/?tab=Description
 * 496
 */
public class NextGreaterElementI {
    public int[] nextGreaterElement(int[] findNums, int[] nums) {
        Map<Integer, Integer> nextGreaterMap = new HashMap<>(nums.length);
        Stack<Integer> stack = new Stack<>();
        for(int num : nums){
            //keep poping and set map until the stack is either empty or top element is no longer smaller than num
            while(!stack.isEmpty() && stack.peek() < num){
                nextGreaterMap.put(stack.pop(), num);
            }
            stack.push(num);
        }
        int[] result = new int[findNums.length];
        for(int i = 0; i < findNums.length; i++){
            result[i] = nextGreaterMap.getOrDefault(findNums[i], -1);
        }
        return result;
    }
}
