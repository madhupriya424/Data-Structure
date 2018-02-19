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
    
    
    
    public static int SumAllNodes(Node root){
        
        if(root==null){
            return 0;
        }
        
        int left = SumAllNodes(root.left);
        int right = SumAllNodes(root.right);
        
        return root.data+left+right;   
    }
    
    // 1 2 3 4 5 -1 -1 8 -1 1 -1 -1 -1 
    
	public static void main (String[] args) {
	    
	    BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.left.left.left = new Node(8);
	   
	    int res = SumAllNodes(tree.root);
		System.out.println(res);
	}
}
