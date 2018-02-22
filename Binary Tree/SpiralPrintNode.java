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
  
  
    public static void SpiralPrintNode(Node root){
        int h = Height(root);
        boolean b=false;
        
        for(int i=1; i<=h;i++){
            returnLevelNode(root, i, b);
            System.out.println();
            b = !b;    
        }
    }
    
    public static void returnLevelNode(Node root, int level, boolean b){
          if(root==null)
             return;
             
          if(level==1)
             System.out.print(root.data+" ");
          
          if(b==true){
            returnLevelNode(root.left, level-1, b); 
            returnLevelNode(root.right, level-1, b); 
          }
          else{
            returnLevelNode(root.right, level-1, b); 
            returnLevelNode(root.left, level-1, b);   
          }
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
	    
		SpiralPrintNode(tree.root);
	}
}

# 40 
15 25 
15 10 11 4 
