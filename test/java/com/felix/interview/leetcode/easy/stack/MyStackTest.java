package com.felix.interview.leetcode.easy.stack;

import org.junit.jupiter.api.Test;

/**
 * Created by felix on 3/9/17.
 */
public class MyStackTest {
    MyStack m = new MyStack();

    @Test
    public void test(){
        m.push(1);
        m.push(2);
        m.push(3);
        m.push(4);
        m.push(5);
        System.out.println(m.top());
        m.pop();
        System.out.println(m.top());
    }
}
