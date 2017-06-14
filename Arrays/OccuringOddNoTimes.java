//BY USING HASHMAP
//TIME COMPLEXITY: O(n)
//SPACE COMPLEXITY: O(n)

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
		int arr[]={1, 2, 3, 2, 3, 1, 3};
		OccuringOddNo(arr);
	}
	
	static void OccuringOddNo(int a[])
	{
	    HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
	    for(int i=0;i<a.length;i++)
	    {
	        if(!hm.containsKey(a[i]))
	          hm.put(a[i], 1);
	        else
	          hm.put(a[i], hm.get(a[i])+1);
	    }
	    

//  for(Map.Entry<Integer, Integer> entry : hm.entrySet())
//  we can also write it as Line 28:		
        for(int i=0;i<a.length;i++)
	    {
	        if(hm.get(a[i])%2!=0)
	        {
	          System.out.println(a[i]);
	          break;
	        }  
	    }
     }
}     


// Method 2 : More efficient than above code
//  XOR Operation

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
		int arr[]={1, 2, 3, 2, 3, 1, 3};
		OccuringOddNo(arr);
	}
	
	static void OccuringOddNo(int a[])
	{
	   int res=0;
	   for(int i=0;i<a.length;i++)
	       res = res^a[i];         // Performing Xor Operation
     System.out.print(res);
    }     
}

//TIME COMPLEXITY: O(n)
//SPACE COMPLEXITY: O(1)
