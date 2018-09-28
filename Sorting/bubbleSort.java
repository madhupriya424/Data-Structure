import java.util.*;
class BubbleSort
{
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		BubbleSort bs = new BubbleSort();
		int t = sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++)
			{
				arr[i] = sc.nextInt(); 
			}
			GfG obj = new GfG();
			obj.bubbleSort(arr);
			bs.printArray(arr);
			
		t--;	
		}
	}
}
}

/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

//User function Template for Java
/* The task is to complete bubble() which is used 
   in below bubbleSort() */
class GfG
{
    /* Function to sort an array in ascending order using bubble sort */
    void bubbleSort(int a[])
    {
       int n = a.length;
       int flag=0; 
       for(int i=0;i<n-1;i++)
       {
           flag=0;
           for(int j=0;j<n-i-1;j++)
           {
               if(a[j]>a[j+1])
               {
                   int temp = a[j];
                   a[j] = a[j+1];
                   a[j+1] = temp;
                   flag=1;
               }
           }
           if(flag==0)
                  break;
       }
    }
}
