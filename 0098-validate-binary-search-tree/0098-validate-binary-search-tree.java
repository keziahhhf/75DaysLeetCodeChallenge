/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isValidBST(TreeNode root) {
        return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
     private boolean validate(TreeNode node, long min, long max) {
                // Base case: An empty tree is a valid BST
                        if (node == null) {
                                    return true;
                                            }

                                                    // Check if current node's value violates the range constraints
                                                            if (node.val <= min || node.val >= max) {
                                                                        return false;
                                                                                }

                                                                                        // Recursively validate subtrees with updated bounds:
                                                                                                // Left subtree must be less than current node's value
                                                                                                        // Right subtree must be greater than current node's value
                                                                                                                return validate(node.left, min, node.val) && 
                                                                                                                               validate(node.right, node.val, max);
                                                                                                                                   } 
     }
