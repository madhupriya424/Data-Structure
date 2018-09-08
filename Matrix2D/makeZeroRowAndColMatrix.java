

import java.io.*;

class MyCode {
  
  public static void makeZero(int matrix[][], int row, int col ){
    for(int i=0;i<matrix[0].length;i++){
       matrix[row][i]=0;
    }
    
     for(int i=0;i<matrix.length;i++){
       matrix[i][col]=0;
    }
  }
  
  
  public static void makeZero(int matrix[][]){
    for(int i=0;i<matrix.length;i++){
      for(int j=0;j<matrix[0].length;j++){
        if(matrix[i][j]==0){
           makeZero(matrix, i, j);
        }
      }
    }
  }
  
  public static void main (String[] args) {
    
    int[][] matrix = {{1,2,3}, {4,6,7}, {8,9,0}};
    makeZero(matrix);
    for(int i=0;i<matrix.length;i++){
      for(int j=0;j<matrix[0].length;j++){
        System.out.print(matrix[i][j]+" ");
      }
      System.out.println();
    }
    
    
  }
}

output:
1 2 0 
4 6 0 
0 0 0
