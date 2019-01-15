class SelectionSort
{
	void selectionSort(int arr[])
	{
		int n = arr.length;
		GfG obj = new GfG();
		for(int i=n-1; i>=0; i--)
		{
			int j = obj.select(arr, i);
			
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}	
	}
} */
class GfG
{
    int  select(int a[], int i)
    {
       int max = i;    
       for(int j=i;j>=0;j--){
           if(a[j]>a[max])
           {
                max =j;
           }
       }
       return max;
    }
    
}
