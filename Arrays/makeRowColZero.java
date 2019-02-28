Set Matrix Zeroes
  Go to Discuss
Given a m x n matrix, if an element is 0, set its entire row and column to 0. Do it in-place.

Example 1:

Input: 
[
  [1,1,1],
  [1,0,1],
  [1,1,1]
]
Output: 
[
  [1,0,1],
  [0,0,0],
  [1,0,1]
]
Example 2:

Input: 
[
  [0,1,2,0],
  [3,4,5,2],
  [1,3,1,5]
]
Output: 
[
  [0,0,0,0],
  [0,4,5,0],
  [0,3,1,0]
]
Follow up:

A straight forward solution using O(mn) space is probably a bad idea.
A simple improvement uses O(m + n) space, but still not the best solution.
Could you devise a constant space solution?

------------------------------------------------------------------------------------------------------------------------------

class Solution {
    
    class Pairs {
        int i;
        int j;
        
        Pairs(int i, int j){
            this.i = i;
            this.j = j;
        }
    }
    public void makeZero(int r, int c, int matrix[][]){
        for(int i=0;i<matrix[0].length;i++){
                matrix[r][i]=0;
        }
        
        for(int i=0;i<matrix.length;i++){
                matrix[i][c]=0;
        }
    }
    
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
       
        ArrayList<Pairs> al = new ArrayList<>();
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                    if(matrix[i][j]==0){
                        al.add(new Pairs(i,j));
                     }      
                }
        }
        
        for(Pairs s: al){
            makeZero(s.i, s.j, matrix);
        }
    }
}
