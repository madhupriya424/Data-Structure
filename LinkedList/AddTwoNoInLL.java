2. Add Two Numbers

You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example:

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.
------------------------------------------------------------------------------------------------------------------------------
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
   
    
    /*    Reverse LL
    public ListNode reverse(ListNode node){
        
        ListNode prev = null;
        ListNode second = null;
        ListNode current = node;
        while(current!=null){
            second = current.next;
            current.next = prev;
            prev = current;
            current = second;
        }
        return prev;
    }    */
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // reverse(l1);
        // reverse(l2);
        
        ListNode head = null;
        ListNode res = null;
        int carry = 0, sum =0;
        while(l1!=null && l2!=null){
             sum  = l1.val + l2.val + carry;
             int data = sum%10;
            
             ListNode res1 = new ListNode(data);
             
             if(sum>9)
                 carry = 1;
             else
                 carry = 0;
            
            if(head==null){
               head = res1;
               res = res1;
              
            }else{
                res.next = res1;
               res = res.next;
            }
            
            l1 = l1.next;
             l2 = l2.next;
        }
        
        while(l1!=null)
        {
             sum = l1.val + carry;
            if(sum>9)
                 carry = 1;
             else
                 carry = 0;
            
            int data = sum%10;
            
            ListNode res1 = new ListNode(data);
            
            res.next=res1;
            res = res.next;
            
            l1 = l1.next;
        }
        
         while(l2!=null)
        {    sum = l2.val + carry;
            if(sum>9)
                carry = 1;
            else
                carry = 0;
         
            int data = sum % 10;
            ListNode res1 = new ListNode(data);
            res.next = res1;
            res = res.next; 
            l2=l2.next;
        }
        
        if(carry==1){
            ListNode res1 = new ListNode(1);
            res.next = res1;
            res = res.next; 
        }
        
         return head;
        
    }
}

---------------------------------------------------------------------------------------------------------------------------

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        if(l1 == null)
            return l2;
        if(l2 == null)
            return l1;
        
        int carry = 0;
        ListNode head = null;
        ListNode tail = null;
        int sum = l1.val + l2.val;
        if(sum >= 10)
            carry = 1;
        
        head = tail = new ListNode(sum%10);
        l1 = l1.next;
        l2 = l2.next;
        
        while(l1 != null && l2!= null){
            sum = l1.val + l2.val + carry;
            if(sum >= 10)
                carry = 1;
            else
                carry = 0;
            
            tail.next = new ListNode(sum%10);
            tail = tail.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        
        while(l1 != null){
            sum = l1.val + carry;
            if(sum >= 10)
                carry = 1;
            else
                carry = 0;
            
            tail.next = new ListNode(sum%10);
            tail = tail.next;
            l1 = l1.next;
        }
        
        while(l2 != null){
            sum = l2.val + carry;
            if(sum >= 10)
                carry = 1;
            else
                carry = 0;
            
            tail.next = new ListNode(sum%10);
            tail = tail.next;
            l2 = l2.next;
        }
        
        if(carry == 1){
            tail.next = new ListNode(1);
        }
        
        return head;
    }
}
