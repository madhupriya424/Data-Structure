class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> hs = new HashMap<>();
        
        for(int i=0;i<nums.length;i++)
        {
            if(hs.containsKey(nums[i]))
                return true;
            else
                hs.put(nums[i], 1);
        }
        return false;
    }
}

#Given an array of integers, find if the array contains any duplicates. Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.
