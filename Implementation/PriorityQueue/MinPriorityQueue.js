


/*package whatever //do not write package name here */

import java.io.*;

class MinPriorityQueue {
    int arr[];
    int size;
    int capacity;
    
    MinPriorityQueue(){
        arr = new int[20];
        size = 0;
        capacity = 20;
    }
    
 
    // add
    public void add(int item){
        if(size == capacity)
            rehash();
        
        arr[size] = item;
        
        bubbleUp(size);
        
        size++;
    }
    
    public void bubbleUp(int index){
        if(index == 0)
            return;
        
        if(index % 2 == 0){
            
            if(arr[index/2-1] > arr[index]){
                // swap
                int temp = arr[index/2-1];
                arr[index/2-1] = arr[index];
                arr[index] = temp;
                
                bubbleUp(index/2-1);
            }
        }else{
            if(arr[index/2] > arr[index]){
                // swap
                int temp = arr[index/2];
                arr[index/2] = arr[index];
                arr[index] = temp;
                
                bubbleUp(index/2);
            }
        }    
    }
    
    //peek
    public int peek(){
        return arr[0];
    }
    
    //remove
    public void remove(){
        if(size == 0)
            return;
        
        //swap first and last value
        int temp = arr[size-1];
        arr[size-1] = arr[0];
        arr[0] = temp;
        
        size--;
        
        bubbleDown(0);
    }
    
    
    public void bubbleDown(int index){
        if(index == size)
            return;
        
        if(arr[(2*index)] > arr[(2*index)+1]){
        
            //swap
            int temp = arr[(2*index)+1];
            arr[(2*index)+1] = arr[(2*index)];
            arr[(2*index)] = temp;
            
            bubbleDown(arr[(2*index)+1]);
        }    
        else if(arr[(2*index)] > arr[(2*index)+2]){
            //swap
            int temp = arr[(2*index)];
            arr[(2*index)] = arr[(2*index)+2];
            arr[(2*index)+2] = temp;
            
            bubbleDown(arr[(2*index)+2]);
        }
    }
    
    
    //rehash
    public void rehash(){
        int temp[] = new int[2*size];
        for(int i = 0; i < arr.length; i++){
            temp[i] = arr[i];
        }
        
        arr = temp;
    }
    
	public static void main (String[] args) {
	    MinPriorityQueue pq = new MinPriorityQueue();
	    pq.add(3);
	    pq.add(2);
	    pq.add(4);
	    System.out.println(pq.peek());
	    pq.add(1);
		System.out.println(pq.peek());
		pq.remove();
		System.out.println(pq.peek());
		pq.remove();
		System.out.println(pq.peek());
		pq.add(0);
		System.out.println(pq.peek());
	}
}

//
2
1
2
3
0
