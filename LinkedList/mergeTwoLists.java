/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode a, ListNode b) {
        ListNode res=null;
        if(a==null)
            return b;
        if(b==null)
            return a;
        if(a.val<=b.val)
        {
            res = a;
        res.next = mergeTwoLists(a.next, b);
        } 
        else
        {
            res= b;
            res.next = mergeTwoLists(a, b.next);
        }
        return res;
    }
}

# Input: 1->2->4, 1->3->4
Output: 1->1->2->3->4->4
