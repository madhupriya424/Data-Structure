/*package whatever //do not write package name here */

import java.io.*;

class GFG {
    
public static void permutation(String input, String output){
    if(input.length()==0){
    System.out.print(output+" ");
    //return;
    }
      for(int i=0;i<input.length();i++)
      {
        permutation(input.substring(0,i)+input.substring(i+1), output + input.charAt(i));
      }
}



	public static void main (String[] args) {
	    permutation("abc", "");

	}
}

# abc acb bac bca cab cba 
