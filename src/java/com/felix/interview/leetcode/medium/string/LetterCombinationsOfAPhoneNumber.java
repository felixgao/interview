package com.felix.interview.leetcode.medium.string;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Created by felix on 2/19/17.
 * 17
 * https://leetcode.com/problems/letter-combinations-of-a-phone-number/?tab=Description
 */
public class LetterCombinationsOfAPhoneNumber {
    static final Map<Integer, String> map = new HashMap(){{
        put('2', "abc");
        put('3',"def");
        put('4',"ghi");
        put('5',"jkl");
        put('6',"mno");
        put('7',"pqrs");
        put('8',"tuv");
        put('9',"wxyz");
    }};
    public List<String> letterCombinations(String digits) {
        List<String> result = new LinkedList<>();
        letterCombinations(digits, result, "", 0, digits.length());
        return result;
    }

    private void letterCombinations(String digits, List<String> result, String s, int i, int max) {
        if(s.length() == max){
            result.add(s);
            return;
        }
        if(map.containsKey(digits.charAt(i))) {
            for (char c : map.get(digits.charAt(i)).toCharArray()){
                letterCombinations(digits, result, s+c, i+1, max);
            }
        }
    }
}
