import java.io.*;
import java.util.*;

class Node{
    int data;
    Node left;
    Node right;
    
    Node(int data){
        this.data = data;
    }
}


class BinaryTree {
   Node root1;
   
   public static void printKDistant(Node root1, int k){
       if(root1==null)
          return;
        
        if(k==1)  
           System.out.print(root1.data+" ");
        
        printKDistant(root1.left, k-1);
        printKDistant(root1.right, k-1);
   }
  
    
    // 40 15 25 4 11 10 15 -1 -1 -1 -1 -1 -1 -1 -1
	public static void main (String[] args) {
	    BinaryTree tree = new BinaryTree();
	    tree.root1 = new Node(40);
	    tree.root1.left = new Node(15);
	    tree.root1.right = new Node(25);
	    tree.root1.left.left = new Node(4);
	    tree.root1.left.right = new Node(11);
	    tree.root1.right.left = new Node(10);
	    tree.root1.right.right = new Node(15);
	    
	    printKDistant(tree.root1, 3);
	    
	}
}

# 4 11 10 15 
