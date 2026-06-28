/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (head == null || m == n) return head;

        ListNode dummy = new ListNode(0, head);
        ListNode pre = dummy;

        for (int i = 1; i < m; i++) {
            pre = pre.next;
        }

        ListNode start = pre.next;
        ListNode then = start.next;

        for (int i = 0; i < n - m; i++) {
            start.next = then.next; // detach then
            then.next = pre.next;   // insert then after pre
            pre.next = then;        // connect pre to then
            then = start.next;      // move to the next node to be repositioned
        }

        return dummy.next;
    }
}