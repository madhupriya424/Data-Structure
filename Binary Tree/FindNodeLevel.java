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
    
    public static int FindNodeLevel(Node root, int nodeData, int level){
        
        if(root==null){
            return -1;
        }
        
        if(root.data == nodeData){
            return level;
        }
        
        int left = FindNodeLevel(root.left, nodeData, level+1);
        
        if(left!=-1){
            return left;
        }
        
        int right = FindNodeLevel(root.right, nodeData, level+1);
        
        if(left==-1 && right!=-1){
            return right;
        }
        
        return -1;
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
	   
	    int res = FindNodeLevel(tree.root,  8, 1);
		System.out.println(res);
	}
}
