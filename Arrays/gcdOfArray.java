GCD of Array

Given an array of N positive integers. Your task is to find the GCD of all numbers of the array.

Input:
First line of input contains number of test cases T. First line of test case contains a positive integer N, size of the array. Next line contains the array elements.

Output:
For each testcase, print the GCD of array elements.

Constraints:
1 <= T <= 100
1 <= N <= 106
1 <= Arr[i] <= 106

Example:
Input:
1
2
5 10

Output:
5
----------------------------------------------------------------------------------------------------------------------------

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static int gcd(int a, int b){
        if(a==0)
          return b;
        if(b==0)
          return a;
        
        return gcd(b%a, a);  
    }
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt();
		    int a[] = new int[n];
		    for(int i=0;i<n;i++){
		        a[i]=sc.nextInt();
		    }
		    
	          int ans = a[0];	    
		      for(int i=1;i<n;i++){
		         ans = gcd(ans, a[i]);
		      }
		      
		      System.out.println(ans);
		}
	}
}
