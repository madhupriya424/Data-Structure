/*package whatever //do not write package name here */

import java.io.*;

/*
Best Case  : O(n^2)
Avg Case   : O(n^2)
Worst Case : O(n^2)
Stable Sort
Inplace Algorithm
Minimum will come at its place in each iteration
*/

class SelectionSort {
	public static void main (String[] args) {
	    int arr[]={2, 5, 1, 8, 4, 7};
	    sort(arr);
	}
	
	public static void sort(int[] arr) {
		int n = arr.length;
		
		for(int i = 0; i<n-1; i++) {
			for(int j = i+1; j<n; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for(int i = 0; i<n; i++) 
		    System.out.print(arr[i]+" ");
	}
}

# 1 2 4 5 7 8 
