/*package whatever //do not write package name here */

import java.io.*;

class GFG {
    
    public static boolean isPrime(int n){
        for(int i=2;i<n;i++){
            if(i%n==0)
                return false;
        }
        return true;;
    }
    
    public static void binarySearch(int prime[], int a[], int k){
        
        for(int i=0;i<a.length;i++)
        {
            int target = a[i];
            int start = 0;
            int end = prime.length-1;
            int j = 0;
            while(start<end)
            {
                int mid = (start+end)/2;
                if(prime[mid]==tartget){
                  res[j]=target-prime[mid];
                  j++;
                  break;
                }
                else if(mid!=0 && target>prime[mid-1] && target<prime[mid]){
                    res[j] = target- a[mid-1] < a[mid]-target ? (target- a[mid-1]) : (a[mid]-target);
                }
                else if(mid==0)
            }
        }
    }
    
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int a[] = sc.nextInt();
		int max=0;
		for(int i=0;i<N;i++){
		    a[i] = sc.nextInt();
		    int max1 = a[i];
		    if(max<max1)
		        max = a[i];
		}
		
		int prime[] = new int[max];
		for(int i=2;i<=max;i++){
		    if(isPrime(i)){
		     prime[j]=i*i;
		}
		}
		
		Arrays.sort(prime);
		
		binarySearch(prime, a, K);
		
		//System.out.println("GfG!");
	}
}



// Java program to find GCD of two or 
// more numbers 
import java.util.*;

public class GCD { 
	// Function to return gcd of a and b 
	static int gcd(int a, int b) 
	{ 
		if (a == 0) 
			return b; 
		return gcd(b % a, a); 
	} 

	// Function to find gcd of array of 
	// numbers 
	static int findGCD(int arr[], int n, int k) 
	{ 
      HashMap<Integer, Integer> hm = new HashMap<>();
      
      //int res[] = new int[n];
		int j=0;
       int op = 0;
      for(int i = 0; i < n; i++){ 
			int res = (gcd(arr[i], 3));
            if(res==3)
          		k--;
           else{
              hm.put(j, res);
             j++;
           }
            //System.out.print(res[i]+" ");
        }
     
      int div =1;
      while(k>0){
      	while(k>0 && hm.containsValue(div)){
          
          int key = hm.getKey();
          //int val = hm.getValue();
          hm.remove(key);
          op+=div;
          k--;
        }
        div++;
      }
      
      op+=hm.size();
		return op; 
	} 

	public static void main(String[] args) 
	{ 
		int arr[] = { 1, 4, 8, 10, 15 }; 
		int n = arr.length;
      
        System.out.print(findGCD(arr, n, 3));
        
	} 
} 

// This code is contributed by Saket Kumar 
