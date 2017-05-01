package com.felix.interview.leetcode.easy.array;

/**
 * Given a list of words and two words word1 and word2, return the shortest distance between these two words in the list.

 For example,
 Assume that words = ["practice", "makes", "perfect", "coding", "makes"].

 Given word1 = “coding”, word2 = “practice”, return 3.
 Given word1 = "makes", word2 = "coding", return 1.
 */
public class ShortestWordDistance {
    public int shortestDistance(String[] words, String word1, String word2) {
        int word1Position = 0, word2Position = 0, minDistance = Integer.MAX_VALUE;
        for(int i = 0; i < words.length; i++){
            if(word1.equals(words[i])){
                word1Position = i;
            }
            if(word2.equals(words[i])){
                word2Position = i;
            }
            minDistance = Math.min(minDistance, Math.abs(word1Position - word2Position));
        }
        return minDistance;
    }
}
