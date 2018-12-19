class Solution {
    public boolean backspaceCompare(String S, String T) {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<S.length();i++)
        {
            if(S.charAt(i)=='#') {
                if(!st.isEmpty())
                    st.pop();
            }    
            else {
                st.push(S.charAt(i)); 
            }
        }
        
        String res="";
        while(!st.isEmpty())
        {
            res+=st.pop();
        }
        
        System.out.println(res+" ");
        //Stack<Character> st = new Stack<>();
        for(int i=0;i<T.length();i++)
        {
            if(T.charAt(i)=='#'){
                if(!st.isEmpty())
                    st.pop();
            }    
            else 
                st.push(T.charAt(i)); 
        }
        
        String res1="";
        while(!st.isEmpty())
        {
            res1+=st.pop();
        }
         System.out.println(res1+" ");
        if(res.equals(res1))
            return true;
        return false;
    }
}
--------------------------------------------------------------------------------------------------------------------------------

Given two strings S and T, return if they are equal when both are typed into empty text editors. # means a backspace character.

Example 1:

Input: S = "ab#c", T = "ad#c"
Output: true
Explanation: Both S and T become "ac".
Example 2:

Input: S = "ab##", T = "c#d#"
Output: true
Explanation: Both S and T become "".
Example 3:

Input: S = "a##c", T = "#a#c"
Output: true
Explanation: Both S and T become "c".
