/*package whatever //do not write package name here */
nCr = (n-1)C(r-1) + (n-1)C(r)
nCn = 1;
nC0 = 1;

import java.io.*;

class GFG {
	public static void main (String[] args) {
		System.out.println(binomial(5,2));
	}
	
	
public static int binomial(int n, int r){
  
  if(n == r || r == 0){
    return 1;
  }
  
  return binomial(n-1, r-1) + binomial(n-1,r);
}
}
# 10 
