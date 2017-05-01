package com.felix.interview.leetcode.medium.string;

/**
 *
 Given a sequence of words, check whether it forms a valid word square.

 A sequence of words forms a valid word square if the kth row and column read the exact same string, where 0 ≤k < max(numRows, numColumns).

 Note:

 The number of words given is at least 1 and does not exceed 500.
 Word length will be at least 1 and does not exceed 500.
 Each word contains only lowercase English alphabet a-z.
 *
 *
 */
public class ValidWordSquare {
    public boolean isValidWordSquare(String[] strings){
        for(int i = 0; i < strings.length; i++){
            for(int j = 0; j < strings[i].length(); j++){
                if(strings[i].charAt(j) != strings[j].charAt(i)){
                    return false;
                }
            }
        }
        return true;
    }
}
