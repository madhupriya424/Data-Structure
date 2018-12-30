Submissions: 331   Accuracy: 4.08%   Max. Score: 100

Given an array A of size N. The task is to detect whether loop exists in given array or not.

Input: First line of input contains number of testcases T. For each testcase, there will be two lines, first of which contains size of array N and next line contains N integers.

Output: For each testcase, print "0" (without quotes) if loop doesn't exists, else print "1" (without quotes).

Constraints:
1 <= T <= 100
1 <= N <= 106
1 <= A[i] <= 106

Example:
Input:
1
4
1 2 3 0

Output:
1

Explanation:
Testcase 1: Element at 0(1) is connected to 1, 1(2) is connected to 2, 2(3) is connected to 3, 3(0) is connected is to 0 which forms a loop. 1 ->2 ->3 -> 0 ->1.




/*package whatever //do not write package name here */

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
		    int a[] = new int[n];
		    for(int i=0;i<n;i++){
		        a[i]=sc.nextInt();
		    }
		    
		    boolean found = false;
		    for(int i=0;i<n;i++)
		    {
		        HashSet<Integer> hs = new HashSet<>();
		        if(i==0)
		           hs.add(0);
		        
		        int j=i;     
		        while(j>=0 && j<n)
		        {
		            if(hs.contains(a[j])){
		                found = true;
		                break;
		            }else{
		                hs.add(a[j]);
		                j=a[j];
		            }      
		        }
		    }        
		    
		    if(found)
		       System.out.println("1");
		   else
		      System.out.println("0");
		        
		 
		}

	}
}
