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
public static void subsequence(String input, String output){
    if(input.length()==0){
    System.out.print(output+" ");
    return;
    }

        subsequence(input.substring(1), output + input.charAt(0));
        subsequence(input.substring(1), output);
   
}



	public static void main (String[] args) {
	    subsequence("abc", "");
	//	System.out.println("GfG!");
	}
}

# abc ab ac a bc b c  
