

/*package whatever //do not write package name here */

import java.util.*;

class HashMap<k, v> {
    
    ArrayList<MapNode<k, v>> bucket;
    int size;
    
    class MapNode<k, v> {
        k key;
        v value;
        MapNode next;
        
        MapNode(k key, v value){
            this.key = key;
            this.value = value;
        }
    }
    
    HashMap(){
        size = 0;
        bucket = new ArrayList<MapNode<k, v>>(16);
        
        for(int i = 0 ; i < 16; i++){
            bucket.add(null);
        }
    }
    
    
    // put
    public void put(k key, v value){
        int hashCode = getHashCode(key);  // is it always necessary to be hashcode to int?
        int index = compress(hashCode);
        
        MapNode<k, v> head = bucket.get(index);
        
        while(head != null){
            if(head.key.equals(key)){
                head.value = value;
                return;
            }    
            head = head.next;
        }
        
        MapNode<k,v> newMap = new MapNode(key, value);
        
        //if key not equals 
        newMap.next =  bucket.get(index);
        
        bucket.set(index, newMap);
        
        size++;    
    }
    
    //remove
    public void remove(k key){
        int hashCode = getHashCode(key);
        int index = compress(hashCode);
        
        MapNode<k, v> head = bucket.get(index);
        
        if(head.key.equals(key)){
            bucket.set(index, head.next);
            size--;
            return;
        }
        
        while(head != null){
            if(head.next.key.equals(key)){
                head.next = head.next.next;
                size--;
                return;
            }
            
            head = head.next;
        }
    }
    
    //get
    public v get(k key) throws Exception {
        int hashCode = getHashCode(key);
        int index = compress(hashCode);
        
        MapNode<k, v> head = bucket.get(index);
        
        while(head != null){
            if(head.key.equals(key))
                return head.value;
            
            head = head.next;    
        }
        
        //if(head == null)
            throw new Exception();
    }
    
    //size
    public int size(){
        return size;
    }
    
    //containsKey
    public boolean containsKey(k key){
        int hashCode = getHashCode(key);
        int index = compress(hashCode);
        
        MapNode<k, v> head = bucket.get(index);
        
        while(head != null){
            if(head.key.equals(key))
                return true;
            
            head = head.next;    
        }
        
        return false;
    }
    
    public String toString(){
        String res = "";
        
        for(int i = 0; i < bucket.size(); i++){
            if(bucket.get(i) != null){
                MapNode<k, v> head = bucket.get(i);
                while(head != null){
                    res += "[" + head.key + " -> " + head.value + "]";
                    
                    head = head.next;
                }
            }
        }
        return res;
    }
    
    public int getHashCode(k key){
        return Math.abs(key.hashCode());
    }
    
    public int compress(int hashCode){
        return hashCode % bucket.size();
    }
    
	public static void main (String[] args) throws Exception {
	    HashMap<Integer, Integer> hm = new HashMap<>();
	    hm.put(1, 2);
	    hm.put(2, 3);
	    hm.put(3, 4);
	    hm.remove(2);
		System.out.println(hm);
		hm.remove(1);
		System.out.println(hm);
		System.out.println(hm.get(3));
		hm.put(2, 6);
		System.out.println(hm.containsKey(2));
		hm.put(3, 5);
	    System.out.println(hm);
	}
}

Output:
[1 -> 2][3 -> 4]
[3 -> 4]
4
true
[2 -> 6][3 -> 5]
