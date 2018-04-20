/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class HLTU {
    
    public static boolean findH(int board[][], int i, int j){
        
        if(board[i][j]==1 && board[i+1][j]==1 && board[i+2][j]==1 && board[i+1][j+1]==1 && board[i][j+2]==1 &&
            board[i+1][j+2]==1 && board[i+2][j+2]==1)
            {
                makeItZeroH(board, i, j);
                return true;
            } 
            
        if(board[i][j] == 1 && board[i][j+1] == 1 && board[i][j+2] ==1
           && board[i+1][j+1] == 1 && board[i+2][j] == 1 && board[i+2][j+1] == 1
           && board[i+2][j+2] == 1){
               
               makeItZeroH(board, i, j);
               return true;
           }  
           
        return false;    
    }
    
    public static boolean findL(int board[][], int i, int j){
        
        if(board[i][j]==1 && board[i+1][j]==1 && board[i+2][j]==1 && board[i+2][j+1]==1 
             && board[i+2][j+2]==1)
            {
                makeItZeroL(board, i, j);
                return true;
            } 
        return false;    
    }
    
    public static boolean findT(int board[][], int i, int j){
        
        if(board[i][j]==1 && board[i][j+1]==1 && board[i][j+2]==1 && board[i+1][j+1]==1 
            && board[i+2][j+1]==1)
            {
                makeItZeroT(board, i, j);
                return true;
            }
        return false;    
    }
    
    public static void makeItZeroH(int board[][], int i, int j){
        board[i][j]=0;
        board[i+1][j]=0;
        board[i+2][j]=0;
        board[i+1][j+1]=0;
        board[i][j+2]=0;
        board[i+1][j+2]=0;
        board[i+2][j+2]=0;
    }
    
    public static void makeItZeroL(int board[][], int i, int j){
        
        board[i][j]=1;
        board[i+1][j]=1;
        board[i+2][j]=1;
        board[i+2][j+1]=1;
        board[i+2][j+2]=1;
    }
    
    public static void makeItZeroT(int board[][], int i, int j){
        
        board[i][j]=1;
        board[i][j+1]=1;
        board[i][j+2]=1;
        board[i+1][j+1]=1;
        board[i+2][j+1]=1;
    }
    
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int chessSize = sc.nextInt();
	    int query = sc.nextInt();
	    
	    int board[][] = new int[chessSize][chessSize];
	    
	    while(query-->0)
	    {
	        int row = sc.nextInt();
	        int col = sc.nextInt();
	        board[row][col]=1;
	    }
	    
	    int count=0;
	    
	    for(int i=0;i<board.length-2;i++)
	    {
	        for(int j=0;j<board[0].length-2;j++)
	        {
	            if(findH(board, i, j))
	                count++;
	            else if(findL(board, i, j))
	                count++;
	            else if(findT(board, i, j))
	                count++;     
	        }
	    }
	    
		System.out.println("count:"+count);
	}
}
