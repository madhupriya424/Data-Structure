
class Solution {
    public static int findLeftHeight(int arr[], int index){
        int max=Integer.MIN_VALUE;
          for(int i=0;i<index;i++)
         {
              if(arr[i]>max)
                  max=arr[i];
         }    
        return max;
    }
    
      public static int findRightHeight(int arr[], int index){
        int max=Integer.MIN_VALUE;
          for(int i=index+1;i<arr.length;i++)
         {
              if(arr[i]>max)
                  max=arr[i];
         } 
          return max;
    }
    
    public int trap(int[] height) {
        int sum=0;
        for(int i=1;i<height.length-1;i++)
        {
           int lmax = findLeftHeight(height, i);
           int rmax = findRightHeight(height, i);
           int min =lmax>rmax ? rmax:lmax; 
           if(min-height[i]>0)
               sum+=(min-height[i]);
        }
        return sum;
    }
}

# Input: [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6
