package com.felix.interview.leetcode.hard.string;

/**
 * Created by felix on 2/19/17.
 *
 * matrix[i][j]: if str[0..i-1] matches pattern[0..j-1]
 * if pattern[j - 1] != '*'
 *      matrix[i][j] = matrix[i - 1][j - 1] && str[i - 1] == pattern[j - 1]
 * if pattern[j - 1] == '*', denote pattern[j - 2] with x
 *      mattrix[i][j] is true iff any of the following is true
 *      1) "x*" repeats 0 time and matches empty: matrix[i][j - 2]
 *      2) "x*" repeats >= 1 times and matches "x*x": str[i - 1] == x && matrix[i - 1][j]
 *      3) '.' matches any single character
 */
public class RegularExpressionMatching {
    public boolean isMatch(String str, String pattern) {
        int s = str.length(), p = pattern.length();
        boolean[][] matrix = new boolean[s+1][p+1];
        matrix[0][0] = true;
        for(int i = 1; i < matrix.length; i++){
            matrix[i][0] = false;
        }
        for(int j = 1; j < matrix[0].length ; j++){
            //for pattern * to be valid, there must be an element preceeds it
            matrix[0][j] = j > 1 && '*' == pattern.charAt(j-1) ||
                    matrix[0][j-2];
        }
        for(int i = 1; i < matrix.length; i++){
            for(int j = 1; j < matrix[i].length; j++){
                if(pattern.charAt(j-1) != '*'){
                    matrix[i][j] = matrix[i-1][j-1] &&
                            isCharMatch(str.charAt(i-1), pattern.charAt(j-1));
                } else {
                    matrix[i][j] = matrix[i][j-2] || //check if previous matching of x* is true
                            matrix[i-1][j] && isCharMatch(str.charAt(i-1), pattern.charAt(j-2));
                }
            }
        }
        return matrix[s][p];
    }

    private boolean isCharMatch(char s, char p) {
        return '.' == p || s == p;
    }
}
