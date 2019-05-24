/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode cur = head, next = head.next, nexthead = next.next;
        next.next = cur;
        cur.next = swapPairs(nexthead);
        return next;
    }
}