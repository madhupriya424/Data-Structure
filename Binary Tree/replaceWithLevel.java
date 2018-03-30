

//    5                 1
//  6    9            2   2
// 1    8  0        3    3  3
     
//      replace each node by its level


     
 public Node replaceWithLevel(Node root){
       return replaceWithLevel(root, 1);
 }
 
 public static Node replaceWithLevel(Node root, int level){
        if(root==null)
          	return root;
   
          Node left = replaceWithLevel(root.left, level+1);
          Node right = replaceWithLevel(root.right, level+1);
          
         root.data = level;
         return root; 
 } 
