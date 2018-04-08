/*package whatever //do not write package name here */

import java.io.*;

class trailingZeros {
    
    // method 1
    public static int trailingZeros(int n)
    {
        n = n/5;
        int res = n;
       while(n>=5)
       {
           res = res + n/5;
           n = n/5;
       }
       return res;
    }
    
    // method 2
    public static int trailingZeros(int n)
    {   
        int count = 0;
        for(int i=5; n/i>=1; i=i*i)
            count+=n/i;
        
        return count;
    }
    
    public static void main (String args[])
    {
        int n = 5;
        System.out.println(trailingZeros(n));
    }
}
# 1
# 100 - 24
# 20 - 4
