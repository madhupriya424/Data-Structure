

/*package whatever //do not write package name here */

import java.io.*;

class GFG {
    public static String stringWordWise(String str){
        int end=0;
        String res="";
    
        for(int i=0;i<str.length();i++){
            int j=i;
            if(str.charAt(j)==' '|| i==str.length()-1)
            {
                while(j!=end-1){
                    res+=str.charAt(j);
                    j--;
                } 
                res+=" ";
                end=i;
            }
                
        }
        return res;
    }
	public static void main (String[] args) {
	    String str="My name is madhu";
		System.out.print(stringWordWise(str));
	}
}

Output:
 yM  eman   si  uhdam  
