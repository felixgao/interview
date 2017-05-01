package com.felix.interview.careercup.sde1;

import org.junit.Test;

import java.util.Arrays;

import static java.lang.System.out;

/**
 * Created by felix on 4/15/17.
 */
public class ArrayRearrangeTest {
    ArrayRearrange a = new ArrayRearrange();

    @Test
    public void test(){
        int[] array = new int[] {1, 0, 0, 0, 5, 6, 0, 9, 0, 0, 0, 3, 0, 0, 0};
        a.rearrange(array);
        out.println(Arrays.toString(array));
    }
}
