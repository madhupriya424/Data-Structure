/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GfG's Online Judge.*/


/*
  Merge two linked lists 
  head pointer input could be NULL as well for empty list
  Node is defined as 
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
*/
class gfg
{
    Node MergeLists(Node h1, Node h2) {
     // This is a "method-only" submission. 
     // You only need to complete this method
     Node h,tail;
     if(h1.data<=h2.data)
     {
         h=h1;
         tail=h;
         h1=h1.next;
     }
     else
     {
        h=h2;
        tail=h2;
        h2=h2.next; 
     }
     while(h1!=null && h2!=null)
     {
         if(h1.data<=h2.data)
         {
             tail.next=h1;
             tail=h1;
             h1=h1.next;
         }
         else
         {
             tail.next=h2;
             tail=h2;
             h2=h2.next;
         }
     }
     if(h1!=null)
        {
            tail.next=h1;
        }
     else
     {
         tail.next=h2;
     }
     return h;
   } 
}
##### Merge two linked list iterative
