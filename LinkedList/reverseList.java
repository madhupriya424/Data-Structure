/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null|| head.next==null)
            return head;
        ListNode smallAns = reverseList(head.next);
           head.next.next=head;
           head.next=null;
        return smallAns;
    }
}

A linked list can be reversed recursively. 
