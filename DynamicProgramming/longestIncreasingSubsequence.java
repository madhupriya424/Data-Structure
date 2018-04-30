
/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
	    int arr[] = {3, 4, -1, 0, 6, 2, 3};
		System.out.println("longestIncreasingSubsequence: "+longestIncreasingSubsequence(arr));	
	}
	
	public static int max(int a, int b){
	    return a>b ? a : b;
	}
	
	public static int longestIncreasingSubsequence(int arr[]){
	    
	    int matrix[] = new int[arr.length];
	    
	    for(int i=0;i<matrix.length;i++)
	        matrix[i]=1;
	        
	        int i=1;
	        while(i<arr.length)
	        {
	            int j=0;     
	            while(j<i)
	            {
	                if(arr[j]<arr[i])
    	                matrix[i]= max(matrix[j]+1, matrix[i]);
	                j++; 
	            }
	            i++;
	        }
	        
	     //find maximumIncreasing sequence from the array
	     
	     int max=Integer.MIN_VALUE;
	     for(int k=0;k<matrix.length;k++)
	        if(max<matrix[k])
	            max=matrix[k];
	            
	     return max;
	}
}

# 4
