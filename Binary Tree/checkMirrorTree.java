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
    Node root1, root2;
   // static int count = 0;
    
   public static boolean checkMirrorTree(Node root1, Node root2){
       if(root1==null && root2==null)
          return true;
        
        if(root1==null || root2==null)
           return false;
        
        if(root1.data==root2.data)
        {
            boolean left = checkMirrorTree(root1.left, root2.right);
            boolean right = checkMirrorTree(root1.right, root2.left);
            
            if(left==true && right==true)
               return true;
        }
        return false;
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
	    
	    tree.root2 = new Node(40);
	    tree.root2.left = new Node(25);
	    tree.root2.right = new Node(15);
	    tree.root2.left.left = new Node(15);
	    tree.root2.left.right = new Node(10);
	    tree.root2.right.left = new Node(11);
	    tree.root2.right.right = new Node(4);
	    
		System.out.println(checkMirrorTree(tree.root1, tree.root2));
	}
}

# true
