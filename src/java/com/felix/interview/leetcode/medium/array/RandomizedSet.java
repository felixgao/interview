package com.felix.interview.leetcode.medium.array;

import java.security.SecureRandom;
import java.util.*;

/**
 * Created by felix on 1/29/17.
 * https://leetcode.com/problems/insert-delete-getrandom-o1/
 * 380
 */
public class RandomizedSet {
    private final List<Integer> list;
    private final Map<Integer, Integer> map;
    private final Random rand = new SecureRandom();

    /** Initialize your data structure here. */
    public RandomizedSet() {
        map = new HashMap<>();
        list = new LinkedList<>();

    }

    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if(!map.containsKey(val)){
            list.add(val);
            map.put(val, list.size()-1);
            return true;
        }
        return false;
    }

    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if(map.containsKey(val)){
            //to get constant time, we need to shrink list if the element is not last element in the list
            int lastPositionValue = list.get(list.size()-1);
            if( lastPositionValue != val){
                //copy the last position value to the going to be removed position, then remove the last element
                int listPosition = map.get(val);
                list.set(listPosition, lastPositionValue);
                map.put(lastPositionValue, listPosition);

            }
            //we are removing the last element
            list.remove(list.size()-1);
            map.remove(val);
            return true;
        }
        return false;
    }

    /** Get a random element from the set. */
    public int getRandom() {
        return list.get( rand.nextInt(list.size()) );
    }
}
