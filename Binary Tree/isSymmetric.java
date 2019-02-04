101. Symmetric Tree
Easy

1824

38

Favorite

Share
Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).

For example, this binary tree [1,2,2,3,4,4,3] is symmetric:

    1
   / \
  2   2
 / \ / \
3  4 4  3
But the following [1,2,2,null,3,null,3] is not:
    1
   / \
  2   2
   \   \
   3    3
   
-------------------------------------------------------------------------------------------------------------------------------------

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
    public boolean isSymmetric(TreeNode root) {
       return isSymmetric(root, root);
    }
    
     public boolean isSymmetric(TreeNode root1, TreeNode root2) {
        
        if(root1==null && root2==null)
            return true;
         
         if(root1==null && root2!=null || root1!=null && root2==null)
             return false;
         
        boolean left = isSymmetric(root1.left, root2.right);
        boolean right = isSymmetric(root1.right, root2.left);
        
        if(root1.val==root2.val && left && right)
            return true; 
         
            return false;
    }
}
