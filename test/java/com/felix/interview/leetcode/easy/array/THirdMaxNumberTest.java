package com.felix.interview.leetcode.easy.array;

import com.felix.interview.leetcode.easy.array.ThirdMaxNumber;
import org.junit.Test;

/**
 * Created by felix on 1/27/17.
 */
public class THirdMaxNumberTest {

    @Test
    public void testOnlyOneMax(){
        ThirdMaxNumber thirdMaxNumber = new ThirdMaxNumber();
        System.out.println(thirdMaxNumber.thirdMax(new int[]{
                1,1,1,1,1
        }));
    }

    @Test
    public void testOnlyTwoMax(){
        ThirdMaxNumber thirdMaxNumber = new ThirdMaxNumber();
        System.out.println(thirdMaxNumber.thirdMax(new int[]{
                1,1,2,1,1
        }));
    }

    @Test
    public void testThreeMax(){
        ThirdMaxNumber thirdMaxNumber = new ThirdMaxNumber();
        System.out.println(thirdMaxNumber.thirdMax(new int[]{
                1,1,2,3,1
        }));
    }
}
