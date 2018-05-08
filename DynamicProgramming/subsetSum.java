


{1,   2,   7,   5}  => 8  {1, 2, 5}
                    => 4  {4}

              Total Sum       j
      value    0 1 2 3 4 5 6 7 8
            0  T F F F F F F F F
            1  T T F F F F F F F   
      i     2  T T T T F F F F F 
            7  T T T T F F F T T
            5  T T T T F T T T T
            
[1,2,7,8]  
[0,2,7,8]

public static boolean subsetSum(int set[], int x){
	int res[][] = new int[set.length+1][x+1];
  int value[] = new int[res.length + 1];
  for(int i = 1; i < res.length + 1 ; i++ )
  	value[i]=set[i-1];
  // Fill false in first row
  // Fill true in first column
  
  for(int i=0;i<res.length;i++)
  {
  	for(int j=0;j<res[0].length;j++)
    {
    	if(i == 0 && j == 0){
      	res[i][j] = True;
      }
      else if(i == 0){
        res[i][j] = False;
      }
      else if(j == 0){
      	res[i][j] = True;
      }
      else{
      // Logic
      if(value[i] > j){
      	res[i][j] = res[i-1][j];
      }
      else{
      	int rem = j - value[i];
        res[i][j] = res[i-1][rem];
      }

    }
  }  
}
       						res
									{{0, 1, 1, 0, 1},          
                   {1, 1, 0, 1, 0}, 
                   {0, 1, 1, 1, 0},
                   {1, 1, 1, 1, 0},
                   {1, 1, 1, 1, 1},
                   {0, 0, 0, 0, 0}};       
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
            
