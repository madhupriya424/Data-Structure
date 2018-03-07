/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    
     static int Length(ListNode head){
        if(head==null)
            return 0;
        int count=0;
        while(head!=null)
        {
            head = head.next;
            count++;
        }
         return count;
    }   
        
        
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len =Length(head);
        int pos =len-n;
        ListNode temp = head;
        int count=1;
        while(temp!=null)
        {
            if(pos==0)
            {
                ListNode temp1 = temp.next;
                temp.next = null;
                head=temp1;
            }
            
            if(pos==count)
            {
                 ListNode temp1 = temp.next;
                 temp.next = temp1.next;
                 temp1.next=null;
            }
            temp = temp.next;
            count++;
        }
        return head;
    }
}

# Given linked list: 1->2->3->4->5, and n = 2.

   After removing the second node from the end, the linked list becomes 1->2->3->5.
