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
  
    public static int Height(Node root){
        if(root==null)
          return 0;
        
        int left = Height(root.left);
        int right = Height(root.right);
         
        return Math.max(left,right)+1;  
    }  
  
  
    public static void levelOrderTraversal(Node root){
        int h = Height(root);
        
        for(int i=1; i<=h;i++){
            returnLevelNode(root, i);
            System.out.println();
          
        }
    }
    
    public static void returnLevelNode(Node root, int level){
          if(root==null)
             return;
             
          if(level==1)
             System.out.print(root.data+" ");
          
          
            returnLevelNode(root.left, level-1); 
            returnLevelNode(root.right, level-1); 
         
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
	    
		levelOrderTraversal(tree.root);
	}
}

#  40 
15 25 
4 11 10 15 
