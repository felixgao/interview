package com.felix.interview.leetcode.hard.string;

import org.junit.jupiter.api.Test;

/**
 * Created by felix on 2/19/17.
 */
public class TextJustificationTest {
    TextJustification t = new TextJustification();

    @Test
    public void test1(){
        System.out.println(t.fullJustify(new String[]{
                "This", "is", "an", "example", "of", "text", "justification."
        }, 16));
    }

    @Test
    public void test2(){
        System.out.println(t.fullJustify(new String[]{
                "Therefore", "everything", "will", "always", "be", "justification."
        }, 16));
    }
}
