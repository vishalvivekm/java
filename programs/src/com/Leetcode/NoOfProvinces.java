/*
LC 547
*/
// Runtime: 0 ms, faster than 100.00% of Java online submissions for Number of Provinces.

class Solution {
    public int findCircleNum(int[][] isConnected) {
          
    int[] visited = new int[isConnected[0].length];
   
    int ans = 0;
    for(int j = 0; j < isConnected[0].length; j++){
      if(visited[j] == 0){
        dfs(isConnected, visited,j );
        ans++;
      }
    }
    return ans;
    }
    
    
      private static void dfs(int[][] graph, int[] visited, int curr){
    visited[curr] = 1;
    for(int i = 0; i < graph[curr].length; i++){
      if(graph[curr][i] == 1 && visited[i] == 0) {
        dfs(graph, visited, i);
      }
    }
    
  }
}
