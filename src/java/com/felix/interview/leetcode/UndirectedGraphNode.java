package com.felix.interview.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by felix on 3/19/17.
 */
public class UndirectedGraphNode {
      public int label;
      public List<UndirectedGraphNode> neighbors;
      public UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<>(); }
}
