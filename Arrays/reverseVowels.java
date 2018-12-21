class Solution {
    public String reverseVowels(String s) {
       String res="";
        Stack<Character> st = new Stack<>();
        for(int i=s.length()-1;i>=0;i--)
        {
           if(s.charAt(i)=='a' || s.charAt(i)=='A' || s.charAt(i)=='e' || s.charAt(i)=='E'||                    s.charAt(i)=='i' || s.charAt(i)=='I' || s.charAt(i)=='o' ||
                    s.charAt(i)=='O' || s.charAt(i)=='u' || s.charAt(i)=='U')
               res+=s.charAt(i);
        }
    
       int j=0; 
       for(int i=0;i<s.length();i++){
           if(s.charAt(i)=='a' || s.charAt(i)=='A' || s.charAt(i)=='e' || s.charAt(i)=='E'||                    s.charAt(i)=='i' || s.charAt(i)=='I' || s.charAt(i)=='o' ||
                       s.charAt(i)=='O' || s.charAt(i)=='u' || s.charAt(i)=='U'){
               if(j<res.length()){
               st.push(res.charAt(j));
               j++;
               } 
           }else
               st.push(s.charAt(i));
       }
        
        res="";
       while(!st.isEmpty()){
           res=st.pop()+res;
           
       }
        return res;
    }
}

//TLE
------------------------------------------------------------------------------------------------------------------------------------

import java.util.*;

class Solution {
    public String reverseVowels(String str) {
       char s[] = str.toCharArray();
       int i=0, j=s.length-1; 
        while(i<j)
        {
            
            while(i<s.length && (s[i]!='a' && s[i]!='A' && s[i]!='e' && s[i]!='E'&&                       s[i]!='i' && s[i]!='I' && s[i]!='o'&& s[i]!='O' && s[i]!='u' && s[i]!='U'))
                i++;
            
            while(j>=0 && (s[j]!='a' && s[j]!='A' && s[j]!='e' && s[j]!='E' && s[j]!='i' &&                         s[j]!='I'&& s[j]!='o'&& s[j]!='O' && s[j]!='u' && s[j]!='U'))
               j--;
            
            
            if(i<j){
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            }
            i++;
             j--;   
                
        }
        
        String res = new String(s);
        return res;
    }
}
---------------------------------------------------------------------------------------------------------------------------------

Write a function that takes a string as input and reverse only the vowels of a string.

Example 1:

Input: "hello"
Output: "holle"
Example 2:

Input: "leetcode"
Output: "leotcede"
