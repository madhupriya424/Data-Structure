/*package whatever //do not write package name here */

import java.io.*;

class fibonacciNo {
    
    //Fibonacci Series using Recursion
    public static int fib(int n)
    {
    if (n <= 1)
       return n;
    return fib(n-1) + fib(n-2);
    }
      
    
    public static void main (String args[])
    {
    int n = 9;
    System.out.println(fib(n));
    }

}

#34

Extra Space: O(n) if we consider the function call stack size, otherwise O(1).

============================================================================================================================

/*package whatever //do not write package name here */

import java.io.*;

class fibonacciNo {
    
    // Method 2 ( Use Dynamic Programming )
    public static int fib(int n)
    {
        int f[] = new int[n+2];
        int i;
      
        f[0] = 0;
        f[1] = 1;
     
        for (i = 2; i <= n; i++)
        {
            f[i] = f[i-1] + f[i-2];
        }
        return f[n];
    }
      
    public static void main (String args[])
    {
        int n = 9;
        System.out.println(fib(n));
    }
}

#34

Time Complexity: O(n)
Extra Space: O(n)

===============================================================================================================================

/*package whatever //do not write package name here */

import java.io.*;

class fibonacciNo {
    
    // Method 3 ( Space Optimized Method 2 )
    static int fib(int n)
    {
        int a = 0, b = 1, c;
        if (n == 0)
            return a;
        for (int i = 2; i <= n; i++)
        {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
      
    public static void main (String args[])
    {
        int n = 9;
        System.out.println(fib(n));
    }
}

# 34

Time Complexity: O(n)
Extra Space: O(1)
