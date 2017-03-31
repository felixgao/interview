package com.felix.interview.leetcode.medium.stack;

import java.util.Stack;

/**
 * Created by felix on 3/10/17.
 * 394
 * https://leetcode.com/problems/decode-string/?tab=Description
 */
public class DecodeString {
    public String decodeString(String s) {
        Stack<Integer> numStack = new Stack<>();
        Stack<StringBuilder> resStack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int cnt = 0;
        for (char c : s.toCharArray()) {
            if(Character.isDigit(c)){
                cnt += cnt * 10 + (c - '0');
            } else if ( c == '['){
                numStack.push(cnt);
                cnt = 0;
                resStack.push(sb);
                sb = new StringBuilder();
            } else if ( c == ']'){
                StringBuilder tmp = sb;
                sb = resStack.pop();
                for(int i = numStack.pop(); i > 0; --i){
                    sb.append(tmp);
                }
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
