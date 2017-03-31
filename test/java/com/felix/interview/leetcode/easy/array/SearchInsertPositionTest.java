package com.felix.interview.leetcode.easy.array;

import com.felix.interview.leetcode.easy.array.SearchInsertPosition;
import org.junit.jupiter.api.Test;

/**
 * Created by felix on 1/29/17.
 */
public class SearchInsertPositionTest {

    @Test
    public void testInSet(){
        SearchInsertPosition s = new SearchInsertPosition();
        int[] array = new int[]{
                1,3,5,6
        };
        System.out.println(s.searchInsert(array, 5));
    }

    @Test
    public void testNotInSet(){
        SearchInsertPosition s = new SearchInsertPosition();
        int[] array = new int[]{
                1,3,5,6
        };
        System.out.println(s.searchInsert(array, 2));
    }

    @Test
    public void testInsertAtTheEnd(){
        SearchInsertPosition s = new SearchInsertPosition();
        int[] array = new int[]{
                1,3,5,6
        };
        System.out.println(s.searchInsert(array, 7));
    }

    @Test
    public void testInsertAtTheBegining(){
        SearchInsertPosition s = new SearchInsertPosition();
        int[] array = new int[]{
                1,3,5,6
        };
        System.out.println(s.searchInsert(array, 0));
    }

}
