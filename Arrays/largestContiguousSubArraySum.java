// Kadane's algorithm

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
		int arr[]={-2, -3, 4 , -1 , -2 , 1 , 5 , -3};
		System.out.println(largestContiguousSubArraySum(arr));
	}
	
	// funtion to find largestContiguousSubArraySum
	static int largestContiguousSubArraySum(int a[])
	{
	   int PresMax=0;
	   int MaxSoFar=0;
	   for(int i=0;i<a.length;i++)
	       {
	           PresMax+=a[i];  
	           if(PresMax<0)
	              PresMax=0;
	           else if(PresMax>MaxSoFar)  //it Compare with the previously stored max value of aaray
	                   MaxSoFar=PresMax;
	       }
	   return MaxSoFar;    
    }     
}

//Time Complexity: O(n)
//Space Complexity: O(1)
