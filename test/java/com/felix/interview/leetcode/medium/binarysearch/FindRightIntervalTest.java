package com.felix.interview.leetcode.medium.binarysearch;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created by felix on 2/22/17.
 */
public class FindRightIntervalTest {
    FindRightInterval f = new FindRightInterval();

    @Test
    public void test1(){
        System.out.println(Arrays.toString(f.findRightInterval(new int[][]{
                {1,2}
                }
        )));
    }

    @Test
    public void test2(){
        System.out.println(Arrays.toString(f.findRightInterval(new int[][]{
                        {3,4},
                        {2,3},
                        {1,2}
                }
        )));
    }

    @Test
    public void test3(){
        System.out.println(Arrays.toString(f.findRightInterval(new int[][]{
                        {1,4},
                        {2,3},
                        {3,4}
                }
        )));
    }
}
