import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
		int arr[]={1, 2, 4, 6, 3, 7, 8};
		MissingNo(arr);
	}
	
	static void MissingNo(int a[])
	{
	   int sum=0;
	   for(int i=0;i<a.length-1;i++)
	       sum+=a[i];
	       
	   int AllSum = (a.length*(a.length+1))/2;   // just like (n*(n+1))/2  where n = Size of aray
     System.out.print(AllSum-sum);
    }     
}
Time Complexity:O(n)
Space Complexity:O(1)
