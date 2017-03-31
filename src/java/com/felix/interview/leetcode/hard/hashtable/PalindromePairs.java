package com.felix.interview.leetcode.hard.hashtable;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by felix on 2/11/17.
 * 336
 * https://leetcode.com/problems/palindrome-pairs/
 */
public class PalindromePairs {
    public List<List<Integer>> palindromePairs(String[] words) {
        List<List<Integer>> list = new LinkedList<>();
        for(int i = 0; i < words.length - 1; i++){
            for(int j = i + 1; j <= words.length - 1; j++){
                String l = words[i]+words[j];
                if(l.equals( new StringBuilder(l).reverse().toString() )){
                    List<Integer> index = new ArrayList<>();
                    index.add(i);
                    index.add(j);
                    list.add(index);
                }
                //check the reverse
                l = words[j] + words[i];
                if ( l.equals(new StringBuilder(l).reverse().toString() ) ){
                    List<Integer> index = new ArrayList<>();
                    index.add(j);
                    index.add(i);
                    list.add(index);
                }
            }
        }
        return list;
    }
}
