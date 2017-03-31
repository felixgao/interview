package com.felix.interview.leetcode.hard.string;

/**
 * Created by felix on 2/18/17.
 * 72
 * https://leetcode.com/problems/edit-distance/?tab=Description
 *
 Given two words word1 and word2, find the minimum number of steps required to convert word1 to word2. (each operation is counted as 1 step.)

 You have the following 3 operations permitted on a word:

 a) Insert a character
 b) Delete a character
 c) Replace a character
 */
public class EditDistance {
    public int minDistance(String word1, String word2) {
        //word1 is always shorter or same length as word2
        if(word1.length() > word2.length())
            return minDistance(word2, word1);

        int matrix[][] = new int[word1.length()+1][word2.length()+1];
        for(int i = 1; i < matrix.length; i++){
            matrix[i][0] = i;
        }
        for(int i = 1; i < matrix[0].length; i++){
            matrix[0][i] = i;
        }
        for(int i = 1; i < matrix.length; i++){
            for(int j = 1; j < matrix[0].length; j++){
                if(word1.charAt(i-1) != word2.charAt(j-1)){
                    matrix[i][j] = Math.min(matrix[i-1][j-1], Math.min(matrix[i-1][j], matrix[i][j-1])) + 1;
                } else {
                    matrix[i][j] = matrix[i-1][j-1];
                }
            }
        }
        return matrix[word1.length()][word2.length()];
    }

}
