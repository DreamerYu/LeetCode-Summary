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
    int result = Integer.MIN_VALUE;
    public int maxAncestorDiff(TreeNode root) {
        for(int ele : help(root)){
            result = Math.max(result, Math.abs(ele));
        }
        return result;
    }

    public List<Integer> help(TreeNode root){
        if(root == null) return null;

        int base = 0;
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;

        List<Integer> res = new ArrayList<>();
        List<Integer> left = help(root.left);
        List<Integer> right = help(root.right);
        if(left != null){
            base = root.val - root.left.val;
            max = Math.max(max, base);
            min = Math.min(min, base);
            for(int ele : left){
                max = Math.max(max, ele + base);
                min = Math.min(min, ele + base);
            }
        }

        if(right != null){
            base = root.val - root.right.val;
            max = Math.max(max, base);
            min = Math.min(min, base);
            for(int ele : right){
                max = Math.max(max, ele + base);
                min = Math.min(min, ele + base);
            }
        }
        if(left != null || right != null){
            res.add(max);
            result = Math.max(result, Math.abs(max));
            res.add(min);
            result = Math.max(result, Math.abs(min));
        }
        return res;
    }
}