class Solution {
    public void moveZeroes(int[] a) {
       
        for(int i=0;i<a.length;i++)
        {
            int j=i;
             int flag=0;
            while(a[j]==0 && j!=a.length-1)
            {
                j++;
                flag=1;
            }
            
            if(flag==1){
            int temp = a[i];
            a[i]=a[j];
            a[j]=temp;
            }
        }
    }
}







class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0;
        int j = nums.length-1;
        while(i<j)
        {
            while(i<nums.length && nums[i]!=0)
                i++;
            while(j>=0 && nums[j]==0)
                j--;
            if(i<j){
            int temp = nums[i];
               nums[i]=nums[j];
               nums[j]=temp;
            }
           
        }
    }
}
