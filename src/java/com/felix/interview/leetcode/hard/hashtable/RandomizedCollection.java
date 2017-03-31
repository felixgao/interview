package com.felix.interview.leetcode.hard.hashtable;

import java.security.SecureRandom;
import java.util.*;

/**
 * Created by felix on 2/5/17.
 * 381
 * https://leetcode.com/problems/insert-delete-getrandom-o1-duplicates-allowed/
 */
public class RandomizedCollection {
    Map<Integer, List<Integer>> map;
    List<Integer> list;
    Random r;
    /** Initialize your data structure here. */
    public RandomizedCollection() {
        map = new HashMap<>();
        list = new LinkedList<>();
        r = new SecureRandom();
    }

    /** Inserts a value to the collection. Returns true if the collection did not already contain the specified element. */
    public boolean insert(int val) {
        boolean ret = false;
        if(!map.containsKey(val)){
            map.put(val, new ArrayList<>());
            ret = true;
        }
        list.add(val);
        List<Integer> l = map.get(val);
        l.add(list.size()-1);
        return ret;
    }

    /** Removes a value from the collection. Returns true if the collection contained the specified element. */
    public boolean remove(int val) {
        boolean ret = false;
        if(map.containsKey(val)){
            ret = true;
            List<Integer> valueList = map.get(val);
            //the elemnt is the last
            if(valueList.get(valueList.size()-1) == list.size()){
                valueList.remove(valueList.size()-1);
                list.remove(list.size()-1);
            } else {
                List<Integer> lastValue = map.get(list.get(list.size() - 1));
                int mostRecentValueToRemove = valueList.get(valueList.size() - 1);
                int lastValueIndex = lastValue.get(lastValue.size()-1);
                lastValue.remove(lastValue.size()-1);
                lastValue.add(mostRecentValueToRemove);
                list.set(mostRecentValueToRemove, list.get(lastValueIndex));
                list.remove(list.size()-1);
                valueList.remove(valueList.size()-1);
            }
            if(valueList.size() == 0){
                map.remove(val);
            }
        }
        return ret;
    }

    /** Get a random element from the collection. */
    public int getRandom() {
        return list.get(r.nextInt(list.size()));
    }
}
