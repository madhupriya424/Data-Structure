
public static boolean print(Node root, int d1) {
    
	if(root == null) {
     
 	  return false;
    
}
    
   
 if(root.data == d1) {
     
 return true;
 
   }
    
  
  if(print(root.left, d1) || print(root.left, d1)){
  
    System.out.print(root.data + " ");
      
	return true;
 
   }         
    
          
//     if(leftans) {
// 
      System.out.print(root.data + " ");

//       return true;
//  
   }
    

//     boolean rightAns = print(root.right, d1);
//     if(rightAns) {
//       System.out.print(root.data + " ");
//       return true;
//     }
    
    return false;
  }
