// package whatever; // don't place package name!

import java.io.*;

class Stack {
  private int arr[];
  private int top;
  
  Stack(){
    top = -1;
    arr = new int[10];  
  }
  
  public void push(int data) throws Exception{
    if(top == arr.length - 1)
       throw new FullStackException();
    top++;
    arr[top] = data;       
  }
  
  public int pop() throws Exception{
    if(top==-1)
       throw new EmptyStackException();
    int temp = arr[top];
    top--;
    return temp;
  }
  
  public int peek() throws Exception {
    if(top==-1)
       throw new EmptyStackException();
    return arr[top];
  }
  
  public boolean isEmpty(){
    return top == -1 ? true: false;
  } 
}

class FullStackException extends Exception{
    FullStackException() {
      System.out.println("Stack is full");
    }
}

class EmptyStackException extends Exception{
    EmptyStackException() {
      
      System.out.println("Stack is Empty");
    }
}


class MyCode {
  public static void main (String[] args) throws Exception {
    Stack st = new Stack();
    st.push(2);
    st.push(3);
    st.push(4);
    
    System.out.println(st.pop());
    System.out.println(st.pop());
    System.out.println(st.pop());
    System.out.println(st.pop());
    
  }
}

Output:
4
3
2
Stack is Empty
