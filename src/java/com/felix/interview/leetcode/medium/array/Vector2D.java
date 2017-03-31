package com.felix.interview.leetcode.medium.array;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Created by felix on 3/24/17.
 */
public class Vector2D {
    Iterator<List<Integer>> outter;
    Iterator<Integer> inner;
    public Vector2D(List<List<Integer>> vec2d) {
        outter = vec2d.iterator();
        inner = Collections.emptyIterator();
    }

    public int next() throws Exception {
        if(hasNext()){
            return inner.next();
        }
        throw new Exception("reached the new of the iterator");
    }

    public boolean hasNext(){
        if(inner.hasNext()) return true;
        while(outter.hasNext()){
            inner = outter.next().iterator();
            if(inner.hasNext()) return true;
        }
        return false;
    }


}
