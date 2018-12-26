/*package whatever //do not write package name here */
Closest Number******************

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int q = n/m;
		int n1 = m*q;
		int n2 = 0;
		
		if(n*m>0)
		    n2 = m*(q+1);
		else
		    n2 = m*(q-1);
		    
		int res = Math.abs(n-n1) < Math.abs(n-n2) ?  n1 : n2;    
		System.out.println(res);
	
		}
		}
}
-----------------------------------------------------------------------------------------------------------------------------------

Submissions: 17099   Accuracy: 26.68%   Difficulty: Basic   Marks: 1
        
Given two integers N and M. The problem is to find the number closest to N and divisible by M. If there are more than one such number, then output the one having maximum absolute value.

Input:
The first line consists of an integer T i.e number of test cases. T testcases follow.  The first and only line of each test case contains two space separated integers N and M.

Output:
For each testcase, in a new line, print the closest number to N which is also divisible by M.

Constraints: 
1 <= T <= 100
-1000 <= N, M <= 1000

Example:
Input:
2
13 4
-15 6
Output:
12
-18
