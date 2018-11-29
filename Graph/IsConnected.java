

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
      
      public void connectedComponent(int source)
      {
        Queue<Integer> q = new LinkedList<>();
        q.add(source);
        boolean visited[] = new boolean[n];
        
        while(!q.isEmpty())
        {
          int curr = q.remove();
         // System.out.print(curr+" ");
          
          for(int i=0;i<n;i++){
            if(matrix[curr][i]==1 && !visited[i]){
              visited[i]=true;
              q.add(i);
            }
          }
        }
       
        boolean flag=true;
        for(boolean b: visited)
        	if(b==false)
            {
              flag=false;
            	break;
            }
        
        if(flag)
        	System.out.println("true");
        else
          	System.out.println("false");
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
      
      g.connectedComponent(0);
      	
	}
}


------------------------------------------------------------------------------------------------------------------

Sample Input 1:
4 4
0 1
0 3
1 2
2 3
Sample Output 1:
true
Sample Input 2:
4 3
0 1
1 3 
0 3
Sample Output 2:
false 
