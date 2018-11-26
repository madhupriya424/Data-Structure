/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GraphMatrixBfs {
    private int v;
    private int adj[][];
    
    GraphMatrixBfs(int v){
        this.v = v;
        adj = new int[v][v];
    }
    
    void addEdge(int u, int v){
        adj[u][v]=1;
        adj[v][u]=1;
    }
    
    void bfs(int s){
        boolean visited[] = new boolean[v];
     
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(s);
        visited[s]=true;
        
        while(!q.isEmpty())
        {
         s = q.remove();
        System.out.print(s+" ");
        
         for(int i=0;i<v;i++)
         {
            if(adj[s][i]==1 && !visited[i])
            {
                visited[i]=true;
                q.add(i);
            }
              
          }
        }
    }
    /*
    0----------1\
    |        / | \
    |       /  |  \
    |      /   |   2
    |     /    |  /
    |    /     | /
    4----------3/
    */
	public static void main (String[] args) {
	    GraphMatrixBfs g = new GraphMatrixBfs(7);
	    g.addEdge(0,1);
	    g.addEdge(0,4);
	    g.addEdge(1,2);
	    g.addEdge(1,3);
	    g.addEdge(1,4);
	    g.addEdge(2,3);
	    g.addEdge(3,4);
	
	    g.bfs(0);
	}
}



-----------------------------------------------------------------------------------------------------------------------

import java.util.*;

public class Solution {
	
   static class Graph{
     int n; // vertices
     int matrix[][];
     
     Graph(int n){
       this.n = n;
       matrix = new int[n][n];
     }
     
     public void addEdge(int u, int v){
       matrix[u][v]=1;
       matrix[v][u]=1;
     }
     
     
     
     public void bfs(int source){
       Queue<Integer> q = new LinkedList<>();
       q.add(source);
       
       boolean visited[] = new boolean[n];
       visited[source]=true;
       
       while(!q.isEmpty()){
         
         int current = q.remove();
         System.out.print(current+" ");
         
         for(int i=0;i<n;i++){
           
         if(matrix[current][i]==1 && !visited[i]){
           	q.add(i);
         	 visited[i]=true;
         	}
         }   
       }
     }
   }
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int V = s.nextInt();
		int E = s.nextInt();
		
      Graph g = new Graph(V);
      
      	for(int i=0;i<E;i++){
          int u = s.nextInt();
          int v = s.nextInt();
          g.addEdge(u, v);
        }
          
		g.bfs(0);
       
	}
}

# 0 1 4 2 3
