/*package whatever //do not write package name here */

import java.io.*;

class Matrix2D {
    
    
    public static int countPossiblePath(int m, int n){
        int i=0,j=0;
        
        int dp[][] = new int[m][n];
        
        for( i=0;i<m;i++)
            {
             for( j=0;j<n;j++)
              {
                if(i==0 || j==0)
                    dp[i][j]=1;
                else{
                        dp[i][j]=dp[i][j-1]+ dp[i-1][j];
                    }
              }
            }
        return dp[i-1][j-1];    
    }
	public static void main (String[] args) {
	  
		System.out.println(countPossiblePath(3, 4));
	}
}
