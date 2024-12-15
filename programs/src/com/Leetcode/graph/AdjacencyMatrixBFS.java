import java.util.ArrayList;
import java.util.Queue;
import java.util.Arrays;
import java.util.LinkedList;

// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {
    System.out.println("hello from graph");
    // [[0,1],[1,2],[2,0]]
     //n = 6, edges = [[0,1],[0,2],[3,5],[5,4],[4,3]], source = 0, destination = 5
    int vertices = 3;
    int[][] edges = new int[][]{
      {0,1},
      {1,2},
      {2,0},
    };
    int src = 0;
    int dest = 2;
    // int vertices = 6;
    // int[][] edges = new int[][]{
    //   {0,1},
    //   {0,2},
    //   {3,5},
    //   {5,4},
    //   {4,3},
    // };
    // int src = 0;
    // int dest = 5;
    // check if path exists between 0 and 2;
    System.out.println(pathExists(edges, src, dest, vertices));
  }

  private static boolean pathExists(int[][] edges, int src, int dest, int vertices) {
    // make adj matrix
    // size of adj mat = m x m , where m = number of vertices

    boolean[][] graph = new boolean[vertices][vertices];

    // fill the matrix to false initially; unnecessary
    for(boolean[] row: graph){
      Arrays.fill(row, false);
    }
    // traverse edges and wherever there is an edge, mark true for matrix[i][j] and
    // matrix[j][i]; since undirected graph

    for(int[] edge: edges) {
      int u = edge[0];
      int v = edge[1];
      graph[u][v] = true;
      graph[v][u] = true;
    } // adj matrix is set :)

    Queue<Integer> q = new LinkedList<>();
    q.add(src);

    boolean[] visited = new boolean[vertices]; // all take default false value
    while(!q.isEmpty()) {
      int curr = q.remove();
      if(curr == dest) return true;
      for(int i = 0; i < vertices; i++){
        if(graph[curr][i] && !visited[i]) {
          q.add(i);
          visited[i] = true;
        }
      }
    }
    
    return false;

    
  }
}
