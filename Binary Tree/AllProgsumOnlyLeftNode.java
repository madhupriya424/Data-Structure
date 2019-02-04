[8:57 PM, 2/3/2019] madhupriya424: /*package whatever //do not write package name here */

import java.io.*;

class Tree {
    static Node root;
    
    public static int countNode(Node head){
        if(head==null)
            return 0;
      
        int leftCount = countNode(head.left);
        int rightCount = countNode(head.right);
        
        return 1 + leftCount + rightCount; 
        
    } 
    
	-------------------------------------------------------------------------------------------------------------------------------

import java.io.*;

class Tree {
    static Node root;
    
    public static int sumNode(Node head){
        if(head==null)
            return 0;
            
        int leftCount = sumNode(head.left);
        int rightCount = sumNode(head.right);
        
        return head.data + leftCount + rightCount; 
        
    } 
    
    
-----------------------------------------------------------------------------------------------------------------------------------

import java.io.*;

class Tree {
    static Node root;
    
    public static int countLeafNode(Node head){
        if(head==null)
            return 0;
        
        if(head.left==null && head.right==null)
           return 1; 
           
        int leftCount = countLeafNode(head.left);
        int rightCount = countLeafNode(head.right);
        
        return leftCount + rightCount; 
        
    } 
    
    ---------------------------------------------------------------------------------------------------------------------------------
    
    public static int height(Node head){
        if(head==null)
            return 0;
       
        int leftCount = height(head.left);
        int rightCount = height(head.right);
        
        return 1 + Math.max(leftCount, rightCount);
        
    } 
    
    ---------------------------------------------------------------------------------------------------------------------------------
    
    public static int countLeftNode(Node root,int flag){
        if(root==null)
            return 0;
        
        int leftCount = countLeftNode(root.left, 0);
        int rightCount = countLeftNode(root.right, 1);
        
        if(flag==0)
          return 1 + left + right;
        else  
          return left + right;
        
    } 
    
    main:
    countLeftNode(root, -1);
    ---------------------------------------------------------------------------------------------------------------------------------
    100. Same Tree

Given two binary trees, write a function to check if they are the same or not.

Two binary trees are considered the same if they are structurally identical and the nodes have the same value.

Example 1:

Input:     1         1
          / \       / \
         2   3     2   3

        [1,2,3],   [1,2,3]

Output: true
Example 2:

Input:     1         1
          /           \
         2             2

        [1,2],     [1,null,2]

Output: false
Example 3:

Input:     1         1
          / \       / \
         2   1     1   2

        [1,2,1],   [1,1,2]

Output: false

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isSameTree(TreeNode head1, TreeNode head2) {
       
        if(head1==null && head2==null)
           return true;
        
        if((head1!=null && head2==null) || (head1==null && head2!=null))
            return false;
            
         
        boolean left = isSameTree(head1.left, head2.left);
        boolean right = isSameTree(head1.right, head2.right);
        
        if(left && right && head1.val == head2.val)
          return true;
        
        return false;
    }
    
}

--------------------------------------------------------------------------------------------------------------------------------

public static int sumOnlyLeftNode(Node root){
        if(root==null)
            return 0;
        
        int leftSum = sumOnlyLeftNode(root.left);
        int rightSum = sumOnlyLeftNode(root.right);
        
        if(root.left != null)
            return root.left.val + leftSum + rightSum;
            
        return leftSum + rightSum;    
    }
