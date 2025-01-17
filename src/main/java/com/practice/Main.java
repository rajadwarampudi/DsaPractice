package com.practice;

import com.practice.solutions.algorithms.dijkstrasshortestpath.Node;
import com.practice.solutions.algorithms.dijkstrasshortestpath.ShortestPathFinder;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");

        runDijkstrasAlgorithm();
    }

    private static void runDijkstrasAlgorithm() {
        Node nodeA = new Node("A");
        Node nodeB = new Node("B");
        Node nodeC = new Node("C");
        Node nodeD = new Node("D");
        Node nodeE = new Node("E");
        Node nodeF = new Node("F");

        nodeA.addAdjacentNode(nodeB, 2);
        nodeA.addAdjacentNode(nodeC, 4);

        nodeB.addAdjacentNode(nodeC, 3);
        nodeB.addAdjacentNode(nodeD, 1);
        nodeB.addAdjacentNode(nodeE, 5);

        nodeC.addAdjacentNode(nodeD, 2);

        nodeD.addAdjacentNode(nodeE, 1);
        nodeD.addAdjacentNode(nodeF, 4);

        nodeE.addAdjacentNode(nodeC, 2);

        ShortestPathFinder shortestPathFinder = new ShortestPathFinder();
        shortestPathFinder.calculateShortestPath(nodeA);
        ShortestPathFinder.printPaths(Arrays.asList(nodeA, nodeB, nodeC, nodeD, nodeE, nodeF));
    }
}