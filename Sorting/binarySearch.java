
binary search // arr, key
// 1 3 5 6 7 9 12 15 19 27 31 44 49 50
   0 1 2 3 4 5  6  7  8  9 10 11 12 13
   
   beg    mid    end
    0      6      13
    0      2       5
    3      4       5
    
    
int binarySearch(int arr[], int key){
			
   return  binarySearch(arr, 0, arr.length-1, key);
}      
      
  int binarySearch(int arr[], int beg, int end, key){    
    
      if(beg<end){
      
        int mid=(beg+end)/2;

        if(arr[mid]==key){
          return mid;
        }
        else if(a[mid]>key){
          return binarySearch(arr, beg, mid-1);
        }
        else if(a[mid]<key){
          return binarySearch(arr, mid+1, end);
        }
      }
      return -1;   
}
