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
    boolean result = true;
    public boolean isBalanced(TreeNode root) {
        height(root);
        return result;
        // if (root == null)
        //     return true;
        // int left = height(root.left);
        // int right = height(root.right);
        // if (Math.abs(left - right) > 1)
        //     return false;
        // return isBalanced(root.left) && isBalanced(root.right);
    }

    int height(TreeNode root) {
        if (root == null)
            return 0;
        int left = height(root.left);
        int right = height(root.right);
        if (Math.abs(left - right) > 1)
            result = false;
        return 1 + Math.max(left, right);
    }
}
