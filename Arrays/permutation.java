
//Check all permutation of a string....
/*package whatever //do not write package name here */

import java.io.*;

class GFG {
    
    public static void permutation(String str, String res){
        if(str.length()==0){
        System.out.print(res+" ");
            return;
        }
        
        for(int i=0;i<str.length();i++){
            permutation(str.substring(0,i)+ str.substring(i+1) , res+str.charAt(i));
        }    
    }
    
	public static void main (String[] args) {
		permutation("ABC", "");
	}
}


Output:
ABC ACB BAC BCA CAB CBA 
