package com.felix.interview.leetcode.medium.string;

import java.util.Stack;

/**
 * Created by felix on 2/19/17.
 * 71
 * https://leetcode.com/problems/simplify-path/?tab=Description
 */
public class SimplyPath {
    public String simplifyPath(String path) {
        int n = path.length();
        String[] parts = path.split("/");
        Stack<String> stack = new Stack<String>();
        StringBuilder sb = new StringBuilder();
        for(String p : parts){
            if("..".equals(p)){
                if(!stack.isEmpty())
                    stack.pop();
            }else if(".".equals(p) || "".equals(p)){
                //NOOP
            }else{
                stack.push(p);
            }
        }

        while(!stack.isEmpty()){
            sb.insert(0, stack.pop());
            sb.insert(0, "/");
        }

        return sb.length() == 0 ? "/" : sb.toString();
    }
}
