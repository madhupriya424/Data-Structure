/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class MapNode<k, v> {
    k key;
    v value;
    MapNode<k,v> next;
    
    MapNode(k key, v value){
        this.key = key;
        this.value = value;
    }
}

class HashMap<k, v>{             
    
    ArrayList<MapNode<k,v>> bucket;
    int size;
    
    HashMap(){
        bucket = new ArrayList<>();
        size=0;
        for(int i=0;i<10;i++)
          bucket.add(null);
}
   
   public void put(k key, v value){
       int hashCode = getHashCode(key);
       int compressedIndex = compress(hashCode);
       
       MapNode<k ,v> head = bucket.get(compressedIndex);
       
       while(head!=null)
       {
           if(head.key.equals(key))
           {
               head.value = value;
           }
           head=head.next;
       }
       
       head = bucket.get(compressedIndex);
       
       MapNode<k, v> newNode = new MapNode<>(key, value);
       newNode.next = head;
       bucket.set(compressedIndex, newNode);
       size++;
       
       if(size*(1.0) / bucket.size() > .7)
          rehash();
   }
   
   public v get(k key) throws ElementNotFoundException {
       int hashCode = getHashCode(key);
       int compressedIndex = compress(hashCode);
       
       MapNode<k, v> head = bucket.get(compressedIndex);
       
       while(head!=null){
           if(head.key.equals(key))
              return head.value;
          head=head.next;
       }
       throw new ElementNotFoundException();
   }

    public int getHashCode(k key){
        return key.hashCode();
    }
    
     public int compress(int hashcode){
        return hashcode%bucket.size();
    }
    
    public void remove(k key){
        
        int hashCode = getHashCode(key);
        int compressedIndex = compress(hashCode);
        
        MapNode<k, v> head = bucket.get(compressedIndex);
        
         if(head.key.equals(key)){
              bucket.set(compressedIndex, head.next);   
              head.next=null;
              size--;
              return;
            }
        
        while(head.next!=null)
        {
             if(head.next.key.equals(key))
             {
                size--;
                head.next=head.next.next;
                return;    
            }
            head=head.next;
        }   
       
        throw new ElementNotFoundException();
    }
    
    public void rehash(){
        ArrayList<MapNode<k, v>> temp = bucket;
        bucket = new ArrayList<>();                   
        
        int newSize = temp.size()*2;
        
        for(int i=0;i<newSize;i++)
           bucket.add(null);
        
        for(MapNode<k, v> currNode: temp)
        {
            while(currNode!=null)
            {
                put(currNode.key, currNode.value);
                currNode=currNode.next;
            }
        }
    }
    
    public ArrayList<k> getKeys(){
        ArrayList<k> keys = new ArrayList<>();
        for(MapNode<k,v> currNode: bucket)
        {
            while(currNode!=null)
            {
                keys.add(currNode.key);
                currNode = currNode.next;
            }
        }
        return keys;
    }
    
    public boolean isEmpty(){
        return size==0;
    }
    
    public int size(){
        return size;
    }
    
    public class ElementNotFoundException extends Exception{
        
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
