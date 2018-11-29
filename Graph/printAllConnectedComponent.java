import java.util.*;

public class Solution {

  	static class Graph{
      int n; //vertices
      int matrix[][];
      
      Graph(int n){
        this.n = n;
        matrix = new int[n][n];
      }
      
      public void addEdge(int u, int v){
        matrix[u][v]=1;
        matrix[v][u]=1;
      }
      
      public void connectedComponent(int source, boolean visited[])
      {
        TreeSet<Integer> ts  = new TreeSet<>();
        Queue<Integer> q = new LinkedList<>();
        q.add(source);
        visited[source]=true;
       
        while(!q.isEmpty())
        {
          int curr = q.remove();
            ts.add(curr);
          
          for(int i=0;i<n;i++){
            if(matrix[curr][i]==1 && !visited[i]){
              visited[i]=true;
              q.add(i);
            }
          }
        }
        
        for(Integer t: ts){
          	System.out.print(t+" ");
        }
        
        System.out.println(); 
      }
    }
  
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int V = sc.nextInt();
		int E = sc.nextInt();
		
      Graph g = new Graph(V);
      
      for(int i=0;i<E;i++){
        int u = sc.nextInt();
        int v = sc.nextInt();
        g.addEdge(u, v);
      }
      
      boolean visited[] = new boolean[V];  
         
      
       g.connectedComponent(0, visited);
        
       boolean flag=true;
        for(int i=0;i<V;i++)
          if(visited[i]==false)
             g.connectedComponent(i, visited);  	
	}
}

---------------------------------------------------------------------------------------------------------------------------

Sample Input 1:
4 2
0 1
2 3
Sample Output 1:
0 1 
2 3 
Sample Input 2:
4 3
0 1
1 3 
0 3
Sample Output 2:
0 1 3 
2
