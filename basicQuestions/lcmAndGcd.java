/*package whatever //do not write package name here */

import java.io.*;

class Lcm {
    
    // Lcm
    public static int lcm(int n1, int n2){
        
       int lcm1 = n1;
       int lcm = n1;
       int i=1;
       while(lcm<=n1*n2)
       {
           lcm = lcm1 * i;
           if(lcm % n2 == 0)
                return lcm;
                
            i++;    
       }
       return lcm;
    }
    
    // hcf or gcd()
    public static int gcd(int n1, int n2){
        if(n1==0)
            return n2;
        return gcd(n2%n1, n1);    
    }
    
	public static void main (String[] args) {
		System.out.println("Lcm :"+ lcm(5, 20));
		System.out.println("Gcd :"+ gcd(20, 5));
	}
}

Lcm :20
Gcd :5
