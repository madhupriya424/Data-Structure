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
    Node root1;
    Node root2;
  
    public static int Height(Node root){
        if(root==null)
           return 0;
        int left = Height(root.left);
        int right = Height(root.right);
        
        return Math.max(left,right)+1;
    }
    
    
    public static boolean checkIdentical(Node root1, Node root2){
        if(root1==null && root2==null)
           return true;
        
        if(Height(root1)!=Height(root2))
          return false;
          
        if(root1.data!=root2.data)
           return false;
           
        boolean left = checkIdentical(root1.left, root2.left);
        boolean right = checkIdentical(root1.right, root2.right);
      
        if(left==right)      
           return true;
        return false;   
    }
    
    
	public static void main (String[] args) {
	    BinaryTree tree = new BinaryTree();
	    tree.root1 = new Node(40);
	    tree.root1.left = new Node(15);
	    tree.root1.right = new Node(25);
	    tree.root1.left.left = new Node(4);
	    tree.root1.left.right = new Node(11);
	    tree.root1.right.left = new Node(10);
	    tree.root1.right.right = new Node(15);
	    
	    tree.root2 = new Node(40);
	    tree.root2.left = new Node(15);
	    tree.root2.right = new Node(25);
	    tree.root2.left.left = new Node(4);
	    tree.root2.left.right = new Node(11);
	    tree.root2.right.left = new Node(10);
	    tree.root2.right.right = new Node(15);
	    
		System.out.println(checkIdentical(tree.root1, tree.root2));
	}
}

# true
