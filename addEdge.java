import java.util.*;

public class AddEdge {
    private Map<Integer, List<Integer>> adjList;

    public AddEdge() {
        adjList = new HashMap<>();
    }

    public void addEdge(int source, int destination) {
        adjList.putIfAbsent(source, new ArrayList<>());
        adjList.get(source).add(destination);
        adjList.putIfAbsent(destination, new ArrayList<>());
        adjList.get(destination).add(source);
    }

    public void printGraph() {
        for (int node : adjList.keySet()) {
            System.out.print(node + ": ");
            for (int neighbor : adjList.get(node)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        AddEdge graph = new AddEdge();
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.printGraph();
    }
}
