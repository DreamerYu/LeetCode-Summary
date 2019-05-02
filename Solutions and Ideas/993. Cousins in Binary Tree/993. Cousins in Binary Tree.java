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
    public boolean isCousins(TreeNode root, int A, int B) {
        if(root == null) return false;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size = q.size();
            boolean aexist = false, bexist = false;
            for(int i = 0; i < size; i++){
                TreeNode cur = q.poll();
                if(cur.val == A) aexist = true;
                if(cur.val == B) bexist = true;
                if(cur.left != null && cur.right != null){
                    if(cur.left.val == A && cur.right.val == B) return false;
                    if(cur.left.val == B && cur.right.val == A) return false;
                }
                if(cur.left != null){
                    q.offer(cur.left);
                }
                if(cur.right != null){
                    q.offer(cur.right);
                }
            }
            if(aexist && bexist) return true;
        }
        return false;

    }
}