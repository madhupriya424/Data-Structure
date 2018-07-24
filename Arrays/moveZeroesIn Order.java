Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Example:

Input: [0,1,0,3,12]
Output: [1,3,12,0,0]
Note:

You must do this in-place without making a copy of the array.
Minimize the total number of operations.



class Solution {
    public void moveZeroes(int[] nums) {
        
        for(int i=0;i<nums.length;i++){
            int j=i;
            int flag=0;
            
            while(j!=nums.length && nums[j]==0){
                j++;
                flag=1;
            }
            
            if(j!=nums.length && flag==1){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                
                flag=0;
            }
        }
        
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
