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
    
    static class QueueItem{
       Node node ;
       int horizontal_Distance;
    
    QueueItem(Node node, int horizontal_Distance){
        this.node = node;
        this.horizontal_Distance = horizontal_Distance;
    }
    }
    
    static TreeMap<Integer, Integer> tm = new TreeMap<>(); 
    
    
    public static void TopView(Node root){
        
        if(root==null)
           return;
           
        Queue<QueueItem> q = new LinkedList<QueueItem>();
        q.add(new QueueItem(root, 0));
        
        while(!q.isEmpty()) {
            QueueItem qItem = q.remove();
            Node currNode = qItem.node;
            int hd = qItem.horizontal_Distance;
            
            if(!tm.containsKey(hd)){
                tm.put(hd, currNode.data);
            }
            
            if(currNode.left!=null){
                q.add(new QueueItem(currNode.left, hd-1));
            }
            
            if(currNode.right!=null){
                q.add(new QueueItem(currNode.right, hd+1));
            }
        }    
    }
        
    

    
    // 1 2 3 4 -1 5 6 -1 -1 -1 -1 -1 7 -1 8 -1 -1
    /*                    1
                       / \
                      2   3
                     /    / \
                    4    5    6
                               \
                                7
                                 \
                                  8
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
	     TopView(tree.root);
	     
	     for(Map.Entry<Integer, Integer> entry: tm.entrySet()){
	         System.out.print(entry.getValue()+" ");
	     }
		//System.out.println(res);
	}
}

# 4 2 1 3 6 7 8 
