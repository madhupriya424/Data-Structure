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
    Node node1, node2, root1;
   
    
   public static Node LowestCommonAncestor(Node root1, Node node1, Node node2){
       if(root1==null)
          return null;
          
        if(root1==node1 || root1==node2)
           return root1;
           
      /*  if(root1.left==null && root1.right==null)
           return null;   */
        
            Node left = LowestCommonAncestor(root1.left, node1, node2);
            Node right = LowestCommonAncestor(root1.right, node1, node2);
        
         if(left!=null && right==null)
           return left; 
          if(left==null && right!=null)
           return right;
           
         if(left!=null && right!=null)
           return root1;   
         
        return null;   
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
	    
	    System.out.print(LowestCommonAncestor(tree.root1,  tree.root1.left,   tree.root1.right).data);
	    
	}
}

# 40
