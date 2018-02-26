/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class MapNode<k, v> {
    int key;
    int value;
    MapNode<k,v> next;
    
    MapNode(int key, int value){
        this.key = key;
        this.value = value;
    }
}

class Map<Key, Value>{
    
    ArrayList<MapNode<k,v>> bucket;
    int size;
    Map(){
        bucket = new ArrayList<>();
        size=0;
        for(int i=0;i<10;i++)
          bucket.add(null);
}
   
   public void put(int key, int value){
       int hashCode = getHashCode(key);
       int compressed = compress(hashCode);
       
       MapNode<k ,v> head = bucket.get(compressed);
       
       while(head!=null)
       {
           if(head.key.equals(key))
           {
               head.key = key;
           }
           head=head.next;
       }
       
       MapNode<key, value> newNode = new MapNode<>();
       newNode.next = head;
       bucket.set(compressed, newNode);
       size++;
       
   }
   
   public V get(key k){
       int hashCode = getHashCode(k);
       int compressed = comress(hashCode);
       
       MapNode<key, value> head = bucket.get(compressed);
       while(head!=null){
           if(head.key.equals(key))
              return head.value;
          head=head.next;
       }
       throw new ElementNotFoundException();
   }

    public int getHashCode(k key){
        return key.hashcode();
    }
    
     public int compressed(int hashcode){
        return hashcode%bucket.size();
    }
    
    
	public static void main (String[] args) {
	    HashMap<String ,Integer> hm = new HashMap<>();
	    hm.put("Gauri", 1);
	    hm.put("Madhu", 2);
	    hm.put("pooja", 3);
	    hm.put("Arpit", 4);
	    
		System.out.println(hm.get("Gauri"));
	}
}
