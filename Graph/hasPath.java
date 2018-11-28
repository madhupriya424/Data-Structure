import java.util.Scanner;

	public class Solution {
      
  	static class Graph{
      int n; //vertex
      int matrix[][];
      
      Graph(int n){
        this.n = n;
        matrix = new int[n][n];
      }
      
      public void addEdge(int u, int v){
       matrix[u][v]=1;
        matrix[v][u]=1;
      }
      
      public void hasPath(int source, int dest){
        boolean visited[] = new boolean[n];
        visited[source]=true;
        System.out.println(hasPath(source, dest, visited));
      }
      
      public boolean hasPath(int source, int dest, boolean visited[]){      
        for(int i=0;i<n;i++){
         // System.out.println("i"+" "+i);
          if(source==dest){
            	// System.out.print("source"+" "+source+" "+dest);
            	return true;
          }
          else if(matrix[source][i]==1 && !visited[i]){
            	visited[i]=true;
            	boolean smallAns = hasPath(i, dest, visited);
            	if(smallAns)
                  return true;
          }
        }
        return false;
      }
      
    }
  
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int V = sc.nextInt();
		int E = sc.nextInt();

      	Graph g = new Graph(V);
      
		for(int i=0;i<E;i++){
          int u = sc.nextInt();
          int v = sc.nextInt();
          g.addEdge(u, v);
        }
      	
      	int source = sc.nextInt();
      	int dest = sc.nextInt();
      	g.hasPath(source, dest);
	}
}


--------------------------------------------------------------------------------------------------------------------------
Sample Input 1 :
4 4
0 1
0 3
1 2
2 3
1 3
Sample Output 1 :
true
Sample Input 2 :
6 3
5 3
0 1
3 4
0 3
Sample Output 2 :
false
