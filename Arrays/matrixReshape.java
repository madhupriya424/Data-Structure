//Reshape the matrix
Example 1:
Input: 
nums = 
[[1,2],
 [3,4]]
r = 1, c = 4
Output: 
[[1,2,3,4]]
Explanation:
The row-traversing of nums is [1,2,3,4]. The new reshaped matrix is a 1 * 4 matrix, fill it row by row by using the previous list.
Example 2:
Input: 
nums = 
[[1,2],
 [3,4]]
r = 2, c = 4
Output: 
[[1,2],
 [3,4]]
Explanation:
There is no way to reshape a 2 * 2 matrix to a 2 * 4 matrix. So output the original matrix.
Note:
The height and width of the given matrix is in range [1, 100].
The given r and c are all positive.





class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        if(nums.length==0 || nums.length*nums[0].length!=r*c )
            return nums;
        int res[][] =new int[r][c];
        
        int prev_row=0;
        int prev_col=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++){
                res[prev_row][prev_col] = nums[i][j];
                prev_col++;
                if(prev_col==c){
                    prev_row++;
                    prev_col=0;
                }
            }
        }
        return res;
    }
}

