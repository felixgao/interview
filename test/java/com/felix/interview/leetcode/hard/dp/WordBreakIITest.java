package com.felix.interview.leetcode.hard.dp;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * Created by felix on 2/27/17.
 */
public class WordBreakIITest {
    WordBreakII w = new WordBreakII();

    @Test
    public void test1(){
        System.out.println(w.wordBreak("catsanddog", Arrays.asList("cat", "cats", "and", "sand", "dog")));
    }
}
