package com.felix.interview.leetcode.medium.array;

/**
 * Created by felix on 2/2/17.
 * 79
 * https://leetcode.com/problems/word-search/
 */
public class WordSearch {
    public boolean exist(char[][] board, String word) {
            char[] letters = word.toCharArray();
            for(int x = 0; x < board.length; x++){
                for(int y = 0; y < board[x].length; y++) {
                    if (search(board, letters, x, y, 0)) return true;
                }
            }
            return false;
    }

    private boolean search(char[][] board, char[] word, int x, int y, int matched){
        if(matched == word.length) return true;
        if(x < 0 || y < 0 ||  x == board.length || y == board[x].length ) return false;
        if(board[x][y] != word[matched])  return false;
        //memorize the element that is visited & matched
        //use 256 becasue 1000000 binary is outside ot char range for ascii 0-255
        board[x][y] ^= 512;

        boolean result = search(board, word, x -1, y, matched + 1)
                || search(board, word, x + 1, y, matched + 1)
                || search(board, word, x , y - 1, matched + 1)
                || search(board, word, x, y + 1, matched + 1);

        //reset the visited mark
        board[x][y] ^= 512;
        return result;
    }
}
