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
	    

//	    for(Map.Entry<Integer, Integer> entry : hm.entrySet())
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
