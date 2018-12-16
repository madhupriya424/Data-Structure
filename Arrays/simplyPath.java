/*package whatever //do not write package name here */

import java.util.*;

class GFG {
    public static String hasPath(String path){
        String str[] = path.split("/");
        Stack<String> st = new Stack<>();
        
        for(int i=0;i<str.length;i++){
            if(str[i].length()!=0 && !str[i].equals(".") && !str[i].equals(".."))
                st.push(str[i]);
            else if(str[i].equals("..")){
                if(!st.isEmpty())
                   st.pop();
            } 
        }
        
        String res="";
        
        while(!st.isEmpty()){
            res = "/" + st.pop() + res;
        }
        if(res.length()==0)
            return "/";
        
        return res;    
    }
	public static void main (String[] args) {
		System.out.println(hasPath("/home")+" ");
	}
}
