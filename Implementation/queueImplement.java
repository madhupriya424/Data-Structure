/*package whatever //do not write package name here */

// (left)front - deletion 
// (right)rear - insertion

import java.io.*;

class queueImplement {
 
    private int front;
    private int rear;
    private int arr[];
    
    queueImplement(int size){                
        arr = new int[size];
        front = -1;
        rear = -1;                                     
    }
    
    boolean isEmpty(){
        if(front==-1 && rear==-1)
            return true;
        return false;    
    }
    
    void enqueue(int data){
        // if(rear==arr.length-1){
        //     throw new QueuFullException();
        //     return;
        // }  
        
        //In circular queue
        if((rear+1)%size==front){
            throw new QueuFullException();
            return;
        }  
        
        else if(isEmpty()){
            front = 0;
            rear = 0;
        }
        else{
            // rear = rear + 1;
            
            //In circular queue
            rear = (rear + 1) % size;
        }
        
        arr[rear] = data;
    }
    
    void dequeue(){
        if(isEmpty()){
            throw new EmptyQueueException();
            return;
        }
        else if(front==rear){
            front = -1;
            rear = -1;
        }
        else{
            // front = front + 1 ;
            
            //In circular queue
            front = (front+1) % size;
        }
    }
    
    int front(){
        return arr[front];
    }
    
    public class EmptyQueueException extends Exception {
        }

    public class QueueFullException extends Exception {
        }   
	
	public static void main (String[] args) {
		System.out.println("GfG!");
	}
}
