package com.felix.interview.leetcode.medium.binarytree;

/**
 * Created by felix on 3/11/17.
 * 331
 * https://leetcode.com/problems/verify-preorder-serialization-of-a-binary-tree/?tab=Description
 *              9
 *        3           2
 *    4     1     #     6
 *  #   # #    #     #      #
 */
public class VerifySerializationOrder {
    //9,3,4,#,#,1,#,#,2,#,6,#,#
    public boolean isValidPreorderSerialization(String preorder) {
        String[] nodes = preorder.split(",");
        int diff = 1; //start with 1 in-degree node for root
        for(String node : nodes){
            diff--;
            //failure condition for preorder
            if(diff < 0) return false;
            if(!"#".equals(node)) diff+=2;
        }
        return diff == 0;
    }

    //#,4,#,3,#,1,#,9,#,2,#,6,#
    public boolean isValidInorderSerialization(String inorder) {
        String[] nodes = inorder.split(",");
        int diff = 1; //start with 1 in-degree node for root
        for(String node : nodes) {
            diff--;
            //in order, all in-out degree is in 10101010101010 obsoleting
            if(diff > 1 || diff < 0) return false;
            if(!"#".equals(node)) diff+=2;
        }
        return diff == 0;
    }

    //#,#,4,#,#,1,3,#,#,#,6,2,9
    public boolean isValidPostorderSerialization(String postorder) {
        String[] nodes = postorder.split(",");
        int diff = 1; //start with 1 in-degree node for root
        for(String node : nodes) {
            diff--;
            if(diff > 0) return false;
            if(!"#".equals(node)) diff+=2;
        }
        return diff == 0;
    }
}
