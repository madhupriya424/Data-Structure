

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
    
    public int getParent(int index){
        if(index%2 == 0)
            return index/2-1;
        return index/2;    
    }
    
    public void bubbleUp(int index){
        if(index == 0)
            return;
        
        int parentIndex = getParent(index);
        
        if(arr[parentIndex] > arr[index]){
            
            int temp = arr[parentIndex];
            arr[parentIndex] = arr[index];
            arr[index] = temp;
            
            bubbleUp(parentIndex);
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
            
        int lc = 2*index + 1;
        int rc = 2*index + 2;
        
        int largest = index;
        
        if(lc < size && arr[largest] > arr[lc])
            largest = lc;
        if(rc < size && arr[largest] > arr[rc])
            largest = rc;
        
        if(largest != index){
            //swap
            int temp = arr[index];
            arr[index] = arr[largest];
            arr[largest] = temp;
            
        bubbleDown(largest);
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

Output:
2
1
2
3
0
