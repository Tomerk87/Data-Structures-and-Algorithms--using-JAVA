package data_structures.graphs;


import java.util.ArrayList;
import java.util.Hashtable;

public class Graph {
    int numberOfNodes = 0;
    Map<Integer, ArrayList<Integer>> adjacentList = new HashMap<>();

    public void addVertex(int node) {
        adjacentList.put(node, new ArrayList<>());
        numberOfNodes++;
    }

    public void addEdge(int node1, int node2) {
        if(adjacentList.containsKey(node1) && adjacentList.containsKey(node2) {
            adjacentList.get(node1).add(node2);
            adjacentList.get(node2).add(node1);
        }
    }

    public void showConnections() {
        for(Map.Entry entry : adjacentList.entrySet() {
            System.out.println(entry.getKey() + " ---> " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addVertex(5);
        graph.addVertex(54);
        graph.addVertex(44);
        graph.addEdge(5,54);
        graph.addEdge(5,44);
        graph.showConnections();
    }
}


