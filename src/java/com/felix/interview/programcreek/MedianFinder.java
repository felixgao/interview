package com.felix.interview.programcreek;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 * Created by felix on 4/30/17.
 */
public class MedianFinder {
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

    public void addNum(int num){
        maxHeap.offer(num);
        minHeap.offer(maxHeap.poll());
        if(maxHeap.size() < minHeap.size()){
            maxHeap.offer(minHeap.poll());
        }
    }

    public double findMedian(){
        if(maxHeap.size() == minHeap.size()){
            return ((double)(minHeap.peek() + maxHeap.peek()))/2;
        }else{
            return maxHeap.peek();
        }
    }
}
