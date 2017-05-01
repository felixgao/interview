package com.felix.interview.leetcode.hard.string;

import org.junit.Test;

/**
 * Created by felix on 2/18/17.
 */
public class EditDistanceTest {
    EditDistance e = new EditDistance();

    @Test
    public void test1(){
        System.out.print(e.minDistance("apple", "oppo"));
    }
}
