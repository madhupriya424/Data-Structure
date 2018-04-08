/*package whatever //do not write package name here */

import java.io.*;

class Lcm {

        
    public static int gcd(int n1, int n2){
        if(n1==0)
            return n2;
        return gcd(n2%n1, n1);    
    }
    
    
	public static void main (String[] args) {
	    int n1 = 20;
	    int n2 = 5;
	    int lcm = (n1*n2)/gcd(n1, n2);
		System.out.println("Lcm :"+lcm);
	}
}

# Lcm :20
