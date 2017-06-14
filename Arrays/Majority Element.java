import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
		int arr[]={3, 3, 4, 2, 4, 4, 2, 4, 4};
		Majority(arr);
	}
	
  //FUNCTION TO FIND MAJORITY ELEMENT
	static void Majority(int a[])
	{
	    HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
	    for(int i=0;i<a.length;i++)
	    {
	        if(!hm.containsKey(a[i]))  //STORE THE KEY WITH VALUE 1
	          hm.put(a[i], 1);
	        else
	          hm.put(a[i], hm.get(a[i])+1); //ADD THE VALUE 1 FOR THE AVAILABLE KEY
	    }
	    
	    int flag=0;
	    int n = a.length;
	    
// for(Map.Entry<Integer, Integer> entry : hm.entrySet())  #INSTEAD OF WRITING THIS WE CAN ALSO WRITE LINE 24:

        for(int i=0;i<a.length;i++)
	    {
	        if(hm.get(a[i])>=(n+1)/2)  
	        {
	          System.out.println(a[i]);
	          flag=1;   //IT SHOWS WE GET THE VALUE
	          break;
	        }  
	    }
	    if(flag==0)  //IF WE DID'T GET ANY VALUE IN MAJORITY PRINT "NONE"
	    System.out.println("None");
     }
}     
