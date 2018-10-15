package prog;

public class GivenStringPalindrome2 {

	public static void main(String[] args) 
	{
	String original="gadag";
	String rev="";
	char[] ch = original.toCharArray();
	for (int i=ch.length-1;i>=0;i--)
	{
		rev=rev+ch[i];
	}
	if(original.equals(rev))
	{
	System.out.println("Given String is palindrome");
	}
	else
	{
		System.out.println("Given String is not palindrome");
		
	}
	}

}
