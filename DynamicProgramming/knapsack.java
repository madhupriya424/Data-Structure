


Total weight = 9 kg
n = no of items

Items  = 0  1  2   3   4
weight = 1  2  3   4   5 
value  = 1  4  4   5   7
v/w    = 1  2  1.2 1.1 1.1
  
  
 
                              Total Weight
  								v	w	0  1  2  3  4  5  6  7  8  9
          weight	0	0 0  0  0  0  0  0  0  0  0  0
									1 1 0  1  1  1  1  1	1  1  1  1
									4	2 0	 1  4	 5	
									4	3 0
									5	4 0
                  7 5 0





0 2 5 7 8
0 1 2 3 4
  
int[] profit = {0,2,5,7,8};
length = 4;

public static int findMaxProfit(int[] profit, int length){
  int[][] matrix = new int[length + 1][length + 1];
  
  // Insert 0 in first row
  
  // Insert 0 in first column
  
  
  // J represent total length
  // I represent peice length
  for(int i = 1; i<matrix.length; i++){
    for(int j = 1; j<matrix[i].length; j++){
     		 if(i > j){
           	matrix[i][j] = matrix[i-1][j];
         }
         else{
        		int rem =  j - i;
            int profit = profit[j] + matrix[i][rem];
           
            matrix[i][j] = Math.max(matrix[i-1][j], profit);
         }
    }
  }
  return matrix[length][length];
}



















































