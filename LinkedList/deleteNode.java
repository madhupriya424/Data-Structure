/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        if(node==null)
            return;
        ListNode temp = node.next;
         node.val = node.next.val;
         node.next = node.next.next;
        temp.next=null;
         
    }
}

#### delete node without passing head
Supposed the linked list is 1 -> 2 -> 3 -> 4 and you are given the third node with value 3, the linked list should become 1 -> 2 -> 4 after calling your function.

