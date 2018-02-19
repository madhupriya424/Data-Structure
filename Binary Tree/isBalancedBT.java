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
    
    public static int Height(Node root){
        
        if(root==null){
            return 0;
        }
        int left = Height(root.left);
        int right = Height(root.right);
        
        return Math.max(left, right)+1;
    }
    
    
    
    public static boolean isBalanced(Node root){
        
        if(root==null){
            return true;
        }
        
        int left_Height = Height(root.left);
        int right_Height = Height(root.right);
        
        if(Math.abs(left_Height-right_Height)<=1 && isBalanced(root.left) && isBalanced(root.right))
           return true;
        
        return false;   
    }
    
    // 1 2 3 4 5 -1 -1 8 -1 1 -1 -1 -1 
    
	public static void main (String[] args) {
	    
	    BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
     //   tree.root.left.left.left = new Node(8);
	   
	    boolean res = isBalanced(tree.root);
		System.out.println(res);
	}
}
