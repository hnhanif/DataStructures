package com.hanifusion.graph;

import java.util.Set;
import java.util.Queue;
import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.ArrayDeque;
import java.util.List;


public class Graph {
    private class Node {
        String value;

        public Node(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public Map<String, Node> nodes = new HashMap<>();
    public Map<Node, List<Node>> adjacencyList = new HashMap<>();

    public void addNode(String value) {
        var node = new Node(value);
        nodes.putIfAbsent(value, node);
        adjacencyList.putIfAbsent(node, new ArrayList<>());
    }

    public void AddEdge(String from, String to) {
        var fromNode = nodes.get(from);
        var toNode = nodes.get(to);

        adjacencyList.get(fromNode).add(toNode);
    }

    public void removeEdge(String from, String to) {
        var fromNode = nodes.get(from);
        var toNode = nodes.get(to);

        adjacencyList.get(fromNode).remove(toNode);
    }

    public void removeNode(String value) {
        var node = nodes.get(value);
        for (var neighbour : adjacencyList.keySet())
            adjacencyList.get(neighbour).remove(node);

        nodes.remove(value);
        adjacencyList.remove(node);

    }

    public void traverseBreadthFirst(String root) {
        var rootNode = nodes.get(root);
        if (rootNode == null)
            return;

        Map<Node, Integer> levelMap = new HashMap<>();
        Set<Node> visited = new HashSet<>();
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(rootNode);

        levelMap.put(rootNode, 0);

        while (!queue.isEmpty()) {
            var current = queue.remove();
            if (visited.contains(current))
                continue;
            System.out.print(current + " (Level: " + levelMap.get(current) + ")" + "  ");
            visited.add(current);

            for (var neighbour : adjacencyList.get(current)) {
                if (!visited.contains(neighbour)) {
                    queue.add(neighbour);
                    levelMap.put(neighbour, levelMap.get(current) + 1);
                }
            }
        }

    }

    public static void main(String[] args) {
        var graph = new Graph();
        graph.addNode("S");
        graph.addNode("A");
        graph.addNode("B");
        graph.addNode("C");
        graph.addNode("D");
        graph.addNode("E");
        graph.addNode("F");
        graph.addNode("G");

        graph.AddEdge("S", "A");
        graph.AddEdge("S", "B");
        graph.AddEdge("S", "C");

        graph.AddEdge("A", "D");

        graph.AddEdge("B", "E");

        graph.AddEdge("C", "F");

        graph.AddEdge("D", "G");
        graph.AddEdge("E", "G");
        graph.AddEdge("F", "G");

//        graph.removeNode("A");

        System.out.println(graph.nodes);
        System.out.println(graph.adjacencyList);
        System.out.println();
        graph.traverseBreadthFirst("S");
    }
}
