Find whether there is path between two cells in matrix
Given N X N matrix filled with 1 , 0 , 2 , 3 . Find whether there is a path possible from source to destination, traversing through blank cells only. You can traverse up, down, right and left.

A value of cell 1 means Source.
A value of cell 2 means Destination.
A value of cell 3 means Blank cell.
A value of cell 0 means Blank Wall.
Note : there is only single source and single destination(sink).

Examples:

Input : M[3][3] = {{ 0 , 3 , 2 },
                   { 3 , 3 , 0 },
                   { 1 , 3 , 0 }};
Output : Yes

Input : M[4][4] = {{ 0 , 3 , 1 , 0 },
                   { 3 , 0 , 3 , 3 },
                   { 2 , 3 , 0 , 3 },
                   { 0 , 3 , 3 , 3 }};
Output : Yes
====================================================================================================



class FindPath {
  
  public static boolean findPath(int[][] maze){
    
    boolean visited[][] = new boolean[maze.length][maze[0].length];
    
    boolean res = false;
    
    for(int i=0;i<maze.length;i++)
    {
      for(int j=0;j<maze[i].length;j++)
      {
        if(maze[i][j]==1){
          res = findPath(maze, i, j, visited);
        }
      }
    }
    
    for(int i=0;i<maze.length;i++)
    {
      for(int j=0;j<maze[i].length;j++)
      {
        System.out.print(visited[i][j]+" ");
      }
      System.out.println();
    }
    
    return res;
  }
  
  public static boolean isSafe(int i, int j, int m, int n){
    return i >= 0 && i< m && j >= 0 && j < n;
  }
  
  public static boolean findPath(int maze[][], int i, int j, boolean visited[][]){
    int m = maze.length;
    int n = maze[0].length;
    
    if(!isSafe(i, j, m, n))
      return false;
    
    if(visited[i][j])
      return false;
    
    if(maze[i][j]==2)
      return true;
    
    if(maze[i][j]==0)
    	return false;
    else{
       visited[i][j]=true;
       //left
    		boolean left = findPath(maze, i, j-1, visited);	
      	if(left)
          	return true;
      //right
      	boolean right = findPath(maze, i, j+1, visited);
        if(right)
          	return true;
      //down
      	boolean down = findPath(maze, i+1, j, visited);
        if(down)
          	return true;
      //up
      	boolean up = findPath(maze, i-1, j, visited);
        if(up)
          	return true;
      	
      visited[i][j]=false;
      return false;
    }
  }
  
	public static void main(String[] args){
    int[][] maze = {{ 0 , 3 , 1 , 0 },
                   { 3 , 0 , 3 , 3 },
                   { 2 , 3 , 0 , 3 },
                   { 0 , 3 , 3 , 3 }};
    
    System.out.println(findPath(maze));
  }
}

#  false false true false 
false false true true 
false true false true 
false true true true 
true
