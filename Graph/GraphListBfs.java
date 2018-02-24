/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GraphListBfs {
    private int v;
    private LinkedList<Integer> adj[];
    
    GraphListBfs(int v){
        this.v = v;
        adj = new LinkedList[v];
        for(int i=0;i<v;i++)
            adj[i] = new LinkedList<>();
    }
    
    void addEdge(int u, int v){
        adj[u].add(v);
    }
   
        
    void bfs(int s){
        
        boolean visited[] = new boolean[v];
        visited[s]=true;
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(s);
        
        while(!q.isEmpty())
        {
         s = q.remove();
        System.out.print(s+" ");
        
         for(int i: adj[s])
        {
            if(!visited[i])
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
	    GraphListBfs g = new GraphListBfs(7);
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

#  0 1 4 2 3 
