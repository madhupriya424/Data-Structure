/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
    

  public static void countChopstick(int arr[], int d){
    int count=0;
    Arrays.sort(arr);
     for(int i=0;i<arr.length-1;i++)
     {
       int sum = arr[i+1]-arr[i];
       if(sum<=d){
         count++;
         i++;
       }
       
     }
     System.out.println(count);
  }
  
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    int d= sc.nextInt();
    int arr[]= new int[n];
    for(int i=0;i<n;i++)
      arr[i]=sc.nextInt();
  
  countChopstick(arr, d);
  }
}

5 2
1
3
3
9
4
# 2
