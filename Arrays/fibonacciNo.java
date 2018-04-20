/*package whatever //do not write package name here */

import java.io.*;

class fibonacciNo {
    
    static int fib(int n)
    {
       if(n==0)
            return 0;
        if(n==1)
            return 1;
        
    return fib(n-1) + fib(n-2);    
    }
      
    public static void main (String args[])
    {
        int n = 5;
        System.out.println(fib(n));
    }
}

# 5
