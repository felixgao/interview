package com.felix.interview.leetcode.medium.dp;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by felix on 3/5/17.
 */
public class TriangleTest {
    Triangle t = new Triangle();

    @Test
    public void test1(){
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(Arrays.asList(2));
        triangle.add(Arrays.asList(3,4));
        triangle.add(Arrays.asList(6,5,7));
        triangle.add(Arrays.asList(4,1,8,3));
        System.out.println(t.minimumTotal(triangle));
    }
}
