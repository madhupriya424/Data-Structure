# Data-Structure

/*package whatever //do not write package name here */

import java.io.*;

class Node<T>{
    int data;
    Node<T> left;
    Node<T> right;
    
    Node<T>(int data){
        this.data = data;
    }
}


class BinaryTreeImp{
    
     static Scanner sc = new Scanner(System.in);
    
    public static Node createBinaryTree(){
        int data = sc.nextInt();
        while(data!=-1)
        {
            Node<Integer> currNode = new Node<Integer>(data);
            int left = createBinaryTree();
            int right = createBinaryTree();
            return currNode;
        }
        return null;
    }
    
    public static Node printLevelWise(){
        
        int data = sc.nextInt();
        if(data!=-1){
        Node<Integer> root = new Node<Integer>(data);
        Queue<Node<LinkedList>> q = new Queue<>();
        q.add(root.data);
        
        while(!q.isEmpty()){
            
            Node currNode<Integer> = q.remove();
            int data = sc.nextInt();
            if(data!=-1){
                currNode.left = new Node<Integer>(data);
                q.add(currNode.left);
            }
            
            int data = sc.nextInt();
            if(data!=-1){
                currNode.right = new Node<Integer>(data);
                q.add( currNode.right);
            }
        }
        return root;
    }
    return null;
    }
    
    public static void preOrder(Node<Integer> root){
        if(root!=Null){
        System.out.println(root.data);
        preOrder(root.left);
        preOrder(root.right);
        }
    }
    
     public static void postOrder(Node root){
        if(root!=Null){
        
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data);
        }
    }
    
     public static void inOrder(Node root){
        if(root!=Null){
          
        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
        }
    }
    
    
    
    
    
    
    
    public static void main(Strings[] args){
        Node dfs = createTree();
        Node bfs = printLevelWise();
    }
}
