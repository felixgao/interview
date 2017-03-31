package com.felix.interview.leetcode.easy.stack;

import org.junit.jupiter.api.Test;

/**
 * Created by felix on 3/9/17.
 */
public class MyQueueTest {
    MyQueue m = new MyQueue();

    @Test
    public void test(){
        m.push(1);
        m.push(2);
        System.out.println(m.peek());
        m.push(3);
        System.out.println(m.pop());
        m.push(4);
        m.push(5);
        System.out.println(m.pop());
        System.out.println(m.pop());
        System.out.println(m.pop());
        System.out.println(m.pop());
    }
}
