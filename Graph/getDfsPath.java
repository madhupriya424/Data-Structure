
import java.util.Scanner;

public class Solution {
	
  	static class Graph{
      int n; //vertixes;
      int matrix[][];
      
      Graph(int n){
        this.n = n;
        matrix = new int[n][n];
      }
      
      public void addEdge(int u, int v){
        matrix[u][v]=1;
        matrix[v][u]=1;
      }
      
      public void getPath(int source, int dest){
        boolean visited[] = new boolean[n];
        visited[source]=true;
        getPath(source, dest, visited);
      }
      
      public boolean getPath(int source, int dest, boolean visited[])
      {  
        for(int i=0;i<n;i++)
        {
          if(source==dest){
            System.out.print(source+" ");
             return true;
          } 
          else if(matrix[source][i]==1 && !visited[i])
          	 {
             visited[i]=true;
            boolean smallAns = getPath(i, dest, visited);
            if(smallAns){
              System.out.print(source+" ");
              return true;
            }
          }
        }
        return false;
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
      
        int source = sc.nextInt();
      	int dest = sc.nextInt();
      	
      g.getPath(source, dest);
	}
}
---------------------------------------------------------------------------------------------------------------------------------

Output Format :
Path from v1 to v2 in reverse order (separated by space)
Constraints :
2 <= V <= 1000
1 <= E <= 1000
0 <= v1, v2 <= V-1
Sample Input 1 :
4 4
0 1
0 3
1 2
2 3
1 3
Sample Output 1 :
3 0 1
Sample Input 2 :
6 3
5 3
0 1
3 4
0 3
