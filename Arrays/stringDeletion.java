/*package whatever //do not write package name here */

import java.util.*;

class GFG {
    public static int stringDeletion(String s){
        int freq[] = new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<26;i++){
        if(freq[i]!=0)    
          hs.add(freq[i]);
        }
        return hs.size();
    }
	public static void main (String[] args) {
		System.out.println(stringDeletion("ababcdddcdcd"));
	}
}
