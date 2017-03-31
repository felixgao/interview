package com.felix.interview.leetcode.medium.array;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by felix on 2/4/17.
 * 56
 * https://leetcode.com/problems/merge-intervals/
 */
public class MergeInterval {
    public static class Interval {
      int start;
      int end;
      Interval() { start = 0; end = 0; }
      Interval(int s, int e) { start = s; end = e; }

        @Override
        public String toString() {
            return "["+start+","+end+"]";
        }
    }

    public List<Interval> merge(List<Interval> intervals) {
        intervals.sort((a,b) -> {
            int r = a.start -  b.start;
            if (r == 0){
                return a.end - b.end
                        ;
            }
            return r;
        });
        List<Interval> list = new ArrayList<>(intervals.size());
        if(intervals.size() < 1){
            return list;
        }
        Interval previous = new Interval(intervals.get(0).start, intervals.get(0).end);
        for(int i = 1; i < intervals.size(); i++){
            Interval cur = intervals.get(i);
            if(cur.start <= previous.end){
                previous.end = cur.end;
            }else{
                list.add(previous);
                previous = new Interval(cur.start, cur.end);
            }
        }
        if(list.size() == 0 || list.get(list.size()-1).end != previous.end){
            list.add(previous);
        }
        return list;
    }
}
