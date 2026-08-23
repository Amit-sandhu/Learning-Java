package graphs;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class GraphBFS {
    public static void main(String[] args){

        // adjacency list representation: index = node, value = its neighbours
        List<List<Integer>> graph = new LinkedList<>();
        for(int i = 0;i<6;i++){
            graph.add(new LinkedList<>());
        }
        addEdge(graph, 0,1);
        addEdge(graph, 0,2);
        addEdge(graph, 1,3);
        addEdge(graph, 2,4);
        addEdge(graph, 3,5);

        bfs(graph, 0);
    }

    static void addEdge(List<List<Integer>> graph, int a, int b){
        graph.get(a).add(b);
        graph.get(b).add(a);
    }

    // breadth-first search visits nodes level by level using a Queue,
    // useful for finding the shortest path in an unweighted graph
    static void bfs(List<List<Integer>> graph, int start){
        boolean[] visited = new boolean[graph.size()];
        Queue<Integer> queue = new LinkedList<>();

        queue.add(start);
        visited[start] = true;

        while(!queue.isEmpty()){
            int node = queue.poll();
            System.out.print(node+" ");

            for(int neighbour : graph.get(node)){
                if(!visited[neighbour]){
                    visited[neighbour] = true;
                    queue.add(neighbour);
                }
            }
        }
        System.out.println();
    }
}

// Practice: Modify bfs() to also print the shortest distance (in
// number of edges) from start to every other node.
