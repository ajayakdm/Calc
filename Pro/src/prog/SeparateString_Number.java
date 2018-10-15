package prog;

public class SeparateString_Number {

	public static void main(String[] args) 
	{
		String number="";
		String alp="";
	String str="abcd1234ef56gh789ij";
	for(int i=0;i<=str.length()-1;i++)
	{
		char ch=str.charAt(i);
		if(Character.isDigit(ch))
		{
			number=number+ch;
		}
		else 
		{
			alp=alp+ch;
			
		}
		
	}
	System.out.println(alp);
	System.out.println(number);
}}
