//Two Methods:
1. Iterative(by changing links)
2. recursion

import java.io.*;


class MyCode {

  public static void main (String[] args) {
    
  }
  
  
  
1 -> 2 -> 3 -> 4 -> null
                  
  
  
  
public static Node reverse(Node head) {
   
 if(head==null || head.next == null)
       
	 return head;   
   

 Node ans = reverse(head.next) ;
   
 head.next.next = head;
   
 head.next = null;
   
 return ans;

  }


  public static Node reverseIterate(Node head) {

  Node second = head.next;
 
  Node curr = head;

  Node prev = null;

    
 while(curr != null) {
  
    	second = curr.next;

      	curr.next = prev;

      	prev = curr;
    
  	curr = second;

    }
  
  
    return curr;
  
   }

 
}

