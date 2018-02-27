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
   Node root1;
   
   static LinkedList<Integer> al = new LinkedList<>();
   
   public static void PrintAllPath(Node root1){
       if(root1==null)
          return;
          
        al.add(root1.data);
        
        if(root1.left==null && root1.right==null)
        {
            System.out.print(al);
            al.removeLast();
            return;
        }
        
        PrintAllPath(root1.left);
        PrintAllPath(root1.right);
        al.removeLast();   
           
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
	    
	    PrintAllPath(tree.root1);
	    
	}
}
# [40, 15, 4][40, 15, 11][40, 25, 10][40, 25, 15]
