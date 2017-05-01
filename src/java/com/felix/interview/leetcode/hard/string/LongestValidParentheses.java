package com.felix.interview.leetcode.hard.string;

import java.util.Stack;

/**
 * Created by felix on 2/19/17.
 * 32
 * https://leetcode.com/problems/longest-valid-parentheses/?tab=Description
 Given a string containing just the characters '(' and ')', find the length of the longest valid (well-formed) parentheses substring.

 For "(()", the longest valid parentheses substring is "()", which has length = 2.

 Another example is ")()())", where the longest valid parentheses substring is "()()", which has length = 4.
 */
public class LongestValidParentheses {
    public int longestValidParentheses(String s) {
        int max = Integer.MIN_VALUE;
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            //pop the stack only when the top of the stack is a matching ()
            if(s.charAt(i) == ')' && !stack.isEmpty() && s.charAt(stack.peek()) == '('){
                stack.pop();
            } else { //we have a mismatch, compute the max we have seen so far
                if(stack.isEmpty()){ // we have an empty stack means all of the previous have matched
                    max = Math.max(max, i);
                } else {
                    max = Math.max(max, i - stack.peek() -1 ); //need only to count i to last mismatch index, -1 to get the real length
                }
                stack.push(i);
            }
        }
        //we might have a complete match
        return stack.isEmpty() ? s.length() : max;

    }
}
