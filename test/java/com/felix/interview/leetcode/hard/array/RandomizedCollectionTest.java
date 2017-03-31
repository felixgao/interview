package com.felix.interview.leetcode.hard.array;

import org.junit.jupiter.api.Test;

/**
 * Created by felix on 2/5/17.
 */
public class RandomizedCollectionTest {
    RandomizedCollection r = new RandomizedCollection();

    @Test
    public void test(){
        // Inserts 1 to the collection. Returns true as the collection did not contain 1.
        System.out.println(r.insert(1));

        // Inserts another 1 to the collection. Returns false as the collection contained 1. Collection now contains [1,1].
        System.out.println(r.insert(1));

        // Inserts 2 to the collection, returns true. Collection now contains [1,1,2].
        System.out.println(r.insert(2));

        // getRandom should return 1 with the probability 2/3, and returns 2 with the probability 1/3.
        System.out.println(r.getRandom());

        // Removes 1 from the collection, returns true. Collection now contains [1,2].
        System.out.println(r.remove(1));

        // getRandom should return 1 and 2 both equally likely.
        System.out.println(r.getRandom());
    }
}
