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
    
    public static int SumKthLevelNode(Node root, int level){
        
        if(root==null){
            return 0;
        }
        
        if(level==1){
            return root.data;       //System.out.println(root.data);
        }
        
        int left = SumKthLevelNode(root.left, level - 1);
        int right = SumKthLevelNode(root.right, level - 1);
        
        return left+right;
    }
    
    
	public static void main (String[] args) {
	    
	    BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.left.left.left = new Node(8);
	   
	    int res = SumKthLevelNode(tree.root,  3);
		System.out.println(res);
	}
}
