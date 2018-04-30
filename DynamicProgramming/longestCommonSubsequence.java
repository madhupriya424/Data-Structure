LCS for input Sequences “ABCDGH” and “AEDFHR” is “ADH” of length 3.
LCS for input Sequences “AGGTAB” and “GXTXAYB” is “GTAB” of length 4.


/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
	    String str1="ABCDAF";
	    String str2="ACBCF";
	    
		System.out.println("longestCommonSubsequence: "+longestCommonSubsequence(str1, str2));	
	}
	
	public static int longestCommonSubsequence(String str1, String str2){
	    
	    int matrix[][] = new int[str1.length()+1][str2.length()+1];
	    for(int i=0;i<=str1.length();i++)
	    {
	        for(int j=0;j<=str2.length();j++)
	        {
	            if(i==0||j==0)
	                matrix[i][j]=0;
	            else if(str1.charAt(i-1)==str2.charAt(j-1))
	                matrix[i][j]=1+matrix[i-1][j-1];
	            else
	                matrix[i][j]=Math.max(matrix[i-1][j], matrix[i][j-1]);
	        }
	     }
	     return matrix[str1.length()][str2.length()];
	}
}

# 4
