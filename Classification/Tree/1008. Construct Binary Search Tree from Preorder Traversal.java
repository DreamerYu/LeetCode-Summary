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
    int index = 0;
    public TreeNode bstFromPreorder(int[] preorder) {
        return help(preorder, Integer.MAX_VALUE);
    }

    public TreeNode help(int[] preorder, int bound){
        if(index >= preorder.length || preorder[index] > bound) return null;
        TreeNode root = new TreeNode(preorder[index++]);
        root.left = help(preorder, root.val);
        root.right = help(preorder, bound);
        return root;
    }
}