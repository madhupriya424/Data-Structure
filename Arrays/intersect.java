class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        HashMap<Integer,Integer> hm = new HashMap<>();
        ArrayList<Integer> list=new ArrayList<>(); 
        
       
        
        for(int i=0;i<nums1.length;i++)
        {
            int key=nums1[i];
            if(hm.containsKey(key))
                hm.put(key, hm.get(key) + 1);
            else
                hm.put(key, 1);
        }
        
         for(int i=0;i<nums2.length;i++)
         {
             int key = nums2[i];
            if(hm.containsKey(key))
             {
                int value = hm.get(key);
                value--;
                 hm.put(key, value);
                 list.add(key);
                if(value==0)
                    hm.remove(key);   
             }
                 
         }
                   
        
        
        int res[] = new int[list.size()];
        int k=0;
    
        for(int i: list)
            res[k++] = i;
        
        return res;
    }
}

#  Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2, 2].

