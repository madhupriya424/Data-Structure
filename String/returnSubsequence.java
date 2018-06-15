/*package whatever //do not write package name here */

import java.io.*;

class GFG {
    
//     abcd

// a
// b
// c
// d
// ab ac ad
// bc bd cd 
// abc abd
// bcd 
// abcd

//                   abc  ""
//                   /     \
//               bc "a"     bc "" 
//               /    \
//             c "ab"  b "a"
//             abddc

public static String[] returnSubsequence(String input){
    if(input.length()==0){
        String res[] = {""};
        return res;
        }
        
        String smallAns[] =  returnSubsequence(input.substring(1));
        
        String res[] = new String[2*smallAns.length];
        
        for(int i=0;i<smallAns.length;i++)
        {
            res[i]=smallAns[i];
        }
        
        for(int i=smallAns.length;i<res.length;i++)
        {
            res[i]=input.charAt(0)+ smallAns[i - smallAns.length];
        }
        return res;
}

	public static void main (String[] args) {
	    String res[] = returnSubsequence("abc");
	    for(int i=0;i<res.length;i++)
	        System.out.print(res[i]+" ");
	
	}
}

#  c b bc a ac ab abc
