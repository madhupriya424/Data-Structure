/*package whatever //do not write package name here */

import java.io.*;

class fibonacciNo {
    
    // method 1 : Simple approach 
    public static int countSetBitss(int n)
    {
        int count = 0;
        int n1 = n;
        while(n1>0)
        {
            count += n & 1;
            n = n>>1;
        }
        return count;
    }
    // Time Complexity: (-)(logn) (Theta of logn)
     
     
     // recursive approach...
    public static int countSetBits(int n)
    {
       if(n==0)
        return n;
        
        return (n & 1) + countSetBits(n>>1);
    }
    
    // method 3: Implementation of Brian Kernighan’s Algorithm
    public static int countSetBitsss(int n)
    {
        int count = 0;
        while(n>0)
        {
            n = n & (n-1);
            count++;
        }
        return count;
    }
    // Time Complexity: O(logn)
    
    
    // method 4: recursive function to count set bits of Brian Kernighan’s Algorithm
    public static int countSetBits(int n)
    {
    // base case
    if (n == 0)
        return 0;
    else
        return 1 + countSetBits(n & (n - 1));
    }
    
    public static void main (String args[])
    {
        int n = 7;
        System.out.println(countSetBitsss(n));
    }
}

# 3
