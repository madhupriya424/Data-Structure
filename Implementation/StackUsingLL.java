// package whatever; // don't place package name!

import java.io.*;

class Node<T> {
  T data;
  Node next;
  
  Node(T data) {
    this.data = data;
  }
}


class Stack<T> {
  private Node<T> top;
  
  Stack(){
    top = null;
  }
  
  public void push(T data) {
    Node<T> newNode = new Node<T>(data);
    newNode.next = top;
    top = newNode;
  }
  
  public T pop() throws Exception{
    if(top==null)
       throw new EmptyStackException();
    T data = top.data;
    top = top.next;
    return data;
  }
  
  public T peek() throws Exception {
    if(top== null)
       throw new EmptyStackException();
    return top.data;
  }
  
  public boolean isEmpty(){
    return top == null ? true: false;
  } 
}

class EmptyStackException extends Exception{
    EmptyStackException() {
      
      System.out.println("Exception in class main :  Stack is Empty");
    }
}


class MyCode {
  public static void main (String[] args) throws Exception {
    Stack<Integer> st = new Stack<Integer>();
    st.push(2);
    st.push(3);
    st.push(4);
    
    System.out.println(st.pop());
    System.out.println(st.pop());
    System.out.println(st.peek());
    System.out.println(st.pop());
    System.out.println(st.pop());
    
  }
}

Output:
4
3
2
2
Exception in class main: stack is Empty
