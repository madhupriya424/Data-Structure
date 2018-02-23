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

# 0 1 4 2 3
