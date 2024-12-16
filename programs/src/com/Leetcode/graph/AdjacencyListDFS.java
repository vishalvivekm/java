// import java.util.ArrayList;
// import java.util.Queue;
// import java.util.Arrays;
// import java.util.LinkedList;
// import java.util.HashMap;
import java.util.*;

// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class AdjacencyListDFS {
  public static void main(String[] args) {
    System.out.println("hello from graph");
    // [[0,1],[1,2],[2,0]]
     //n = 6, edges = [[0,1],[0,2],[3,5],[5,4],[4,3]], source = 0, destination = 5
    
    // int vertices = 3;
    // int[][] edges = new int[][]{
    //   {0,1},
    //   {1,2},
    //   {2,0},
    // };
    // int src = 0;
    // int dest = 2;
    
    int vertices = 6;
    int[][] edges = new int[][]{
      {0,1},
      {0,2},
      {3,5},
      {5,4},
      {4,3},
    };
    int src = 0;
    int dest = 5;
   // check if path exists between src and dest;
    System.out.println(pathExists(edges, src, dest, vertices));
  }

  private static boolean pathExists(int[][] edges, int src, int dest, int vertices) {
    // Adjacency List
    // storing vertices as key
    // and edges as list
    
    Map<Integer, List<Integer>> graph = new HashMap<>();
    
    for(int[] edge: edges){
      int u = edge[0];
      int v = edge[1];
      
      // graph.computeIfAbsent(u, value -> new ArrayList<>()).add(v);
      // graph.computeIfAbsent(v, value -> new ArrayList<>()).add(u);
      
      if(!graph.containsKey(u)) {
        graph.put(u, new ArrayList<>());
      }
      graph.get(u).add(v);
      if(!graph.containsKey(v)){
        graph.put(v,new ArrayList<>());
      }
      graph.get(v).add(u);
    }
    
    boolean[] visited = new boolean[vertices]; // all take default false value

    return dfs(graph, src, dest, visited);

    
  }
  private static boolean dfs(Map<Integer, List<Integer>> graph, int src, int dest, boolean[] visited){
    if(src == dest) return true;

    visited[src] = true;

    for(int neighbour : graph.get(src)){
      if(!visited[neighbour]) {
        if(dfs(graph, neighbour, dest, visited)) return true;
      }
    }
  return false;
  }
}
