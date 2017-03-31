package com.felix.interview.leetcode.hard.dp;

import org.junit.jupiter.api.Test;

/**
 * Created by felix on 3/1/17.
 */
public class RussianDollEnvelopesTest {
    RussianDollEnvelopes r = new RussianDollEnvelopes();

    @Test
    public void test(){
        System.out.println(r.maxEnvelopes(new int[][]{
                {5,4},
                {6,4},
                {6,7},
                {2,3}
        }));
    }
}
