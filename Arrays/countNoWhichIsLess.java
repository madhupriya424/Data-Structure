/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
    
    public static int countNoWhichLess(int arr[], int key){
        int start=0;
        int end=arr.length-1;
        boolean flag=false;
        int index=-1;
        while(start<=end)
        {
            int mid = (start+end)/2;
            
            if(arr[mid]==key)
            {
                flag=true;
                index=mid;
                index++;
            }
            else if(arr[mid]<key)
            {
                start=mid+1;12
            }
            else
                end=mid-1;
            
            if(flag)
            {
                while(index<arr.length && arr[index]==key)
                    index++;
                return index;    
            } 
        }
         return start;
    }
	public static void main (String[] args) {
	    int a[]={2, 10, 5, 4, 8};
	    int b[]={3, 1, 7, 8};
	    Arrays.sort(a);
	    int res[]=new int[b.length];
	    for(int i=0;i<b.length;i++)
	        res[i]=countNoWhichLess(a, b[i]);
	     for(int i=0;i<b.length;i++)     
		System.out.println(res[i]+" ");
	}
}
# 1 
0 
3 
4 
