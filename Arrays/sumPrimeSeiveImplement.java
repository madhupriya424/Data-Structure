Sum of all prime numbers between 1 and N.

Given a positive integer N, calculate the sum of all prime numbers between 1 and N(inclusive).

Input:
The first line of input contains an integer T denoting the number of test cases. T testcases follow. Each testcase contains one line of input containing N.

Output:
For each testcase, in a new line, print the sum of all prime numbers between 1 and N.

Constraints:
1 ≤ T ≤ 100
1 ≤ N ≤ 106

Example:
Input:
2
5
10
Output:
10
17
----------------------------------------------------------------------------------------------------------------------------------

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void sieve(int n){
        boolean prime[] = new boolean[n+1];
    
        for(int i=0;i<=n;i++)
            prime[i]=true;
        
        for(int i=2;i*i<=n;i++){
            if(prime[i]==true){
                for(int p=i*i; p<=n; p+=i)
                {
                    prime[p]=false;
                }
            }
        } 
        
        long sum=0;
        for(int i=2;i<=n;i++)
           if(prime[i]==true)
             sum+=i;            //System.out.print(i+" ");
        System.out.println(sum);     
    }
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		long t = sc.nextLong();
		while(t-->0){
		    int n = sc.nextInt();
		    sieve(n);
		}
	}
}
