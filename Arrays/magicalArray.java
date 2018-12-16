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
