package com.felix.interview.leetcode.medium.math;

import java.util.Arrays;

/**
 * Created by felix on 2/18/17.
 */
public class MultiplyString {
    public String multiply(String num1, String num2) {
        if(num1.length() < num2.length()){
            String t = num1;
            num1 = num2;
            num2 = t;
        }
        int acc = 0, multiplier1 = 1, multiplier2 = 1;
        char[] num2Array = num2.toCharArray();
        char[] num1Array = num1.toCharArray();
        for(int i = num2Array.length-1; i >= 0; i--) {
            int b = num2Array[i] - '0';
            if(b == 0){
                multiplier1 *= 10;
                continue;
            }
            for (int j = num1Array.length-1; j >= 0; j--) {
                int a = num1Array[j] - '0';
                acc += b * multiplier1 * a * multiplier2;
                multiplier2 *=10;
            }
            multiplier1 *= 10;
            multiplier2 = 1;
        }
        return String.valueOf(acc);
    }
}
