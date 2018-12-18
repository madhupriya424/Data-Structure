class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        int res=-1;
        int ans[] = new int[2];
        while(start<=end)
        {
            int mid = start + (end-start)/2;
            if(nums[mid]==target){
                res=mid;
                end=mid-1;
            }else if(nums[mid]>target)
                end = mid-1;
            else 
                start = mid+1;
        }
        ans[0]=res;   //start
        
        start =0;
        end= nums.length-1;
        res=-1;
        while(start<=end)
        {
            int mid = start + (end-start)/2;
            if(nums[mid]==target){
                res=mid;
                start=mid+1;
            }else if(nums[mid]>target)
                   end = mid-1;
            else
                 start = mid+1;
        }
        ans[1]=res;
        return ans;
    }
}
--------------------------------------------------------------------------------------------------------------------------------
Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target value.

Your algorithm's runtime complexity must be in the order of O(log n).

If the target is not found in the array, return [-1, -1].

Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
Example 2:

Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]
