package com.felix.interview.leetcode.medium.stack;

import java.util.Stack;

/**
 * Created by felix on 3/11/17.
 * 402
 * https://leetcode.com/problems/remove-k-digits/?tab=Description
 */
public class RemoveKDigits {
    public String removeKdigits(String num, int k) {
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        int len = num.length(), n = k, cnt = 0;
        // k keeps track of how many characters we can remove
        // if the previous character in stk is larger than the current one
        // then removing it will get a smaller number
        // but we can only do so when k is larger than 0
        for (char val : num.toCharArray()) {
            while (sb.length() > 0 &&
                    n > 0 &&
                    val - '0' < sb.charAt(sb.length()-1) - '0'
                    ) {
                n--;
                sb.setLength(sb.length()-1);
            }
            sb.append(val);
        }
        while(stack.size() > len - k + 1){
            stack.pop();
        }
        while(!stack.isEmpty()) sb.append(num.charAt(stack.pop()));
        //remove leading zeros
        for(int i = 0; i < sb.length(); i++){
            if(sb.charAt(0) == '0'){
                sb.deleteCharAt(0);
            }
        }
        return sb.length() == 0 ? "0" : sb.toString();
    }
}
