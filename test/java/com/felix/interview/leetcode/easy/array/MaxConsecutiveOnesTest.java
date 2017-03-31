package com.felix.interview.leetcode.easy.array;

import com.felix.interview.leetcode.easy.array.MaxConsecutiveOnes;
import org.junit.jupiter.api.Test;

/**
 * Created by felix on 1/27/17.
 */
public class MaxConsecutiveOnesTest {

    @Test
    public void testOne(){
        MaxConsecutiveOnes maxConsecutiveOnes = new MaxConsecutiveOnes();
        System.out.println(maxConsecutiveOnes.findMaxConsecutiveOnes(new int[]{
            1,0,1,1,0,1,1,1,0
        }));
    }

    @Test
    public void testNull(){
        MaxConsecutiveOnes maxConsecutiveOnes = new MaxConsecutiveOnes();
        System.out.println(maxConsecutiveOnes.findMaxConsecutiveOnes(null));
    }
}
