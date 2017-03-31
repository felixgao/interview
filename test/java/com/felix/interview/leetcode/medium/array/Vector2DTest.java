package com.felix.interview.leetcode.medium.array;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.System.out;

/**
 * Created by felix on 3/24/17.
 */
public class Vector2DTest {
    Vector2D v;

    @Test
    public void test1() throws Exception {
        List<List<Integer>> lists = new ArrayList<>();
        lists.add(new ArrayList<>());
        lists.add(Arrays.asList(1,2));
        lists.add(new ArrayList<>());
        lists.add(Arrays.asList(3,4,5));
        lists.add(new ArrayList<>());
        v = new Vector2D(lists);
        while(v.hasNext()){
            out.println(v.next());
        }
    }
}
