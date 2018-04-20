public class Permutation
{
	public static void main(String[] args)
	{
		String str = "ABC";
	    permutation(str);
	}




public static void permutation(String str){
	permutation(str, "");
}

public static void permutation(String str, String res){
		if(str.length()==0){
    	 System.out.print(res+" ");
       return;
     }  
       
    for(int i=0;i<str.length();i++)   
    {
    		permutation(str.substring(0,i) + str.substring(i+1), res+str.charAt(i));
    } 
}}

#  ABC ACB BAC BCA CAB CBA 
