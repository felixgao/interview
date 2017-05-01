package com.felix.interview.leetcode.medium.dp;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by felix on 3/5/17.
 */
public class WordBreakTest {
    WordBreak w = new WordBreak();

    @Test
    public void test1(){
        List<String> l = new ArrayList<>();
        l.add("leet");
        l.add("code");
        System.out.println(w.wordBreak("leetcode", l));
        System.out.println(w.wordBreakDp("leetcode", l));
    }

    @Test
    public void test2(){
        List<String> l = new ArrayList<>();
        l.add("leet");
        l.add("code");
        System.out.println(w.wordBreak("leetcoder", l));
        System.out.println(w.wordBreakDp("leetcoder", l));
    }
}
