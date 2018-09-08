

Input : 
4
cd Madhu
cd Movies
cd ..
cd Project

Output:
/Madhu/Project

3
cd ..
cd ..
cd ..
  
output
/

Madhu Project

class Test {
  
	public static void main(String[] args) {
  	Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Sk st = new Stack();
    for(int i=0;i<n;i++){
      sc.next();
    	String temp=sc.next();
      if(temp.equals("..") && st.isEmpty()==false)
      	st.pop();
       else 
        st.push(temp);
    }
    String res = "";
    while(!st.isEmpty()){
       	res = "/" + st.pop() + res;
    } 
    System.out.println(res);
  }
}
