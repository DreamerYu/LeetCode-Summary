/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public int[] nextLargerNodes(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode headc = head;
        while(headc != null){
            list.add(headc.val);
            headc = headc.next;
        }

        int[] res = new int[list.size()];

        Stack<Integer> stack = new Stack<>();
        int index = list.size();
        while(--index >= 0){
            while(!stack.isEmpty() && stack.peek() <= list.get(index)){
                stack.pop();
            }
            if(stack.isEmpty()){
                res[index] = 0;
            }else{
                res[index] = stack.peek();
            }
            stack.push(list.get(index));
        }
        return res;

    }
}