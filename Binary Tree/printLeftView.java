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
    
    Node root;
    static int Max_Level=-1; 
    
    public static void printLeftView(Node root, int level){
        if(root==null){
            return;
        }
        
        if(Max_Level<level)
        {
            System.out.print(root.data+" ");
            Max_Level=level;
        }
        
        printLeftView(root.left, level+1);
        printLeftView(root.right, level+1);
    }
    
    // 1 2 3 4 -1 5 6 -1 -1 -1 -1 -1 7 -1 8 -1 -1
                        1
                       / \
                      2   3
                     /    / \
                    4    5    6
                               \
                                7
                                 \
                                  8
    
	public static void main (String[] args) {
	    
	    BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.right.left = new Node(5);
	    tree.root.right.right = new Node(6);
	    tree.root.right.right.right = new Node(7);
	     tree.root.right.right.right.right = new Node(8);
	     printLeftView(tree.root, 0);
		//System.out.println(res);
	}
}

# 1 2 4 7 8 
