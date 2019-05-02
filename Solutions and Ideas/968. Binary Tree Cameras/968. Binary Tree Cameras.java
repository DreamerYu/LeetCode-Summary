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
    int res = 0;
    public int minCameraCover(TreeNode root) {
        int h = help(root);
        return h == 0 ? res+1:res;
    }

    public int help(TreeNode root){
        if(root == null) return 1;
        int left = help(root.left), right = help(root.right);
        if(left==0 || right==0){
            res++;
            return 2;
        }else if(left == 2 || right == 2){
            return 1;
        }else return 0;
    }
}