/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

/*
Activity Selection Problem
Resource Allocation Problem

Index  : 1 2 3 4 5 6
Start  : 3 2 1 4 6 7
Finish : 5 3 4 5 9 8
  
Intermediate :
Start :  2 1 4 3 7 6 
Finish : 3 4 5 5 8 9
              
Output : 2 3
         4 5
         7 8

  
Algorithm
Step 1 : Sort the finish Array in ascending order
				 And Change the Start array according to it.
  
Step 2 : Iterate over each meeting and check whether
        start time of current meeting is greater than
        or equal to finish time of last selected element

*/
class ActivitySelectionProblem{
	public static void main (String[] args) {
	   
    	Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      while(t-- > 0){
        int n = sc.nextInt();   // no of meetings
        
        int[] start = new int[n];
        int[] finish = new int[n];
        int[] index = new int[n];
        
        for(int i = 0; i<n; i++){
          start[i] = sc.nextInt();
          index[i] = i+1;
        }
        
        for(int i = 0; i<n; i++)
          finish[i] = sc.nextInt();
        
         for(int i = 0;i < n-1; i++)
         {
           for(int j = i + 1; j < n; j++)
           {
              if(finish[i]>finish[j])
              {
                int temp = finish[i];
                finish[i] = finish[j];
                finish[j] = temp;
                
                temp = start[i];
                start[i] = start[j];
                start[j] = temp; 
                
                temp = index[i];
                index[i] = index[j];
                index[j] = temp;
              }
           }
         }
        
//         System.out.println("After sorting finish Array");
//         for(int i : start)
//           System.out.print(i+" ");
//         System.out.println();
        
//         for(int i : finish)
//           System.out.print(i+" ");
        
//          System.out.println();  
        
        int lastFinish = finish[0];
        System.out.print(index[0]+" ");
        
       
        
        for(int i=1;i<n;i++)
        {
          if(lastFinish<=start[i])
          {
             System.out.print(index[i]+" ");
             lastFinish = finish[i];
          }
        }
        
        System.out.println(); 
      }
  }
}
	
#  2
6
1 3 0 5 8 5
2 4 6 7 9 9
8
75250 50074 43659 8931 11273 27545 50879 77924
112960 114515 81825 93424 54316 35533 73383 160252  


1 2 4 5 
6 7 1 
