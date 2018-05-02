/*package whatever //do not write package name here */

import java.io.*;

class GFG {
	public static void main (String[] args) {
	    int notes[] = {1, 2, 5, 10, 20, 50, 100, 500, 1000};
		System.out.println("minNoOfNotesReq : "+minNoOfNotesReq(notes, 450));
	}
	
	public static int minNoOfNotesReq(int notes[], int val){
	    
	    
	    int count=0;
	    int rem = Integer.MIN_VALUE;
	    
	    for(int i=notes.length-1;i>=0;i--)
	    {
	        if(val>=notes[i])
	        {
	            count=count + (val/notes[i]);
	             val = val%notes[i];
	        }
	    }
	    return count;
	}
}

# 5
100 - 4
50 - 1
