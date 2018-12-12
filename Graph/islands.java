import java.util.*;

public class solution {
  
    static int count=0;
  
    static class Graph{
      int n ;
       ArrayList<Integer> adj[];
      
      Graph(int n){
        this.n = n;
        adj = new ArrayList[n];
  
      for(int i=0;i<n;i++){
        adj[i] = new ArrayList<>();
      }
        
      }
      public void addEdge(int u, int v){
    	  adj[u].add(v);
          adj[v].add(u);
       }
      
       public void dfs(int source){
      	boolean visited[] = new boolean[n];
           
        for(int i=1;i<n;i++){
           if(!visited[i]){
             count++;
             dfs(i, visited);
           }  
        }
         
        
       }
      
       public void dfs(int source, boolean visited[]){
         visited[source]=true;
        // System.out.print(source+" ");
         for(int i: adj[source]){
           if(!visited[i]){
              dfs(i, visited);
         }
       }
      }
    }
    
    public int solve(int n,int m,int U[],int V[]) {
      Graph g = new Graph(n+1);  
      
      for(int i=0;i<m;i++)
      {
        int u = U[i];
        int v = V[i];
        g.addEdge(u, v);
      }
      
       
      
      g.dfs(1);
      return count;
    }
}
---------------------------------------------------------------------------------------------------------------------------

1<=N<=100
1<=M<=(N*(N-1))/2
1<=u[i],v[i]<=N
Input Format :
Line 1 : Two integers N and M
Line 2 : List u of size of M
Line 3 : List v of size of M
Output Return Format :
The count the number of connected groups of islands
Sample Input :
2 1
1
2
Sample Output :
1 
