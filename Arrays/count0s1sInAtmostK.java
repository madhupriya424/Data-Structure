/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
    public static String query(int Zeroth[], int Oneth[], int x, int y, int k){
       
       if((Zeroth[y]-Zeroth[x-1]>k) || (Oneth[y]-Oneth[x-1]>k))
          return "No";
        else
        return "Yes";
              
    }
    //1
    // 00101011
    // 1 4
    // 2 5
    // 5 7
    
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    int t = sc.nextInt();
	    while(t-->0){
	   
	    int n = sc.nextInt();    
	    int q = sc.nextInt();
	    int k=sc.nextInt();
	    
	    String str=sc.next();
	    
	    int Zeroth[]= new int[str.length()];
        int Oneth[]= new int[str.length()];
        
        int i=0;
        if(str.charAt(i)=='0')
                Zeroth[i]=1;
        else
                Oneth[i]=1;
                
        for( i=1;i<Zeroth.length;i++)
        {
            if(str.charAt(i)=='0')
                Zeroth[i]=Zeroth[i-1]+1;
            else    
                Zeroth[i]=Zeroth[i-1];    
        }
        
        for( i=1;i<Oneth.length;i++)
        {
            if(str.charAt(i)=='1')
                Oneth[i]=Oneth[i-1]+1;
            else    
                Oneth[i]=Oneth[i-1];    
        }   
        
	    while(q-->0)
	    {
	    int x=sc.nextInt();
	    int y = sc.nextInt();
	    
	    System.out.println(query(Zeroth, Oneth, x, y, k));
	    }
	   
		
	}
}
}

1
8 3 2
01111011
1 4
2 5
5 7

#No
No
Yes
