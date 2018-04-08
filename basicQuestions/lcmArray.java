/*package whatever //do not write package name here */

import java.io.*;

class Gcd {
    
    public static int lcm(int n1, int n2){
        
        int lcm = n1;
        int lcm1 = n1;
        int i=1;
        
        while(lcm <= n1*n2)
        {
            lcm = lcm1 * i;
            
            if(lcm % n2 == 0)
                return lcm;
            
            i++;    
        }
        return lcm;
    }
    
    public static int lcm(int arr[]){
        int n1 = arr[0];
        for(int i=1;i<arr.length;i++)
        {
            int n2 = arr[i];
                n1 = lcm(n1, n2);
        }
        return n1;
    }
    
	public static void main (String[] args) {
	        int arr[] = {2, 7, 3, 9, 4};
		System.out.println("Lcm :"+ lcm(arr));
	}
}

# Lcm :252
