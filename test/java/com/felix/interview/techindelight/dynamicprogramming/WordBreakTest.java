package com.felix.interview.techindelight.dynamicprogramming;

import org.junit.Test;

import java.util.Arrays;

import static java.lang.System.out;

/**
 * Created by felix on 4/14/17.
 */
public class WordBreakTest {
    WordBreak w = new WordBreak();

    @Test
    public void test(){
        String[] dict =  new String[] { "this", "th", "is", "famous", "Word", "break", "b",
        "r", "e", "a", "k", "br", "bre", "brea", "ak", "problem" };
        out.println(w.wordBreakDP("Wordbreakproblem", Arrays.asList(dict)));
    }
}
