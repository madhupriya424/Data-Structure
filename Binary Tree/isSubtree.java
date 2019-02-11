572. Subtree of Another Tree

Given two non-empty binary trees s and t, check whether tree t has exactly the same structure and node values with a subtree of s. A subtree of s is a tree consists of a node in s and all of this node's descendants. The tree s could also be considered as a subtree of itself.

Example 1:
Given tree s:

     3
    / \
   4   5
  / \
 1   2
Given tree t:
   4 
  / \
 1   2
Return true, because t has the same structure and node values with a subtree of s.
Example 2:
Given tree s:

     3
    / \
   4   5
  / \
 1   2
    /
   0
Given tree t:
   4
  / \
 1   2
Return false.




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
    
    public boolean sameTree(TreeNode s, TreeNode t){
        if(s==null && t!=null || s!=null && t==null)
            return false;
        
        if(s==null && t==null)
            return true;
        
        if(s.val!=t.val)
            return false;
        
    
        boolean left = sameTree(s.left, t.left);
        boolean right = sameTree(s.right, t.right);
        
        if(left && right)
            return true;
        return false;
        
    }
    
    public boolean isSubtree(TreeNode s, TreeNode t) {
        
        if(s==null && t==null)
            return true;
        
          if(s==null || t==null)
            return false;
        
        if(s.val==t.val)
            if(sameTree(s, t))
               return true;
              
        
       boolean left =  isSubtree(s.left, t);
       if(left)
           return true;
       boolean right = isSubtree(s.right, t);
       if(right)
           return true;
        
        return false; 
    }
}
