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
    
    public static void printRightView(Node root, int level){
        if(root==null){
            return;
        }
        
        if(Max_Level<level)
        {
            System.out.print(root.data+" ");
            Max_Level=level;
        }
        
        printRightView(root.right, level+1);
        printRightView(root.left, level+1);
        
    }
    
    // 1 2 3 4 -1 5 6 -1 -1 -1 -1 -1 7 -1 8 -1 -1
    /*                  1  Level=0
                       / \ 
                      2   3  level=1
                     /    / \
                    4    5    6 Level=2
                               \
                                7 Level=3
                                 \
                                  8 Level=4
    */
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
	     printRightView(tree.root, 0);
		//System.out.println(res);
	}
}

# 1 3 6 7 8
