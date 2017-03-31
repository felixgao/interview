package com.felix.interview.leetcode.hard.array;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * Created by felix on 1/24/17.
 * No 126
 * https://leetcode.com/problems/word-ladder-ii/
 */
public class WordLadderII_______ {
    public static class WordNodes{
        String word;
        Map<String, WordNodes> children;

    }

    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        buildWordTree(beginWord, wordList);


        return Collections.emptyList();
    }

    private void buildWordTree(String beginWord, List<String> wordList) {

    }
}
