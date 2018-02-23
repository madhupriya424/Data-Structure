/*package whatever //do not write package name here */

import java.io.*;

class GraphMatrixDfs {
    private int v;
    private int adj[][];
    
    GraphMatrixDfs(int v){
        this.v = v;
        adj = new int[v][v];
    }
    
    void addEdge(int u, int v){
        adj[u][v]=1;
        adj[v][u]=1;
    }
    
    void dfs(int source){
        boolean visited[] = new boolean[v];
        visited[source]=true;
        dfs(source, visited);
    }    
        
    void dfs(int i, boolean visited[]){
        
        System.out.print(i+" ");
        
         for(int j=0;j<v;j++)
        {
            if(adj[i][j]==1 && !visited[j])
            {
                visited[j]=true;
                dfs(j, visited);
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
	    GraphMatrixDfs g = new GraphMatrixDfs(7);
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
