
/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    String strA[]=new String[n];
	    float priceA[]=new float[n];
	   HashMap<String, Float> hm = new HashMap<>();
	    for(int i=0;i<n;i++)
	        {
	            strA[i]=sc.next();
	            priceA[i]=sc.nextFloat();
	            hm.put(strA[i], priceA[i]);
	        }
	        
	    int m = sc.nextInt();
	    String strB[]=new String[m];
	    float priceB[]=new float[m];
	    int count=0;
	    for(int i=0;i<m;i++)
	        {
	            strB[i]=sc.next();
	            priceB[i]=sc.nextFloat();
	            if(hm.containsKey(strB[i]))
	               if(hm.get(strB[i])!=priceB[i])
	                count++;
	        }  
	        
		System.out.println(count);
	}
}

# 4
rice 16.89
sugar 56.92
wheat 20.89
cheese 345.99
2
rice 18.99
cheese 400.89
 
 @2
