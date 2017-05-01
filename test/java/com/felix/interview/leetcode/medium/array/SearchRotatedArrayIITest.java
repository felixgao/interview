package com.felix.interview.leetcode.medium.array;

import org.junit.Test;

/**
 * Created by felix on 2/2/17.
 */
public class SearchRotatedArrayIITest {

    @Test
    public void test(){
        SearchRotatedArrayII s = new SearchRotatedArrayII();
        System.out.println(s.search(new int[]{1,1,1,5,1,1,1,1,1}, 5));
    }

    @Test
    public void testFalse(){
        SearchRotatedArrayII s = new SearchRotatedArrayII();
        System.out.println(s.search(new int[]{1,1,1,5,1,1,1,1,1}, 6));
    }
}
