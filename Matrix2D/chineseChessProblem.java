/*package whatever //do not write package name here */

import java.io.*;

class chineseChess {
    
    public static void solveChess(int x[], int y[], int size){
        
        int chess[][] = new int[size][size];
        chess[x[0]][y[0]]=2;
        
        for(int i=1;i<x.length;i++)
        {
            chess[x[i]][y[i]]=1;
        }
        
        System.out.println(impChess(chess, x[0], y[0], size));
    }
    
    public static boolean issafe(int x, int y, int size){
            return  (x>=0 && y>=0 && x<size && y<size);
        }
    
    public static int impChess(int chess[][], int x, int y, int size){
        
          int count=0;
        
        //upper left
        if(issafe(x, y, size) && chess[x-1][y]==1)
            if(chess[x-2][y-1]==1)
                count++;
        
        
        //upper right
        if(issafe(x, y, size) && chess[x-1][y]==1)
            if(chess[x-2][y+1]==1)
                count++;
                
        
        //bottom left
        if(issafe(x, y, size) && chess[x+1][y]==1)
            if(chess[x+2][y-1]==1)
                count++;
                
        
        //bottom right
        if(issafe(x, y, size) && chess[x+1][y]==1)
            if(chess[x+2][y+1]==1)
                count++;        
       
        //left bottom
        if(issafe(x, y, size) && chess[x][y-1]==1)
            if(chess[x+1][y-2]==1)
                count++;  
                
        //left upper
        if(issafe(x, y, size) && chess[x][y-1]==1)
            if(chess[x-1][y-2]==1)
                count++; 
        
        //right upper
        if(issafe(x, y, size) && chess[x][y+1]==1)
            if(chess[x-1][y+2]==1)
                count++; 
                
        //right bottom
        if(issafe(x, y, size) && chess[x][y+1]==1)
            if(chess[x+1][y+2]==1)
                count++;    
                
       return count; 
    }
    
	public static void main (String[] args) {
	    int[] x = {3,1,2,1,5,5,5,4,3, 2};
	    int[] y = {3,2,3,4,2,4,3,3, 2, 1};
	    
		solveChess(x, y, 8);
	}
}

# 5
