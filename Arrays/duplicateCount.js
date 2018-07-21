/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
    public static int duplicateCount(int nums[]){
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                int val = hm.get(nums[i]);
                hm.put(nums[i], val+1);
            }else{
                hm.put(nums[i], 1);
            }
        }
        
        int count=0;
        for(Map.Entry h:hm.entrySet()){  
            int val =(int) h.getValue();
            if(val>1)
                count++;
        }
        
        return count;
    }
    
    
    
	public static void main (String[] args) {
	    int nums[]={1, 3, 1, 4, 5, 6, 3, 2};
		System.out.println(duplicateCount(nums));
	}
}

# 2
