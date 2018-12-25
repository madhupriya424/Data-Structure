Perfect Numbers
        
Given a number N, check if a number is perfect or not. A number is said to be perfect if sum of all its factors excluding the number itself is equal to the number.

Input:
First line consists of T test cases. Then T test cases follow .Each test case consists of a number N.

Output:
For each testcase, in a new line, output in a single line 1 if a number is a perfect number else print 0.

Constraints:
1 <= T <= 300
1 <= N <= 104

Example:
Input:
2
6
21
Output:
1
0
----------------------------------------------------------------------------------------------------------------------------------
/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static boolean perfectNo(long n){
            long sum=0; 
            for(int i=1;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    if(n/i==i)
                       sum+=i;
                    else
                       sum+=i+(n/i);
                }
                  
            }
            sum-=n;
            if(sum==n)
               return true;
            return false;   
    }
    
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		long t = sc.nextLong();
		while(t-->0){
		long n = sc.nextLong();
		if(perfectNo(n))
		   System.out.println("1");
		else
		    System.out.println("0");
		}
	}
}
