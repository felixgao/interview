package com.felix.interview.techindelight.backtracking;

import org.junit.Test;

import static java.lang.System.out;

/**
 * Created by felix on 4/9/17.
 */
public class PermutationStringTest {
    PermutationString p = new PermutationString();
    @Test
    public void test(){
        out.println(p.permutation("ABC"));
    }
}
