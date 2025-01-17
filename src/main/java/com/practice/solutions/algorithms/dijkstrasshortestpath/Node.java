package com.practice.solutions.algorithms.dijkstrasshortestpath;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
@Setter
@RequiredArgsConstructor
public class Node implements Comparable<Node> {
    private final String name;
    private Integer distance = Integer.MAX_VALUE;

    private List<Node> shortestPath = new ArrayList<>();
    private Map<Node, Integer> adjacentNodes = new HashMap<>();

    public void addAdjacentNode(Node node, int weight) {
        adjacentNodes.put(node, weight);
    }

    @Override
    public int compareTo(Node node) {
        return Integer.compare(this.distance, node.getDistance());
    }

}
