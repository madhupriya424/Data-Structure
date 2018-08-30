/*package whatever //do not write package name here */

import java.io.*;

class GFG {
	public static void main (String[] args) {
	    int n =10;
	     System.out.print(0+" "+1+" ");
	//	fibonnaciwithRecursion(n, 0, 1);
	//	System.out.print(fib(n));
	    fibWithDP(n);
	    
	}
	
	
	public static void fibonnaciWithoutRecursion(int n){
	    int a=0, b=1;
	    System.out.print(a+" "+b+" ");
	    n=n-2;
	    while(n-->0)
	    {
	        int c=a+b;
	        System.out.print(c+" ");
	        a=b;
	        b=c;
	    }
	}
// 	Time Complexity: O(n)
// Extra Space: O(1)
	
	public static void fibonnaciwithRecursion(int n, int a, int b){
	    if(n==2)
	        return;
	    int c = a+b;
	    System.out.print(c+" ");
	    a=b;
	    b=c;
	    fibonnaciwithRecursion(n-1, a, b);
	    
	}
	
	public static int fib(int n){
	    if(n<=1)
	        return n;
	   return fib(n-1)+fib(n-2);     
	}
// 	Time Complexity: T(n) = T(n-1) + T(n-2) which is exponential.

	public static void fibWithDP(int n){
	    int fib[]=new int[n+2];
	    fib[0]=0;
	    fib[1]=1;
	    for(int i=2;i<=n;i++)
	        fib[i]=fib[i-1]+fib[i-2];
	        
	   for(int i=0;i<n;i++)
	        System.out.print(fib[i]+" ");
	}
// 	Time Complexity: O(n)
//     Extra Space: O(n)
}
