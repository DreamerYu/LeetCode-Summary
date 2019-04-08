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
    int mod = 1000000007;
    public int sumRootToLeaf(TreeNode root) {
        if(root == null) return 0;
        return help(root, 0);
    }

    public int help(TreeNode root, int pre){
        if(root.left == null && root.right == null) return (pre + root.val) % mod;
        int sum = 0;
        if(root.left != null) sum += help(root.left, (pre + root.val) * 2 % mod) % mod;
        if(root.right != null) sum += help(root.right, (pre + root.val) * 2 % mod) % mod;
        return sum % mod;
    }
}