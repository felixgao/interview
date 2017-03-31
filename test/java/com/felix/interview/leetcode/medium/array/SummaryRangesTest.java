package com.felix.interview.leetcode.medium.array;

import org.junit.jupiter.api.Test;

/**
 * Created by felix on 1/31/17.
 */
public class SummaryRangesTest {

    @Test
    public void testNoGap(){
        SummaryRanges s = new SummaryRanges();
        System.out.println(s.summaryRanges(new int[] {0,1,2,4,5}));
    }

    @Test
    public void testGap(){
        SummaryRanges s = new SummaryRanges();
        System.out.println(s.summaryRanges(new int[] {0,1,2,4,5,7}));
    }
}
