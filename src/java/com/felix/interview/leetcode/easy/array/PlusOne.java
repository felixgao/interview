package com.felix.interview.leetcode.easy.array;

/**
 * Created by felix on 1/29/17.
 * 66
 */
public class PlusOne {
    public int[] plusOne(int[] digits){
        boolean increaseSize = true;
        for(int n : digits){
            increaseSize &= (n == 9);
        }
        int[] result = increaseSize ? new int[digits.length] : new int[digits.length-1];
        int k = result.length-1, m = digits.length-1;
        while(m > 0){
            result[k--] = digits[m--];
        }
        for(k = result.length-1; k > 0; k--){
            if(result[k] < 9){
                result[k] += 1;
                return result;
            }
            result[k] = 0;
        }
        result[k] = 1;
        return result;
    }
}
