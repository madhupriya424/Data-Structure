import java.io.*;
import java.util.*;

 class Node{
    int data;
    Node left, right;
    
    Node(int data){
        this.data=data;
    }
}


public class Solution {
    //static Node root;
    
    public static Node balanceTree(int arr[], int start, int end){
        if(start<=end)
        {
            int mid = (start+end)/2;
            Node node = new Node(arr[mid]);
            node.left = balanceTree(arr, start, mid-1);
            node.right = balanceTree(arr, mid+1, end);
            return node;
        }
        return null;
    }

    public static void preOrder(Node root){
        if(root==null)
            return;
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n]; 
            for(int i=0;i<n;i++)
                arr[i] = sc.nextInt();
            
          Node root = balanceTree(arr, 0, arr.length-1);
          preOrder(root);
          System.out.println();  
        }
    }
}
