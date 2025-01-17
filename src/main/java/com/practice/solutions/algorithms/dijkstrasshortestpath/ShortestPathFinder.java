package com.practice.solutions.algorithms.dijkstrasshortestpath;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ShortestPathFinder {

    /**
     * This method calculates the shortest path to all nodes from the given source node
     * and update the shortestPath List and adjacentNodes Map.
     * @param source
     */
    public void calculateShortestPath(Node source) {
        source.setDistance(0);
        Set<Node> settledNodes = new HashSet<>();
        Queue<Node> unsettledNodes = new PriorityQueue<>(Collections.singleton(source));

        while (!unsettledNodes.isEmpty()) {
            Node currentNode = unsettledNodes.poll();
            currentNode.getAdjacentNodes()
                    .entrySet().stream()
                    .filter(entry -> !settledNodes.contains(entry.getKey()))
                    .forEach(entry -> {
                        evaluateDistanceAndPath(entry.getKey(), entry.getValue(), currentNode);
                        unsettledNodes.add(entry.getKey());
                    });
            settledNodes.add(currentNode);
        }
    }

    private void evaluateDistanceAndPath(Node adjacentNode, Integer edgeWeight, Node sourceNode) {
        Integer newDistance = sourceNode.getDistance() + edgeWeight;
        if (newDistance < adjacentNode.getDistance()) {
            adjacentNode.setDistance(newDistance);
            adjacentNode.setShortestPath(Stream.concat(sourceNode.getShortestPath().stream(), Stream.of(sourceNode)).toList());
        }
    }

    public static void printPaths(List<Node> nodes) {
        nodes.forEach(node -> {
            String path = node.getShortestPath().stream()
                    .map(Node::getName)
                    .collect(Collectors.joining(" -> "));
            System.out.println(path.isBlank()
                    ? "%s : %s".formatted(node.getName(), node.getDistance())
                    : "%s -> %s : %s".formatted(path, node.getName(), node.getDistance()));
        });
    }
}
