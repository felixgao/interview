package com.felix.interview.leetcode.medium.array;

import org.junit.jupiter.api.Test;

/**
 * Created by felix on 1/29/17.
 */
public class FindAllDuplicatesTest {

    @Test
    public void test(){
        int[] a = new int[]{4,3,2,7,8,2,3,1};
        FindAllDuplicates f = new FindAllDuplicates();
        System.out.println(f.findDuplicates(a));
    }
}
