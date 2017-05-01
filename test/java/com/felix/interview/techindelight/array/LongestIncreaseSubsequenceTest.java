package com.felix.interview.techindelight.array;

import org.junit.Test;

import java.util.Arrays;

import static java.lang.System.out;

/**
 * Created by felix on 4/8/17.
 */
public class LongestIncreaseSubsequenceTest {
    LongestIncreaseSubsequence l = new LongestIncreaseSubsequence();

    @Test
    public void test(){
        int[] a = new int[] { 2, 6, 3, 4, 1, 2, 9, 5, 8 };
        out.println(l.findLIS(a));
    }
}
