/*package whatever //do not write package name here */

import java.io.*;

class Matrix2D {
    
    
    public static int countPossiblePath(int m, int n){
        if(m==1|| n==1)
           return 1;
        
        return countPossiblePath(m-1, n)+ countPossiblePath(m, n-1);
    }
	public static void main (String[] args) {
		System.out.println(countPossiblePath(3, 3));
	}
}

# 6

By Using Recursion.
