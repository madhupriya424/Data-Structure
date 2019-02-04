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
    public int sumOfLeftLeaves(TreeNode root) {
        if(root==null)
            return 0;
        
        
        int left = sumOfLeftLeaves(root.left);
        int right = sumOfLeftLeaves(root.right);
        
        if(root.left!=null && root.left.left==null && root.left.right==null)
            return root.left.val + right;
        else
            return left + right;
    }
}


404. Sum of Left Leaves
Easy

560

60

Favorite

Share
Find the sum of all left leaves in a given binary tree.

Example:

    3
   / \
  9  20
    /  \
   15   7

There are two left leaves in the binary tree, with values 9 and 15 respectively. Return 24.
