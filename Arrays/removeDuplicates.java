

Driver Code to call/invoke your function is mentioned above.*/

class GfG
{
        /*You are required to complete this function */
	int remove_duplicate(int a[])
	{
	    int j=0;
	    int n = a.length;
		for(int i=0;i<a.length-1;i++)
		{
		    if(a[i]!=a[i+1]){
		        a[j++]=a[i];
		         
		    }
		}
		a[j++]=a[n-1];
		
		return j;
	}
}


Input  (To be used only for expected output) :
2
5
2 2 2 2 2 
3
1 2 2
Output
2
1 2
