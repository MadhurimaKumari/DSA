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
    public ListNode deleteMiddle(ListNode head) {
        // int len=0;
        // ListNode temp=head;
        // while(temp!=null){
        //     temp=temp.next;
        //     len++;
        // }

        // ListNode slow=head;
        // ListNode fast=head;
        // for(int i=0; i<(len+1)/2;i++){
        //     fast=fast.next;
        // }
        // if(fast==null){
        //     return null;
        // }
        // while(fast.next!=null){
        //     fast=fast.next;
        //     slow=slow.next;
        // }
        // slow.next=slow.next.next;
        // return head;
        if(head == null || head.next == null){
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        fast = fast.next.next;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;
        return head;

    }
}