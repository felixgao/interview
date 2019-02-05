package com.felix.interview.leetcode.medium.string;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Given a string s, return all the palindromic permutations (without duplicates) of it. Return an empty list if no palindromic permutation could be form.
 * For example:
 * Given s = "aabb", return ["abba", "baab"].
 * Given s = "abc", return [].
 * Hint:
 * If a palindromic permutation exists, we just need to generate the first half of the string.
 * To generate all distinct permutations of a (half of) string, use a similar approach from: Permutations II or Next Permutation.
 */
public class PalindromPermutationII {
    public List<String> generatePalindromes(String s) {
        List<String> result = new LinkedList<>();
        if (s == null || s.length() == 0) return result;
        //determine if the string is permutable
//        Map<Character, Integer> characterIntegerMap = new HashMap<>();
//        for(int i = 0; i < s.length(); i++){
//            characterIntegerMap.compute(s.charAt(i), (k,v) -> v == null ? 1 : v  + 1);
//        }
        Map<Character, Long> characterIntegerMap2 = s.chars()
                .mapToObj(i -> (char) i)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        if (!isPalindromMap(characterIntegerMap2)) return result;

        return result;
    }

    boolean isPalindromMap(Map<Character, Long> characterIntegerMap) {
        long c = characterIntegerMap.values().stream().filter(i -> i % 2 == 1).count();
        return c == 1 || c == 0 ? true : false;
    }

    List<Character> allRepeatedCharacters(Map<Character, Integer> characterIntegerMap) {
        return characterIntegerMap.entrySet().stream().filter(e -> e.getValue() % 2 == 0)
                .map(e -> {
                    List<Character> l = new ArrayList<>();
                    for (int i = 0; i < e.getValue(); i++) {
                        l.add(e.getKey());
                    }
                    return l;
                }).flatMap(l -> l.stream())
                .collect(Collectors.toList());
    }

    //mid could be empty
    void permutateCharacters(List<Character> allowedCharacters, boolean[] used, String mid, StringBuilder sb, List<String> result) {
        if (sb.length() == allowedCharacters.size()) {
            result.add(sb.toString() + mid + sb.reverse().toString());
            sb.reverse(); // because string builder reverse mutates the inner states
            return;
        }
        for (int i = 0; i < allowedCharacters.size(); i++) {
            // avoid duplication
            if (i > 0 && allowedCharacters.get(i) == allowedCharacters.get(i - 1) && !used[i - 1]) continue;
            used[i] = true;
            sb.append(allowedCharacters.get(i));
            permutateCharacters(allowedCharacters, used, mid, sb, result);
            used[i] = false;
            sb.deleteCharAt(sb.length() - 1);
        }
    }

}
