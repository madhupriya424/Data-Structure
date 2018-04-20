import java.io.*;

class RatMaze {

    
    public static boolean isSafe(int maze[][], int i, int j){
        return i>=0 && i<maze.length && j>=0 && j<maze[0].length;
    }

    
    public static boolean solveMaze(int maze[][], int i, int j, int visited[][]){
       
        if(i==maze.length-1 && j==maze[0].length-1){
            visited[i][j]=1;
            print(visited);
            visited[i][j]=0;
            return true;
        }
        
        if(!isSafe(maze, i, j))
            return false;
        
        if(visited[i][j]==1)
            return false;
        
        if(maze[i][j]==0)
            return false;
            
        else{
        visited[i][j]=1;    
        //forward
        boolean forward = solveMaze(maze, i, j+1, visited);

        //back
        boolean back = solveMaze(maze, i, j-1, visited);
        
        //down
        boolean down = solveMaze(maze, i+1, j, visited);
        
         //up
        boolean up = solveMaze(maze, i-1, j, visited);
        
        visited[i][j]=0;
        
        if(forward || back || down || up){
            return true;
        }
        return false;
        }
    }    
    
    public static void print(int visited[][]){
        for(int i=0;i<visited.length;i++)
        {
            for(int j=0;j<visited[0].length;j++)
            {
                System.out.print(visited[i][j]+" ");
            }
             System.out.println();
        }
        System.out.println();
    }
    
    
	public static void main (String[] args) {
	    RatMaze rat = new RatMaze();
        int maze[][] = {{1, 1, 1, 1},
                        {0, 1, 0, 1},
                        {0, 1, 0, 1},
                        {0, 1, 1, 1}};
        int visited[][] = new int[maze.length][maze[0].length];    
        
        if(!(maze[0][0]!=0 && rat.solveMaze(maze, 0, 0, visited)))
            System.out.println("Solution doesn't exist!");
        
	}
}

#  1 1 1 1 
0 0 0 1 
0 0 0 1 
0 0 0 1 

1 1 0 0 
0 1 0 0 
0 1 0 0 
0 1 1 1 
