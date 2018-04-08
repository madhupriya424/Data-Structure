/*package whatever //do not write package name here */

import java.io.*;

class Gcd {
    
    public static int gcd(int n1, int n2){
        if(n1==0)
            return n2;
        return gcd(n2%n1, n1);    
    }
    
    public static int gcd(int arr[]){
        int n1 = arr[0];
        for(int i=1;i<arr.length;i++)
        {
            int n2 = arr[i];
                n1 = gcd(n1, n2);
        }
        return n1;
    }    
	    public static void main (String[] args) {
	        int arr[] = {2, 4, 6, 8};
		System.out.println("Gcd :"+ gcd(arr));
	}
}

# Gcd :2
