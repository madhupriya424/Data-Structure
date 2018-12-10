Given a 2d grid map of '1's (land) and '0's (water), count the number of islands. An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.

Example 1:

Input:
11110
11010
11000
00000

Output: 1
Example 2:

Input:
11000
11000
00100
00011

Output: 3


----------------------------------------------------------------------------------------------------------------------------
class Solution {
    public int numIslands(char[][] grid) {
        if(grid.length==0)
            return 0;
        
        boolean visited[][]= new  boolean[grid.length][grid[0].length];
        
        int count=0;
        
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]=='1' && !visited[i][j]){
                    numIslands(i, j, grid, visited);
                        count++;
                }    
            }    
        }
        return count;
    }
        
         public boolean isSafe(int i, int j, char[][] grid){
             
             if(i<0 || i>=grid.length ||  j<0 || j>=grid[0].length)
                return false;
             return true;
         }
        
         public void numIslands(int i, int j, char grid[][], boolean visited[][]){
             visited[i][j]=true;
              
         if(isSafe(i-1, j, grid) && !visited[i-1][j] && grid[i-1][j] == '1')
            numIslands(i-1, j, grid, visited);
            
         if(isSafe(i, j-1, grid) && !visited[i][j-1] && grid[i][j-1] == '1')
            numIslands(i, j-1, grid, visited);
            
         if(isSafe(i+1, j, grid) && !visited[i+1][j] && grid[i+1][j] == '1') 
            numIslands(i+1, j, grid, visited);
            
         if(isSafe(i, j+1, grid) && !visited[i][j+1] && grid[i][j+1] == '1') 
            numIslands(i, j+1, grid, visited);   
         }   
    }
--------------------------------------------------------------------------------------------------------------------------------
    
 class Solution {
    
    public static boolean isSafe(int i, int j, boolean[][] matrix){
        int m = matrix.length;
        int n = matrix[0].length;
        
        if(i >=0 && i<m && j>=0 && j<n)
            return true;
        return false;
    }
    
    public static void dfs(int i, int j, char[][] grid, boolean[][] visited){
        if(isSafe(i,j,visited) && grid[i][j] == '1' && !visited[i][j]){
            visited[i][j] = true;
            
            //left
            dfs(i,j-1, grid, visited);
            
            //right
            dfs(i,j+1,grid, visited);
            
            //down
            dfs(i+1, j, grid, visited);
            
            //up
            dfs(i-1,j, grid, visited);
        }
    }
    
    public int numIslands(char[][] grid) {
        
        if(grid.length == 0)
            return 0;
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int count = 0;
        
        for(int i = 0; i<grid.length; i++){
            for(int j = 0;j<grid[i].length;j++){
                if(!visited[i][j] && grid[i][j] == '1'){
                    dfs(i,j, grid, visited);
                    count++;
                }
            }
        }
        return count;
    }
}   
