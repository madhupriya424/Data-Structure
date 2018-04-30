/*package whatever //do not write package name here */
/* Dynamic Programming | Set 5 (Edit Distance)
Given two strings str1 and str2 and below operations that can performed on str1. Find minimum number of edits (operations) required to convert ‘str1’ into ‘str2’.

Insert
Remove
Replace
All of the above operations are of equal cost */

import java.io.*;


class EditDistance {
	public static void main (String[] args) {
	    String str1 ="sunday";
	    String str2 ="saturday";
	    
		System.out.println("Total Operation: "+editDistance(str1, str2));
	}
	
	
	public static int min(int a, int b, int c){
	    if(a<b && a<c)
	        return a;
	    if(b<a && b<c)
	         return b;
	    else
	         return c;
	}
	
	
	public static int editDistance(String str1, String str2){
	    
	    int matrix[][]= new int[str1.length()+1][str2.length()+1];
	    
/*	    for(int i=0;i<matrix.length;i++)
	        matrix[i][0]=i;
	        
	    for(int i=0;i<matrix[0].length;i++)
	        matrix[0][i]=i;
*/	   
	    for(int i=0;i<matrix.length;i++)
	    {
	        for(int j=0;j<matrix[0].length;j++)
	        {
	            if(i==0)
	                matrix[i][j]=j;
	             else if(j==0)
	                 matrix[i][j]=i;
	                 
	            else if(str1.charAt(i-1)==str2.charAt(j-1))
	                matrix[i][j]= matrix[i-1][j-1];
	            else
	               matrix[i][j]= 1+min(matrix[i-1][j], matrix[i-1][j-1], matrix[i][j-1]);
	        }
	    }
	    return matrix[matrix.length-1][matrix[0].length-1];
	}
}
