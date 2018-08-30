/*package whatever //do not write package name here */

import java.io.*;

class GFG {
	public static void main (String[] args) {
	    //int n=4;
	int n=153;
	int temp=n;
	int a=0;
	while(n>0)
	{
	    int t = n%10;
	    a = a + (t*t*t); 
	    n=n/10;
	}
	if(a==temp)
	 System.out.print(a);
	}
	
int n=11;
	int i=2;
	for(i=2;i<n;i++)
	{
	    if(n%i==0)
	      break;
	}
	if(i==n)
	    System.out.print("prime");
	 else 
	   System.out.print("not prime");
	
}}
