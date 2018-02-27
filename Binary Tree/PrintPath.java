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
   Node root1, node1;
   
   static LinkedList<Integer> al = new LinkedList<>();
   
   public static void PrintPath(Node root1, int  data){
       if(root1==null)
          return;
          
        al.add(root1.data);
        
        if(root1.data==data)
        {
            System.out.print(al);
            return;
        }
        
        PrintPath(root1.left, data);
        PrintPath(root1.right, data);
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
	    
	    PrintPath(tree.root1,  10);
	    
	}
}

# [40, 25, 10]
