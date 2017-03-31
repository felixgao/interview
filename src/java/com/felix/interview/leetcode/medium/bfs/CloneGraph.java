package com.felix.interview.leetcode.medium.bfs;

import com.felix.interview.leetcode.UndirectedGraphNode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/**
 * Created by felix on 3/19/17.
 * 133
 * https://leetcode.com/problems/clone-graph/#/description
 */
public class CloneGraph {
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        Map<Integer, UndirectedGraphNode> map = new HashMap<>();
        return clone(node, map);
    }
    private UndirectedGraphNode clone(UndirectedGraphNode node, Map<Integer, UndirectedGraphNode> map) {
        if(node == null) return null;

        if(map.containsKey(node.label)){
            return map.get(node.label);
        }

        UndirectedGraphNode clone = new UndirectedGraphNode(node.label);
        map.put(node.label, clone);
        for(UndirectedGraphNode neighbor : node.neighbors){
            clone.neighbors.add(clone(neighbor, map));
        }
        return clone;
    }
}
