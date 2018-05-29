/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class Node<T>{
    T data;
    Node<T> left;
    Node<T> right;
    
    Node(T data){
        this.data = data;
    }
}

class BinaryTree {
    
    static class QueItem{
        Node<Integer> node;
        int horizontal_distance;
        
        QueItem(Node<Integer> node, int horizontal_distance){    //?
            this.node=node;
            this.horizontal_distance=horizontal_distance;
        }
    }    
    
    static Node root;
    static TreeMap<Integer, Integer> tm = new TreeMap<>();
    
    public static void topView(Node root){
        if(root==null)
            return;
        
        Queue<QueItem> q = new LinkedList<QueItem>();
        q.add(new QueItem(root, 0));
        
        
        while(!q.isEmpty())
        {
            QueItem qitem = q.remove();
            Node currNode = qitem.node;
            int hd = qitem.horizontal_distance;
            
            if(!tm.containsKey(hd))
                tm.put(hd, (Integer)currNode.data);
                
            if(currNode.left!=null)
                q.add(new QueItem(currNode.left, hd-1));
                
            if(currNode.right!=null)
                q.add(new QueItem(currNode.right, hd+1));
        }
    }
    
    
    
	public static void main (String[] args) {
	     BinaryTree tree = new BinaryTree();
        tree.root = new Node<Integer>(1);
        tree.root.left = new Node<Integer>(2);
        tree.root.right = new Node<Integer>(3);
        tree.root.left.left = new Node<Integer>(4);
        tree.root.right.left = new Node<Integer>(5);
	    tree.root.right.right = new Node<Integer>(6);
	    tree.root.right.right.right = new Node<Integer>(7);
	     tree.root.right.right.right.right = new Node<Integer>(8);
	     topView(tree.root);
	     
	    for(Map.Entry<Integer, Integer> t: tm.entrySet())
	        System.out.print(t.getValue()+" ");
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

# 4 2 1 3 6 7 8 
