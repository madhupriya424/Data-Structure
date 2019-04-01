/*package whatever //do not write package name here */

import java.io.*;

class Node{
    int data;
    Node left;
    Node right;
    
    Node(int data){
        this.data = data;
    }
}


class BinaryTree {
    Node root;
   // static int count = 0;
    
    public static int CountLeafNode(Node root){
        if(root==null)
           return 0;
        int count = 0;
        
        if(root.left==null && root.right==null)
          return 1;
          
         count = count + (CountLeafNode(root.left)) + (CountLeafNode(root.right));
        
        return count;  
    }
    
    
	public static void main (String[] args) {
	    BinaryTree tree = new BinaryTree();
	    tree.root = new Node(40);
	    tree.root.left = new Node(15);
	    tree.root.right = new Node(25);
	    tree.root.left.left = new Node(4);
	    tree.root.left.right = new Node(11);
	    tree.root.right.left = new Node(10);
	 //   tree.root.right.right = new Node(15);
	    
	    
		System.out.println(CountLeafNode(tree.root));
	}
}
----------------------------------------------------------------------------------------------------------------------------
class GfG
{
    int countLeaves(Node node) 
    {
        if(node==null)
            return 0;
        
        int left = countLeaves(node.left);    
        int right = countLeaves(node.right);
        
        if(left==0 && right==0)
            return 1;
        
        return left+right;    
    }
}	
	
# 3
