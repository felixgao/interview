package com.felix.interview.leetcode.medium.math;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by felix on 2/17/17.
 * 60
 * https://leetcode.com/problems/permutation-sequence/?tab=Description
 *
 If you were to list out all the permutations you have

 1 + (permutations of 2, 3, 4)

 2 + (permutations of 1, 3, 4)

 3 + (permutations of 1, 2, 4)

 4 + (permutations of 1, 2, 3)


 */
public class PermutationSequence {
    public String getPermutation(int n, int k) {
        StringBuilder sb = new StringBuilder();
        List<Integer> num = new ArrayList<Integer>();
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
            num.add(i);
        }
        int l = k - 1;
        for (int i = 0; i < n; i++) {
            factorial /= (n - i);
            int index = (l / factorial);
            sb.append(num.remove(index));
            l -= index * factorial;
        }
        return sb.toString();
    }
}
