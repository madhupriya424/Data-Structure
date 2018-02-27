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
   
    
   public static Node MakeMirrorTree(Node root1){
       if(root1==null )
          return root1;
        
        if(root1.left==null && root1.right==null)
           return root1;
        
            Node left = MakeMirrorTree(root1.left);
            Node right = MakeMirrorTree(root1.right);
            
            root1.left=right;
            root1.right=left;
        
        return root1;
   }
    
    public static void preOrder(Node root){
        
        if(root==null)
           return;
        System.out.print(root.data+" ");   
        preOrder(root.left);
        preOrder(root.right);
        
    }
    
    // 40 15 25 4 11 10 15 -1 -1 -1 -1 -1 -1 -1 -1
	public static void main (String[] args) {
	    BinaryTree tree = new BinaryTree();
	    tree.root1 = new Node(40);
	    tree.root1.left = new Node(15);
	    tree.root1.right = new Node(25);
	    tree.root1.left.left = new Node(4);
	    tree.root1.left.right = new Node(11);
	    tree.root1.right.left = new Node(10);
	    tree.root1.right.right = new Node(15);
	    
	/*    tree.root2 = new Node(40);
	    tree.root2.left = new Node(25);
	    tree.root2.right = new Node(15);
	    tree.root2.left.left = new Node(15);
	    tree.root2.left.right = new Node(10);
	    tree.root2.right.left = new Node(11);
	    tree.root2.right.right = new Node(4);  */
	    
	    preOrder(MakeMirrorTree(tree.root1));
	    
	}
}


# 40 25 15 10 15 11 4
