package com.felix.interview.leetcode.easy.stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Created by felix on 3/10/17.
 * 20
 * https://leetcode.com/problems/valid-parentheses/?tab=Description
 */
public class ValidParentheses {
    public boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(map.containsKey(c)){
                if(stack.isEmpty()) return false;
                if(map.get(c) !=  stack.pop()){
                    return false;
                }
            }else{
                stack.push(c);
            }
        }
        //if stack is empty then we must have a match. otherwise, it must be mismatched
        return stack.isEmpty();
    }
}
