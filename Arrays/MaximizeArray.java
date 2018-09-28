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
		    for(int i=0;i<n;i++)
		        a[i] = sc.nextInt();
		    Arrays.sort(a);
		    long res =0;
		    for(int i=0;i<n;i++)
		    {
		        res += (a[i]*i); 
		    }
		    System.out.println(res%1000000007);
		}
	}
}

Input:
2
5
5 3 2 4 1
3
1 2 3
Output:
40
8

Explanation:
Testcase1: If we arrange the array as 1 2 3 4 5 then we can see that the minimum index will multiply with minimum number and maximum index will multiply with maximum number. So 1*0+2*1+3*2+4*3+5*4=0+2+6+12+20 =40 mod(109+7) = 40
