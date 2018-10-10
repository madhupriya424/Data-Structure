/*package whatever //do not write package name here */

import java.io.*;

class GFG {
	public static void main (String[] args) {
		int n=-78;
		
		
		while(n/10!=0)
		{
		  int s=0;  
		  while(n!=0)
		  {
		    s=s+(n%10);
		    n=n/10;
		  }
		n = s;
	   }
		System.out.println(n);
	  }
}

output: 6
