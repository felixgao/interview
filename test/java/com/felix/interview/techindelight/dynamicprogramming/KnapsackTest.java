package com.felix.interview.techindelight.dynamicprogramming;

import org.junit.Test;

import static java.lang.System.out;

/**
 * Created by felix on 4/13/17.
 */
public class KnapsackTest {
    Knapsack k = new Knapsack();

    @Test
    public void test(){
        out.println(k.knapsack(
                new int[] {20, 5, 10, 40, 15, 25},
                new int[] {1, 2,  3,  8,  7, 4},
                10
        ));
    }
}
