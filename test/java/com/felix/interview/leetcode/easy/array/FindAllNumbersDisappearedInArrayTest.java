package com.felix.interview.leetcode.easy.array;

import com.felix.interview.leetcode.easy.array.FindAllNumbersDisappearedInArray;
import org.junit.Test;

/**
 * Created by felix on 1/27/17.
 */
public class FindAllNumbersDisappearedInArrayTest {

    @Test
    public void testSimpleCase(){
        FindAllNumbersDisappearedInArray prog = new FindAllNumbersDisappearedInArray();
        System.out.println(prog.findDisappearedNumbers(new int[] {
                4,3,2,7,8,2,3,1
        }));

    }
}
