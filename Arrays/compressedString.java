


import java.io.*;

class MyCode {
  
  
  public static void main (String[] args) {
    String str="aaabbcdeeeef";
    int count=1, i=0;
    for(i=0;i<str.length()-1;i++){
      if(str.charAt(i)!=str.charAt(i+1)){
        System.out.print(""+str.charAt(i)+count);
        count=1;
      }else
        count++;
    }
    System.out.print(""+str.charAt(i)+count);
    
}
}

output:
a3b2c1d1e4f1
