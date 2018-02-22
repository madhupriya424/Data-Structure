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
  
    
    public static boolean childSumProperty(Node root){
        int left_data = 0;
        int right_data = 0;
        
        if(root==null || root.left==null && root.right==null)
           return true;
           
        if(root.left!=null)
            left_data = root.left.data;
           
        if(root.right!=null)
            right_data = root.right.data;
           
        boolean left_Node = childSumProperty(root.left);
        boolean right_Node = childSumProperty(root.right);
        
        if(left_Node==right_Node)
        return  (root.data==left_data+right_data);
        
        return false;
    }
    
    // 40 15 25 4 11 10 15 -1 -1 -1 -1 -1 -1 -1 -1
    
	public static void main (String[] args) {
	    BinaryTree tree = new BinaryTree();
	    tree.root = new Node(40);
	    tree.root.left = new Node(15);
	    tree.root.right = new Node(25);
	    tree.root.left.left = new Node(4);
	    tree.root.left.right = new Node(11);
	    tree.root.right.left = new Node(10);
	    tree.root.right.right = new Node(15);
	    
		System.out.println(childSumProperty(tree.root));
	}
}
