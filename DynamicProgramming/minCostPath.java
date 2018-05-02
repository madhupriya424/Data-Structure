/*package whatever //do not write package name here */

import java.io.*;

class GFG {
	public static void main (String[] args) {
	     int cost[][] = { {1, 2, 3},
                            {4, 8, 2},
                            {1, 5, 3} };
		System.out.println(minCostPath(cost));
	}
	
	public static int min(int a, int b, int c){
	    if(a<b && a<c)
	        return a;
	     else if(b<c && b<a)
	        return b;
	      else
	        return c;
	}
	
	public static int minCostPath(int arr[][]){
	    int matrix[][] = new int[arr.length][arr[0].length];
	     matrix[0][0]=1;
	     
	     for(int i=1;i<arr[0].length;i++)
	         matrix[0][i]= arr[0][i]+matrix[0][i-1];
	     
	     for(int i=1;i<arr.length;i++)
	         matrix[i][0]= arr[i][0]+matrix[i-1][0];
	         
	     for(int i=1;i<matrix.length;i++)
	     {
	       for(int j=1;j<matrix[0].length;j++)
	        {
	            matrix[i][j]= arr[i][j] + min(matrix[i][j-1], matrix[i-1][j], matrix[i-1][j-1]);
	        }
	     }
	     
	   //  for(int i=0;i<matrix.length;i++)
	   //  {
	   //    for(int j=0;j<matrix[0].length;j++)
	   //     {
	   //         System.out.print(matrix[i][j]+" ");
	   //     }
	   //     System.out.println();
	   //  }     
	     
	     return matrix[arr.length-1][arr[0].length-1];
	}
}

# 8
1 3 6 
5 9 5 
6 10 8 
8
