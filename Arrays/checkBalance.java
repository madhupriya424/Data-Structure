
/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
    
    public static boolean checkBalance(String str[]){
        Stack<String> st=new Stack<>();
        for(int i=0;i<str.length;i++)
        {
            if(!st.isEmpty())
            {
                if((st.peek()=="{" && str[i]=="}")||(st.peek()=="[" && str[i]=="]")||(st.peek()=="(" && str[i]==")"))
                    st.pop();
                else
                    st.push(str[i]);
            }
            else
                st.push(str[i]);
        }
        if(st.isEmpty())
           return true;
        else
            return false;
    }
    
	public static void main (String[] args) {
	    String str[]={"{","}","[","]","(",")"};
		System.out.println(checkBalance(str));
	}
}

#true
