/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */

class Node{
    int data;
    Node next;
    
    Node(int data){
        this.data =data;
    }
}


class LinkedList
{
    //Take input until user gives -1
    // 1 2 3 4 5 6 -1
    public static Node createList(){
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        Node head = null;
        Node tail = null;
        
        while(data!= -1){
            Node newNode = new Node(data);
            if(head == null){
                head = newNode;
                tail = head;
            }
            else{
                tail.next = newNode;
                tail = tail.next;
            }
            data = sc.nextInt();
        }
        return head;
    }
    
    //Print List 
    public static void printList(Node head){
        if(head == null)
            return;
        
        System.out.print(head.data+" ");
        printList(head.next);
    }
    
    public static Node deleteAtPos(Node head, int pos){
        if(head==null)
           return null;
           
        if(pos == 0){
            Node temp = head.next;
            head.next = null;
            head = temp;
            return head;
        }
        
        if(pos == 1){
            Node temp = head.next;
            head.next = temp.next;
            temp.next = null;
            return head;
        }
        
        Node smallAns = deleteAtPos(head.next, pos-1);
        return head;
    }
    
    
	public static void main (String[] args) throws java.lang.Exception
	{
	    Node head = createList();
	    head = deleteAtPos(head, 3);
	    printList(head);
	    System.out.println();
	    head = deleteAtPos(head, 2);
	    printList(head);
	    
	}
}
