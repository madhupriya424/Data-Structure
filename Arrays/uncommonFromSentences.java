http://www.techiedelight.com/convert-set-string-array-string/

888. Uncommon Words from Two Sentences

We are given two sentences A and B.  (A sentence is a string of space separated words.  Each word consists only of lowercase letters.)

A word is uncommon if it appears exactly once in one of the sentences, and does not appear in the other sentence.

Return a list of all uncommon words. 

You may return the list in any order.

 

Example 1:

Input: A = "this apple is sweet", B = "this apple is sour"
Output: ["sweet","sour"]
Example 2:

Input: A = "apple apple", B = "banana"
Output: ["banana"]
 

Note:

0 <= A.length <= 200
0 <= B.length <= 200
A and B both contain only spaces and lowercase letters.


---------------------------------------------------------------------------------------------------------------

class Solution {
    public String[] uncommonFromSentences(String A, String B) {
        HashMap<String, Integer> hm = new HashMap<>();
        String res="";
        for(int i=0;i<=A.length();i++){
            if(i==A.length() || A.charAt(i)==' '){
                if(!hm.containsKey(res))
                    hm.put(res, 1);
                else{
                    int val = hm.get(res);
                    hm.put(res, val+1);
                }    
                res="";
            }    
            else
                res+=A.charAt(i);
        }
        
         for(int i=0;i<=B.length();i++){
            if(i==B.length() || B.charAt(i)==' '){
                if(!hm.containsKey(res))
                    hm.put(res, 1);
                else{
                    int val = hm.get(res);
                    hm.put(res, val+1);
                }  
                res="";
            }    
            else
                res+=B.charAt(i);
        }
        
       
        
        ArrayList<String> temp = new ArrayList<>();
        for(Map.Entry<String, Integer> s: hm.entrySet()){
            if(s.getValue()==1)
                temp.add(s.getKey());
        }
        return temp.toArray(new String[0]);
    }
}


ans.
["sweet","sour"]
