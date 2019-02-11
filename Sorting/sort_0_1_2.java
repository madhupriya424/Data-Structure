Sort an array of 0s, 1s and 2s
Given an array A[] consisting 0s, 1s and 2s, write a function that sorts A[]. The functions should put all 0s first, then all 1s and all 2s in last.
Examples:

Input :  {0, 1, 2, 0, 1, 2}
Output : {0, 0, 1, 1, 2, 2}

Input :  {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1}
Output : {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2}


/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt();
		    int a[] = new int[n];
		    for(int i=0;i<n;i++){
		        a[i] = sc.nextInt();
		    }
		    
		    int low=0;
		    int mid=0;
		    int high=a.length-1;
		    
		    while(mid<=high){
		        
		    switch(a[mid]){
		       
		       case 0: int temp = a[low];
		                a[low] = a[mid];
		                a[mid] = temp;
		                low++;
		                mid++;
		                break;
		       
		       case 1: mid++;
		               break;
		       
		       case 2:   temp = a[mid];
		                a[mid] = a[high];
		                a[high] = temp;
		                high--;
		                break;
		                
		    }
		}
		
		 for(int i=0;i<n;i++)
		     System.out.print(a[i]+" ");
		     
		 System.out.println();    
	}
}
}


For Input:
4
5
0 2 1 2 0
3
0 1 0
12
0  1  1  0  1   2   1   2   0   0   0  1
6
0   1   2   0  1   2
Your Output is:
0 0 1 2 2 
0 0 1 
0 0 0 0 0 1 1 1 1 1 2 2 
0 0 1 1 2 2 
