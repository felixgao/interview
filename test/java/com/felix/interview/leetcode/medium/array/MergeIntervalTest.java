package com.felix.interview.leetcode.medium.array;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by felix on 2/4/17.
 */
public class MergeIntervalTest {
    @Test
    public void test(){
        List<MergeInterval.Interval> intervals = new LinkedList<>();
        intervals.add(new MergeInterval.Interval(1,3));
        intervals.add(new MergeInterval.Interval(2,6));
        intervals.add(new MergeInterval.Interval(8,10));
        intervals.add(new MergeInterval.Interval(15,18));
        MergeInterval m = new MergeInterval();
        System.out.println(m.merge(intervals));
    }
}
