package graphs;

import java.util.LinkedList;
import java.util.List;

public class GraphDFS {
    public static void main(String[] args){
        List<List<Integer>> graph = new LinkedList<>();
        for(int i = 0;i<6;i++){
            graph.add(new LinkedList<>());
        }
        addEdge(graph, 0,1);
        addEdge(graph, 0,2);
        addEdge(graph, 1,3);
        addEdge(graph, 2,4);
        addEdge(graph, 3,5);

        boolean[] visited = new boolean[graph.size()];
        dfs(graph, 0, visited);
        System.out.println();
    }

    static void addEdge(List<List<Integer>> graph, int a, int b){
        graph.get(a).add(b);
        graph.get(b).add(a);
    }

    // depth-first search dives as deep as possible down one path
    // before backtracking, naturally implemented with recursion
    static void dfs(List<List<Integer>> graph, int node, boolean[] visited){
        visited[node] = true;
        System.out.print(node+" ");

        for(int neighbour : graph.get(node)){
            if(!visited[neighbour]){
                dfs(graph, neighbour, visited);
            }
        }
    }
}

// Practice: Rewrite dfs() iteratively using an explicit Stack
// instead of recursion.
