A matrix is Toeplitz if every diagonal from top-left to bottom-right has the same element.

Now given an M x N matrix, return True if and only if the matrix is Toeplitz.
 

Example 1:

Input:
matrix = [
  [1,2,3,4],
  [5,1,2,3],
  [9,5,1,2]
]
Output: True
Explanation:
In the above grid, the diagonals are:
"[9]", "[5, 5]", "[1, 1, 1]", "[2, 2, 2]", "[3, 3]", "[4]".
In each diagonal all elements are the same, so the answer is True.
Example 2:

Input:
matrix = [
  [1,2],
  [2,2]
]
Output: False
Explanation:
The diagonal "[1, 2]" has different elements.

Note:

matrix will be a 2D array of integers.
matrix will have a number of rows and columns in range [1, 20].
matrix[i][j] will be integers in range [0, 99].

Follow up:

What if the matrix is stored on disk, and the memory is limited such that you can only load at most one row of the matrix into the memory at once?
What if the matrix is so large that you can only load up a partial row into the memory at once?


------------------------------------------------------------------------------------------------------------------


class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        
        // Downside diagonal trianle
        for(int i=0;i<matrix.length;i++){
            
                int x=i;
                int y=0;
                int val = matrix[x][y];
            
               while(x<matrix.length && y<matrix[0].length)
               {
                   if(val!=matrix[x][y]){
                            return false;
                        }
                    x++;
                    y++;
                    
                }
            }
        
        // Upside diagonal trianle
         for(int i=1;i<matrix[0].length;i++){
                int x=0;
                int y=i;
                int val = matrix[x][y];
           
               while(x<matrix.length && y<matrix[0].length){
                   if(val!=matrix[x][y]){
                            return false;
                        }
                    x++;
                    y++;
                    
                }
            }
            return true;
    }
}
        
        
 
