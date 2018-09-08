
 public static Node LCA(Node root, int d1, int d2) {
 
      if(root == null) {
     
    	return null;
       
}
       
 
      if(root.data == d1 || root.data == d2) {
      
  	 return root;

       }
       
   
    Node leftAns = LCA(root.left, d1, d2);
  
     Node rightAns = LCA(root.right, d1, d2);
     
  
       if(leftAns && rightAns) {
 
        return root;
  
     }
   
    return leftAns ? rightAns : leftAns;

       
  }   
