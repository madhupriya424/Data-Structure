//Sachin and Birthday Chocalate
i/p: 5 2
      6 1 2 3 4
o/p: 0

i/p:6 3
    2 5 6 7 11 17
o/p: 3
public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  int m = sc.nextInt();
  
  int[] arr = new int[n];
  
  6 3
  2 5 6 7 11 17
  HashMap<Integer, Integer> hm = new HashMap<>();
  
  int maxFreq = 1;
  for(int i = 0; i<n; i++){
    arr[i] = sc.nextInt();
    if(hm.containsKey(arr[i]))
    {
      int val = hm.get(arr[i]);
      hm.put(arr[i], val+1);
      if(maxFreq < val + 1)
        maxFreq = val + 1;
    }
    else
       hm.put(arr[i], 1); 
  }
  
  if(maxFreq>=m)
    System.out.println(0);
  else{
      Arrays.sort(arr);

     //0 1 3 4 5
     1 2 5 6 7
    int min = Integer.MAX_VALUE;
    for(int j = m-1; i<n; i++)
    {
      	int temp = 0;
    		 for(int i = j - 1; i > j-m; i--)
         {
           temp += (arr[j] - arr[i]);
         }
         
      		if(temp<min)
            min=temp;
      
      
        for(int i = j-m+1 ; i < j ; i++){
           temp += (arr[j] - arr[i]);
         }
        }
    }
    System.out.println(min);
}
















