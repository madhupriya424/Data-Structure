

/*package whatever //do not write package name here */

import java.io.*;

class MaxPriorityQueue {
    int arr[];
    int size;
    int capacity;
    
    MaxPriorityQueue(){
        arr = new int[20];
        size = 0;
        capacity = 20;
    }
    
 
    // Add an element to Heap
    public void add(int item){
        if(size == capacity)
            rehash();
        
        arr[size] = item;
        
        bubbleUp(size);
        
        size++;
    }
    
    public int getParent(int index) {
        if(index % 2 == 0)
            return index/2 -1;
        return index/2;
    }
    
    public void bubbleUp(int index){
        if(index == 0)
            return;
        
        int parentIndex = getParent(index);
        
	 if(arr[parentIndex] < arr[index]){   
		int temp = arr[index];
		arr[index] = arr[parentIndex];
		arr[parentIndex] = temp;
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
    
    
    /*public void bubbleDown(int index){
        if(index >= size)
            return;
        
        if(arr[(2*index)] < arr[(2*index)+1]){
        
            //swap
            int temp = arr[(2*index)+1];
            arr[(2*index)+1] = arr[(2*index)];
            arr[(2*index)] = temp;
            
            bubbleDown(((2*index)+1));
        }    
        else if(arr[(2*index)] < arr[(2*index)+2]){
            //swap
            int temp = arr[(2*index)];
            arr[(2*index)] = arr[(2*index)+2];
            arr[(2*index)+2] = temp;
            
            bubbleDown(((2*index)+2));
        }
    }*/
    
     private void bubbleDown(int index){
	if(index >= size)
		return;
	     
        int lc = 2 * index + 1;
        int rc = 2 * index + 2;
        int largest = index;
        
        if(lc < size && arr[lc] > arr[largest]) 
            largest = lc;
        if(rc < size && arr[rc] > arr[largest])
            largest = rc;
        
        if(largest != index) {
            int temp = arr[largest];
            arr[largest] = arr[index];
            arr[index] = temp;
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
    
    public String toString() {
        String s = "";
        for(int i = 0; i < size; i++) {
            s += arr[i] + " ";
        }
        return s;
    }

    
	public static void main (String[] args) {
	    MaxPriorityQueue pq = new MaxPriorityQueue();
	    pq.add(3);
	    pq.add(2);
	    pq.add(4);
	    pq.add(8);
	    pq.add(0);
	    pq.add(11);
	    pq.add(5);
		System.out.println(pq);
		pq.remove();
		System.out.println(pq);
		pq.remove();
		System.out.println(pq);
		System.out.println(pq.peek());
		pq.add(10);
		System.out.println(pq.peek());
	}
}


Output:
5 8 11 3 4 2 0 
11 8 2 3 4 0 
8 4 2 3 0 
8
10
