package com.felix.interview.leetcode.medium.string;

import java.util.Arrays;

/**
 * Created by felix on 2/20/17.
 * 6
 * https://leetcode.com/problems/zigzag-conversion/?tab=Description
 */
public class ZigZagConversion {
    public String convert(String s, int numRows) {
        StringBuilder[] builders = new StringBuilder[numRows];
        for(int i = 0; i < numRows; i++) builders[i] = new StringBuilder();

        int i = 0, len = s.length();
        while( i < len ){
            //vertically down
            for(int idx = 0; idx < numRows && i < len; idx++)
                builders[idx].append(s.charAt(i++));
            //oblique up
            for(int idx = numRows -2; idx >= 1 && i < len; idx--)
                builders[idx].append(s.charAt(i++));
        }
        for(int idx = 1; idx < builders.length; idx++)
            builders[0].append(builders[idx]);
        return builders[0].toString();
    }
}
