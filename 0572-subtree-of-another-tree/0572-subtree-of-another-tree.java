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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
          if (root == null) return false;
                  
                          // 1. Check if tree starting at current node matches subRoot
                                  if (isSameTree(root, subRoot)) return true;
                                          
                                                  // 2. If not, search recursively in left and right subtrees
                                                          return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

        private boolean isSameTree(TreeNode p, TreeNode q) {
                // If both are null, they are identical
                        if (p == null && q == null) return true;
                                
                                        // If only one is null or values differ, they are not identical
                                                if (p == null || q == null || p.val != q.val) return false;
                                                        
                                                                // Recursively check left and right children
                                                                        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
                                                                            }
                                                                            }
