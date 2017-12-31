import java.util.*;

class graphMatixBFS {
    private int v;
    private int adj[][];
    
    graphMatixBFS(int v){
        this.v=v;
        adj = new int[v][v];
    }
    
    void addEdge(int u, int v){
        adj[u][v]=1;
    }
    
    
    void bfs(int source){
        boolean visited[] = new boolean[v];
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(source);
        visited[source]=true;
        
        while(!q.isEmpty())
        {
            int currrNode = q.remove();
            System.out.print(currrNode+" ");
            
            for(int j=0;j<v;j++){
                if(visited[j]==false && adj[currrNode][j]==1){
                    q.add(j);
                    visited[j]=true;
                }
            }   
        }
    }
    
    public static void main(String args[]){
        graphMatixBFS g = new graphMatixBFS(7);
	    g.addEdge(0,1);
	    g.addEdge(1,5);
	    g.addEdge(1,2);
	    g.addEdge(2,4);
	    g.addEdge(4,3);
	    g.addEdge(5,6);
	    
	    g.bfs(0);
    }
}   
