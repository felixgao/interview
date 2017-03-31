package com.felix.interview.leetcode.hard.string;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by felix on 2/19/17.
 * 68
 * https://leetcode.com/problems/text-justification/?tab=Description
 */
public class TextJustification {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new LinkedList<>();
        int usedSpaces = maxWidth, start =0, end = 0;
        for(int i = 0; i < words.length; i++){
            //can we use the new words
            if(usedSpaces - words[i].length() > 0){
                usedSpaces -= (words[i].length() + 1); //include at least one extra space
                end = i;
            } else {
                result.add(justifyWords(words, start, end, usedSpaces+1));
                start = i;
                usedSpaces = maxWidth - words[i].length();
            }
        }
        if (start != end){
            result.add(justifyWords(words, start, words.length-1, usedSpaces+1));
        }
        return result;
    }

    private String justifyWords(String[] words, int start, int end, int leftOverSpaces) {
        int extraSpacesBetweenWords = (end - start) != 0 ? leftOverSpaces / (end - start) : 0;
        int additionalSpaces = (end - start) != 0 ? leftOverSpaces % (end - start) : 0;
        StringBuilder sb = new StringBuilder();
        for(int i = start; i < end; i++){
            sb.append(words[i]);
            sb.append(" ");
            for(int j = 0; j < extraSpacesBetweenWords; j++){
                sb.append(" ");
            }
            if(additionalSpaces > 0){
                sb.append(" ");
                additionalSpaces--;
            }
        }
        sb.append(words[end]);
        return sb.toString();
    }
}
