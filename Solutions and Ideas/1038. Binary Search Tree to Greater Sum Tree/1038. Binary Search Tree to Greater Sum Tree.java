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
    int sum = 0;
    public TreeNode bstToGst(TreeNode root) {
        intraverse(root);
        intraverse2(root);
        return root;
    }

    public void intraverse(TreeNode root){
        if(root == null) return;
        intraverse(root.left);
        sum += root.val;
        intraverse(root.right);
    }

    public void intraverse2(TreeNode root){
        if(root == null) return;
        intraverse2(root.left);
        int temp = root.val;
        root.val = sum;
        sum -= temp;
        intraverse2(root.right);
    }
}