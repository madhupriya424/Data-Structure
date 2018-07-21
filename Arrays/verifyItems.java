/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
    
    public static int verifyItems(String origItems[], float[] origPrices, String items[], float prices[]){
        HashMap<String, Float> hm = new HashMap<>();
        for(int i=0;i<origItems.length;i++){
            hm.put(origItems[i], origPrices[i]);
        }
        
        int count=0;
        for(int i=0;i<items.length;i++){
        if(hm.containsKey(items[i])){
            Float val = hm.get(origItems[i]);
            if(!val.equals(prices[i]))
                count++;
        }
        }
        return count;    
        }
    
    
	public static void main (String[] args) {
	    String origItems[]={"rice", "sugar", "wheat", "cheese"};
	    float origPrices[]={16.89f, 56.92f, 20.89f, 345.99f};
	    String items[]={"rice", "cheese"};
	    float prices[]={16.89f, 400.89f};
	    
		System.out.println(verifyItems(origItems, origPrices, items, prices));
	}
}

# 1
