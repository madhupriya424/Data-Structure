/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class GraphListDfs
{
    private int v;
    private LinkedList<Integer> adj[];
    
    GraphListDfs(int v){
        this.v= v;
        adj = new LinkedList[v];
        
        for(int i=0;i<v;i++)
           adj[i] = new LinkedList<>();
    }
    
    void addEdge(int u, int v){
        adj[u].add(v);
    }
    
    
    void dfs(int s){
        boolean visited[] = new boolean[v];
        visited[s]=true;
        dfs(s, visited);    
    }
    
    void dfs(int s, boolean visited[]){
        System.out.print(s+" ");
        
        for(int i:adj[s])
        {
            if(!visited[i])
            {
                visited[i]=true;
                dfs(i, visited);
            }
        }
    }
    
    
	public static void main (String[] args) throws java.lang.Exception
	{
		GraphListDfs g = new GraphListDfs(7);
	    g.addEdge(0,1);
	    g.addEdge(0,4);
	    g.addEdge(1,2);
	    g.addEdge(1,3);
	    g.addEdge(1,4);
	    g.addEdge(2,3);
	    g.addEdge(3,4);
	    
	    g.dfs(0);
	}
}

# 0 1 2 3 4 
	
//

/*package whatever //do not write package name here */

import java.util.*;

class Graph {
    // Adjacency matrix
    private int v;
    private LinkedList<Integer> adj[];
    
    Graph(int v){
        this.v = v;
        adj = new LinkedList[v];
        for(int i = 0; i < v; i++) {
            adj[i] = new LinkedList<Integer>();
        }
    }
    
    public void addEdge(int u, int v) {
        adj[u].add(v);
    }
    
    public void dfs(int src) {
        boolean visited[] = new boolean[v];
        // visited[src] = true;
        dfs(src, visited);
    }
    
    public void dfs(int src, boolean visited[]) {
        
        visited[src] = true;
        System.out.print(src+" ");
        
        for(int i = 0; i < adj[src].size(); i++) { 
            if(!visited[adj[src].get(i)]) {
                dfs(adj[src].get(i), visited);
            }
        }
    }
    
	public static void main (String[] args) {
	    Graph g = new Graph(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        
        g.dfs(2);
	}
}
	
