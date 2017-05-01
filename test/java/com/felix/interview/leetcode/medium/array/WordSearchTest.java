package com.felix.interview.leetcode.medium.array;

import org.junit.Test;

/**
 * Created by felix on 2/2/17.
 */
public class WordSearchTest {

    @Test
    public void test(){
        char[][] board = new char[][]{
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}
        };

        WordSearch w = new WordSearch();
        System.out.println(w.exist(board, "ABCCED"));
    }
}
