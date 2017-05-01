package com.felix.interview.leetcode.easy.array;

import com.felix.interview.leetcode.easy.array.PlusOne;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by felix on 1/29/17.
 */
public class PlusOneTest {

    @Test
    public void testNotMaxNumber(){
        PlusOne plusOne = new PlusOne();
        System.out.println(Arrays.toString(plusOne.plusOne(
                new int[] {
                        9,9,9,8
                }
        )));
    }

    @Test
    public void testMaxNumber(){
        PlusOne plusOne = new PlusOne();
        System.out.println(Arrays.toString(plusOne.plusOne(
                new int[] {
                        9,9,9,9
                }
        )));
    }
}
