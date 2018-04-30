/*Consider a game where a player can score 3 or 5 or 10 points in a move. Given a total score n, find number of ways to reach the given score.

Examples:

Input: n = 20
Output: 4
There are following 4 ways to reach 20
(10, 10)
(5, 5, 10)
(5, 5, 5, 5)
(3, 3, 3, 3, 3, 5)

Input: n = 13
Output: 2
There are following 2 ways to reach 13
(3, 5, 5)
(3, 10)   */


/*package whatever //do not write package name here */

import java.io.*;

class GFG {
	public static void main (String[] args) {
	    int n=20;
		System.out.println("countWaysToReachScore: "+countWaysToReachScore(n));
	}
	
	public static int countWaysToReachScore(int n){
	    int arr[] = new int[n+1];
	    
	    arr[0]=1;
	    for(int i=3;i<=n;i++)
	        arr[i]+=arr[i-3];
	    for(int i=5;i<=n;i++)
	        arr[i]+=arr[i-5];
	   for(int i=10;i<=n;i++)
	        arr[i]+=arr[i-10];
	        
	   return arr[n];     
	}
}

# 4
