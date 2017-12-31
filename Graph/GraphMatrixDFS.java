import java.util.*;

class graphMatixDFS {
    private int v;
    private int adj[][];
    
    graphMatixDFS(int v){
        this.v=v;
        adj = new int[v][v];
    }
    
    void addEdge(int u, int v){
        adj[u][v]=1;
    }
    
    
    void dfs(int source){
        boolean visited[] = new boolean[v];
        visited[source]=true;
        dfs( source, visited);
    }
    
    
    void dfs(int i, boolean visited[]){
        System.out.print(i+" ");
        
        for(int j=0;j<v;j++){
            if(visited[j]==false && adj[i][j]==1){
                visited[j]=true;
                dfs(j,visited);
            }
        }
    }
        
      
    
    
    public static void main(String args[]){
        graphMatixDFS g = new graphMatixDFS(7);
	    g.addEdge(0,1);
	    g.addEdge(1,5);
	    g.addEdge(1,2);
	    g.addEdge(2,4);
	    g.addEdge(4,3);
	    g.addEdge(5,6);
	    
	    g.dfs(0);
    }
}   
