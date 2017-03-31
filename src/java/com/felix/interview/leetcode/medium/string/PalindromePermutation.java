package com.felix.interview.leetcode.medium.string;

/***
Given a string, determine if a permutation of the string could form a palindrome.
For example,
"code" -> False, "aab" -> True, "carerac" -> True.
Hint:
Consider the palindromes of odd vs even length. What difference do you notice?
Count the frequency of each character.
If each character occurs even number of times, then it must be a palindrome. How about character which occurs odd number of times?
Tags: Hash Table
Similar Problems: (M) Longest Palindromic Substring, (E) Valid Anagram, (M) Palindrome Permutation II
*/


import java.util.HashSet;
import java.util.Set;

/****
Add each char into map.
Count if odd > 1, false
Note: Iterate HashMap
HashMap.Entry<String, Integer> entry : map.entrySet()
*/
public class PalindromePermutation {
    public boolean canPermutePalindrome(String s) {
        Set<Character> candidateSet = new HashSet<>();
        for(int i = 0; i < s.length(); i++){
            if(candidateSet.contains(s.charAt(i))){
                candidateSet.remove(s.charAt(i));
            } else {
                candidateSet.add(s.charAt(i));
            }
        }
        return candidateSet.size() == 0 || candidateSet.size() == 1;
    }
}
