class Solution {
    public void flip(int A[]){
        int i=0,j=A.length-1;
        while(i<j)
        {
            int temp = A[i];
            A[i]=A[j];
            A[j]=temp;
            i++;
            j--;
        }
    }
    
     public void invert(int A[]){
        int i=0, j=A.length;
        while(i<j)
        {
           A[i]= A[i]==0? 1:0;
            i++;
        }
    }
    
    public int[][] flipAndInvertImage(int[][] A) {
        for(int i=0;i<A.length;i++){
                flip(A[i]);
                invert(A[i]);
        
        }
        return A;
    }
}

Input: [[1,1,0],[1,0,1],[0,0,0]]
Output: [[1,0,0],[0,1,0],[1,1,1]]
Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]
