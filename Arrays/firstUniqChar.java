class Solution {
    public int firstUniqChar(String s) {
        char count[] = new char[256];
        
        for(int i=0;i<s.length();i++)
            count[s.charAt(i)]++;
        
         for(int i=0;i<s.length();i++)
         {
             if(count[s.charAt(i)]==1)
                 return i;
         }
        return -1;
    }
}


# s = "leetcode"
return 0.

s = "loveleetcode",
return 2.
