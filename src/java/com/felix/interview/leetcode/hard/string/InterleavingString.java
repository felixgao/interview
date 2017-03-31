package com.felix.interview.leetcode.hard.string;

/**
 * Created by felix on 2/18/17.
 * 97
 * https://leetcode.com/problems/interleaving-string/?tab=Description
 */
public class InterleavingString {
    public boolean isInterleave(String s1, String s2, String s3) {
        boolean matrix[][] = new boolean[s1.length()+1][s2.length()+1];
        matrix[0][0] = true;
        for(int i = 1; i < matrix.length; i++){
            matrix[i][0] = matrix[i-1][0] && s1.charAt(i-1) == s3.charAt(i-1);
        }
        for(int j = 1; j < matrix[0].length; j++){
            matrix[0][j] = matrix[0][j-1] && s2.charAt(j-1) == s3.charAt(j-1);
        }
        for(int i = 1; i < matrix.length; i++){
            for(int j = 1; j < matrix[0].length; j++){
                matrix[i][j] =
                        ( matrix[i][j-1] && s2.charAt(j-1) == s3.charAt(i+j-1)) ||
                        ( matrix[i-1][j] && s1.charAt(i-1) == s3.charAt(i+j));
            }
        }
        return matrix[s1.length()][s2.length()];
    }
}
