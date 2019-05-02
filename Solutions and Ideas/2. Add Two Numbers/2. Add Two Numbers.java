/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p1 = l1, p2 = l2;
        ListNode dummy = new ListNode(0);
        ListNode head = dummy;
        int pre = 0;
        while(p1 != null || p2 != null){
            int n1 = p1 == null ? 0 : p1.val;
            int n2 = p2 == null ? 0 : p2.val;
            int sum = n1 + n2 + pre;
            dummy.next = new ListNode(sum % 10);
            dummy = dummy.next;
            pre = sum / 10;
            if(p1 != null) p1 = p1.next;
            if(p2 != null) p2 = p2.next;
        }
        if(pre == 1) dummy.next = new ListNode(pre);
        return head.next;
    }
}