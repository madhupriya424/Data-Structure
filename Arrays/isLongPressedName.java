class Solution {
    public boolean isLongPressedName(String name, String typed) {
        //HashMap<Character, Integer> hm1 = new HashMap<>();
        int j=0, k=0;
        while(j<name.length())
        {
           int count1=1, count2=1; 
           while(j<name.length()-1 && name.charAt(j)==name.charAt(j+1)){ 
               count1++; 
               j++;
           }     
           
          while(k<typed.length()-1 && typed.charAt(k)==typed.charAt(k+1)){
               count2++;
              k++;
           }
          
            if(name.charAt(j)!=typed.charAt(k) || count1>count2 || j<name.length()-1 &&                         k==typed.length()-1)
                return false;
        j++;
        k++;    
        }
        return true;
    }
}
-----------------------------------------------------------------------------------------------------------------------

Your friend is typing his name into a keyboard.  Sometimes, when typing a character c, the key might get long pressed, and the character will be typed 1 or more times.

You examine the typed characters of the keyboard.  Return True if it is possible that it was your friends name, with some characters (possibly none) being long pressed.

 

Example 1:

Input: name = "alex", typed = "aaleex"
Output: true
Explanation: 'a' and 'e' in 'alex' were long pressed.
Example 2:

Input: name = "saeed", typed = "ssaaedd"
Output: false
Explanation: 'e' must have been pressed twice, but it wasn't in the typed output.
Example 3:

Input: name = "leelee", typed = "lleeelee"
Output: true
Example 4:

Input: name = "laiden", typed = "laiden"
Output: true
Explanation: It's not necessary to long press any character.
 

Note:

name.length <= 1000
typed.length <= 1000
The characters of name and typed are lowercase letters.
 
