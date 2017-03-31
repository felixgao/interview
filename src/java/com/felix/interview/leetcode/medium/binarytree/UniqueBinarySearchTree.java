package com.felix.interview.leetcode.medium.binarytree;

/**
 * Created by felix on 3/5/17.
 * 96
 * https://leetcode.com/problems/unique-binary-search-trees/?tab=Description
 *
 * F(i, n) = G(i-1) * G(n-i)	1 <= i <= n
 Combining the above two formulas, we obtain the recursive formula for G(n). i.e.

 G(n) = G(0) * G(n-1) + G(1) * G(n-2) + … + G(n-1) * G(0)
 */
public class UniqueBinarySearchTree {
    public int numTrees(int n) {
        int[] memo = new int[n + 1];
        //base case, memo[0] is set to 1 because it is recursive base. memo[1]=1 is because when only root is there, there is only one way to make the tree
        memo[0]=1; memo[1]=1;

        //foreach additional node in the tree
        for(int i = 2; i <= n; i++){
            for(int j = 1; j <= i; j++){
                //i in this case, is above forumla's n and j is the above's i
                memo[i] += memo[j-1] * memo[i-j];
            }
        }

        return memo[n];
    }
}
