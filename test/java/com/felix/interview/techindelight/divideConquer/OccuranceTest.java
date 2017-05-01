package com.felix.interview.techindelight.divideConquer;

import com.felix.interview.techindelight.divideConquer.Occurance;
import org.junit.Test;

import static java.lang.System.out;

/**
 * Created by felix on 4/12/17.
 */
public class OccuranceTest {
    Occurance o = new Occurance();

    @Test
    public void testFindFirst(){
        out.println(o.findFirstOccurance(new int[]{2, 5, 5, 5, 6, 6, 8, 9, 9, 9}, 5));
    }

    @Test
    public void testFindFirstNotThere(){
        out.println(o.findFirstOccurance(new int[]{2, 5, 5, 5, 6, 6, 8, 9, 9, 9}, 3));
    }

    @Test
    public void testFindLast(){
        out.println(o.findLastOccurance(new int[]{2, 5, 5, 5, 6, 6, 8, 9, 9, 9}, 5));
    }

    @Test
    public void testFindLastNotThere(){
        out.println(o.findLastOccurance(new int[]{2, 5, 5, 5, 6, 6, 8, 9, 9, 9}, 7));
    }
}
