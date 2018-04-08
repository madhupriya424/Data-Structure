/*package whatever //do not write package name here */

import java.io.*;

class Prime {
    
    public static void primeNo(int n1){
        
        for(int i=2;i<=n1;i++)
        {
            if(isPrime(i))
                System.out.print(i+" ");
        }
    }
    
    public static boolean isPrime(int n){
        int i;
        for(i=2;i<=n;i++)
        {
            if(n%i==0)
                break;
        }
        if(i==n)
            return true;
        return false;
    }    
        
	public static void main (String[] args) {
		primeNo(20);
	}
}

# 2 3 5 7 11 13 17 19 
