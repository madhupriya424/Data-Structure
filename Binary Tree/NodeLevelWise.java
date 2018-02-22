/*package whatever //do not write package name here */

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
    Node root;
  
   
    public static void FindNodeByLevel(Node root, int level){
          if(root==null)
             return;
             
          if(level==1)
             System.out.print(root.data+" ");
          
          
            FindNodeByLevel(root.left, level-1); 
            FindNodeByLevel(root.right, level-1); 
         
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
	    
		FindNodeByLevel(tree.root, 3);
	}
}

# 4 11 10 15
