/*package whatever //do not write package name here */

import java.io.*;

class GFG {
    public static void isPath(int matrix[][], int n){
        
        boolean visited[][] = new boolean[n][n];
        boolean flag=false;
        
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(matrix[i][j]==1 && !visited[i][j])
                   if(isPath(matrix, i, j, visited)){
                    flag=true;
                    break;
                   }
                        
            }
        }
        if(flag)
            System.out.println("YES");
        else    
           System.out.println("NO");
    }
    
    public static boolean isSafe(int i, int j, int matrix[][]){
        if(i>=0 && i<matrix.length && j>=0 && j<matrix[0].length)
            return true;
        return false;    
    }
    
    public static boolean isPath(int matrix[][], int i, int j, boolean visited[][]){
        if(isSafe(i, j, matrix) && matrix[i][j]!=0 && !visited[i][j])
        {
            visited[i][j]=true;
        
        if(matrix[i][j]==2)
            return true;
        
        Boolean up = isPath(matrix, i-1, j, visited);
        if(up)
            return true;
        
        Boolean left = isPath(matrix, i, j-1, visited);
        if(left)
            return true;    
        
        Boolean down = isPath(matrix, i+1, j, visited);
        if(down)
            return true;
        
        Boolean right = isPath(matrix, i, j+1, visited);
        if(right)
            return true;
        }    
        return false;    
    }   
    
	public static void main (String[] args) {
	    int matrix[][] = {{0, 3, 0, 1},
	                      {3, 0, 3, 3},
	                      {2, 3, 3, 3},
	                      {0, 3, 3, 3}};
	                      
	   isPath(matrix, 4);                   // call this function 
	}
}
-----------------------------------------------------------------------------------------------------------------------------------

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
