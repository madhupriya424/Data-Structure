class GFG {
	public static void main (String[] args) {
	    int n=8;
		System.out.println("countWaysToReachScore: "+countWaysToReachScore(n));
	}
	
	public static int countWaysToReachScore(int n){
	    if(n <= 2)
	        return 0;
	    if(n==3 || n == 5 || n == 10)
	        return 1;
	    return countWaysToReachScore(n-3)+countWaysToReachScore(n-5)+countWaysToReachScore(n-10);     
	        
	      
	}
}

# 2
5 or 3
