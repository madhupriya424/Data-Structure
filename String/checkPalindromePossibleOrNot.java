     
String s = aabbccd;
1. count frequency of each letter using hashmap
2. CHECK each character should come even times except one
3.



public boolean checkPalindrome(String s){
   HashMap<Character, Integer> hm = new HashMap<>();
   
   for(int i=0;i<s.length();i++){
   			
        if(hm.containsKey(s.charAt(i))){
        		int val = hm.get(s.charAt(i));
            hm.put(s.charAt(i), val+1);
        }
        else
        		hm.put(s.charAt(i), 1);
   }
   int countOdd = 0;
   for (Map.Entry<Character, Integer> i : hm.entrySet()) 
   {
       int freq =  i.getValue();
       if(freq%2 != 0){
          countOdd++;
          if(countOdd == 2)
             return false;
       }
   }
   return true;
}
abcd
aaaaaaaaaaaaaaaaaa

a : 14 
b: 13 
c :4
d : 8
e : 1
