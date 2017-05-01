package com.felix.interview.leetcode.hard.dp;

import org.junit.Test;

/**
 * Created by felix on 2/22/17.
 */
public class DungeonGameTest {
    DungeonGame d = new DungeonGame();

    @Test
    public void test(){
        System.out.println(d.calculateMinimumHP(new int[][]{
                {-2, -3, 3},
                {-5, -10, 1},
                {10, 30, -5}
        }));
    }
}
