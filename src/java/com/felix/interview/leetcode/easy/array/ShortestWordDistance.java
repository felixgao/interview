package com.felix.interview.leetcode.easy.array;

/**
 * Created by felix on 3/22/17.
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
