/*package whatever //do not write package name here */

import java.io.*;

class GFG {
    
     public static void sort(String[] names, int[] salary){
    
    int index=0;
    for(int i=0;i<names.length;i++)
    {
      int j=i;
      int minSal = Integer.MAX_VALUE;
      while(j<salary.length)
      {
        
        if(minSal>salary[j])
        {
           index = j;
            minSal = salary[j];
        }  
        j++;
      }
      
      int temp = salary[i];
      salary[i] = salary[index];
      salary[index] = temp;
      
      String tempS = names[i];
      names[i] = names[index];
      names[index] =tempS;

    }
    
    for(int i=0;i<names.length;i++)
      System.out.print(names[i]+" "+salary[i]+" ");
  }

    
	public static void main (String[] args) {
	   	String[] names = {"A","B","M","S"};
		int[] salary = {30, 38, 35, 32};
		
	    sort(names, salary);
		
	}
}

#  A 30 S 32 M 35 B 38 
