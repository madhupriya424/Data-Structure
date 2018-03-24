class WordSearch {
  
  
  
	public static boolean searchWord(char[][] board, String word){
    
    boolean [][] visited = new boolean[board.length][board[0].length];
    
    for(int i=0;i<board.length;i++)
    {
    	for(int j=0;j<board[i].length;j++)
        {
        if(search(board, i, j, word, visited))
          return true;
        }
    }
    return false;
  }
  
  public static boolean isSafe(int i, int j, char board[][]){
      return i>=0 && i<board.length && j>=0 && j<board[0].length;
  }
  
  
  
  public static boolean search(char[][] board, int i, int j, String word, boolean[][] visited)
  {
    
     if(!isSafe(i, j, board))
      return false;
      
      
    if(visited[i][j])
      return false;
    
    if(word.length() == 0){
            return true;
      }
    
   
    
    if(board[i][j] != word.charAt(0)){
      return false;
    }
    else{
      // right recursion
      		visited[i][j]=true;
      		boolean right = search(board, i, j+1,  word.substring(1), visited);
          if(right)
            return true;
      // left recursion
      		boolean left =	search(board, i, j-1,  word.substring(1), visited);
          if(left)
           return true;
      // up recursion
      		boolean up =	search(board, i-1, j,  word.substring(1), visited);
         if(up)
           return true;
      //down recursion
      		boolean down =	search(board, i+1, j,  word.substring(1), visited);
          if(down)
            return true;
      
          visited[i][j] = false;
          return false;
    }
  }
  
  
  public static void main(String[] args){
    char board[][] = {{'P','Q','B','C','P'},
                      {'A','G','O','O','G'},
                      {'A','D','E','G','T'},
                      {'U','R','A','L','M'},
                      {'W','X','V','E','N'},
                      {'P','Q','Z','O','Q'}};
    
    System.out.println(searchWord(board, "GOOGLE"));
    
  }
}
# true
