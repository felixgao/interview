package com.felix.interview.programcreek;

import org.junit.Test;

import static java.lang.System.out;

/**
 * Created by felix on 4/30/17.
 */
public class MedianFinderTest {
    MedianFinder f = new MedianFinder();
    @Test
    public void test(){
        int[] ints = new int[]{1,3,2};
        for(int n : ints){
            f.addNum(n);
        }
        out.println(f.findMedian());
    }
}
