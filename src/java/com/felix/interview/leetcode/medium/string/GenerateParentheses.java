package com.felix.interview.leetcode.medium.string;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by felix on 2/19/17.
 * 22
 * https://leetcode.com/problems/generate-parentheses/?tab=Description
 */
public class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        List<String> result = new LinkedList<>();
        backtrack(result, "", 0, 0, n);
        return result;
    }

    private void backtrack(List<String> result, String s, int open, int close, int max) {
        if(s.length() == 2*max){
            result.add(s);
        }
        if(open < max){
            backtrack(result, s+"(", open+1, close, max);
        }
        if(close < open){
            backtrack(result, s+")", open, close+1, max);
        }
    }
}
