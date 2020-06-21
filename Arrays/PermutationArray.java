https://leetcode.com/explore/featured/card/june-leetcoding-challenge/541/week-3-june-15th-june-21st/3366/

class Solution {
    int count = 1;
    String resF = "";
    
    public String getPermutation(int n, int k) {
        String temp = "";
        for(int i = 1; i <= n; i++)
            temp += "" + i;
      checkPermutation(temp, "", k);   
        return resF;
    }
    
    public void checkPermutation(String temp, String res, int k){
        if(temp.length() == 0){//System.out.println(res);
            if(count == k)
                resF = res;
            count++;
            return;
        }
        
        for(int i = 0; i < temp.length(); i++){
            checkPermutation(temp.substring(0, i) + temp.substring(i+1), res + temp.charAt(i), k);
        }
    }
}
