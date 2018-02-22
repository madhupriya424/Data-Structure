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
          
      int left =  Height(root.left);
      int right =  Height(root.right);
      
      return Math.max(left, right)+1;
   }
    public static int Diameter(Node root){
          if(root==null)
             return 0;
             
          int l_height = Height(root.left);
          int r_height = Height(root.right);
          
          int l_diameter = Diameter(root.left);
          int r_diameter = Diameter(root.right);
             
          int max_diameter = l_diameter>r_diameter ? l_diameter:r_diameter;
          
          return Math.max(max_diameter, l_height+r_height+1);
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
	    
		System.out.print(Diameter(tree.root));
	}
}

# 5
-----------------------------------------------------------
 BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.right.left = new Node(5);
	    tree.root.right.right = new Node(6);
	    tree.root.right.right.right = new Node(7);
	     tree.root.right.right.right.right = new Node(8);
# 7       
