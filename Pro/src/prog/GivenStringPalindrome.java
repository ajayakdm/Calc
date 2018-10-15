package prog;

public class GivenStringPalindrome {

	public static void main(String[] args)
	{
		String rev="";
	String str="madam";
    for(int i=str.length()-1;i>=0;i--)
    {
    	rev=rev+str.charAt(i);
    	
    }
   if(str.equals(rev))
   {
	   System.out.println("given string is palindrome");
   }
   else
   {
	   System.out.println("Given string is not palindrome");
   }
	}

}
