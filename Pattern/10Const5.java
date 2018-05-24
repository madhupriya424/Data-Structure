/*package whatever //do not write package name here */

import java.io.*;

class GFG {
    public static void printPattern(){
        for(int i=0;i<5;i++)
        {
            //Print Space
            for(int j=0;j<i;j++)
                System.out.print("\t");
                
            int num=10;
            
            for(int j=0;j<5-i;j++)
                System.out.print((num--)+"\t");    
            
            System.out.print("5"+"\t");
            
            for(int k=4-i;k>=1;k--)
                System.out.print(k+"\t"); 
                
             System.out.println();     
        }
    }
    
	public static void main (String[] args) {
		printPattern();
	}
}

#
10	9	8	7	6	5	4	3	2	1	
	10	9	8	7	5	3	2	1	
		10	9	8	5	2	1	
			10	9	5	1	
				10	5	
