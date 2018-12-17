import java.util.*;

class GFG {
    
    public static boolean isPrime(int n){
        for(int i=2;i<=n/2;i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
    
    public static void binarySearch(int prime[], int a[], int k, int primeSize){
        
        int res[] = new int[a.length];
        int j=0;
        for(int i=0;i<a.length;i++)
        {
            int target = a[i];
            int start = 0;
            int end = primeSize;
            boolean found = false;
            
            while(start<=end)
            {
                int mid = (start+end)/2;
                
                if(prime[mid]==target){
                  res[j]=target-prime[mid]; 
                  j++;
                  found=true; 
                  break;
                }
                else if(target<=prime[0]){   //forFirst
                        res[j] = prime[0]-target;  
                        j++;
                        found=true;
                        break;
                }    
                else if(target>prime[primeSize-1]){  //forLast
                        res[j] = target-prime[prime.length-1];  
                        j++;
                        found=true;
                        break;
                }        
                else if(target < prime[mid])
                       end = mid-1;
                else if(target > prime[mid])
                       start = mid+1;
            }
           
            if(!found){
                res[j] = (prime[start]-target) > (target-prime[end]) ? (target-prime[end]) : (prime[start]-target);
                  j++;
            }
            
        }
        
        //  for(int i=0;i<j;i++)
        //      System.out.print(res[i]+" ");
        
        Arrays.sort(res);
        
        int sum=0;
        int i=0;
        while(k>0){
            sum+=res[i];
            i++;
            k--;
        }
        
       sum += (a.length) - i;
        
       System.out.println(sum);
        
    }
    
	public static void main (String[] args) {
	    
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int a[] = new int[N];
		int max=0;
		for(int i=0;i<N;i++){
		    a[i] = sc.nextInt();
		    int max1 = a[i];
		    if(max<max1)
		        max = max1;
		}
		
		int prime[] = new int[max];
		int j=0;
		for(int i=2;i<=max;i++){
		    if(isPrime(i)){
		     prime[j]=i*i;
		     j++;
		}
		}
		int primeSize = j;
		

      //  System.out.print(j+" ");
		
		binarySearch(prime, a, K, primeSize);
		
		//System.out.println("GfG!");
	}
}

////////////////////////////////
5 3
1 4 10 8 15
	
o/p:
4
