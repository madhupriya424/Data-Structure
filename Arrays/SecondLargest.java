
int largest = arr[0];
int secondLargest = Integer.MIN_VALUE;

for(int i = 1; i<arr.length(); i++){
    if(arr[i] > largest){                     //for first lar
        secondLargest = largest;
        largest = arr[i];
    }
    else if(arr[i] <= largest && arr[i] > secondLargest){
        secondLargest = arr[i];                              //for second lar
    }
}


10 8 6 18 17 25     i       largest             secondLargest
                    0        10                    -218934
                    1        10                       8             
                    2         10                      8   
                    3         18                      10 
                    4          18                     17
                    5          25                      18                



time: O(n)
----------------------------------------------------------------------------------------------------------------------------------
    
    /*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
		    int n = sc.nextInt();
		    int a[] = new int[n];
		    for(int i=0;i<n;i++){
		        a[i]=sc.nextInt();
		    }
		    
		    int first = a[0], second = Integer.MIN_VALUE;
		    for(int i=1;i<n;i++)
		    {
		    if(first<a[i]){
		        second = first;
		        first = a[i];
		    }else if(second<a[i])
		          second = a[i];
		     }
		       System.out.println(second);
		} 
		 }
		    
		   
		}
	
