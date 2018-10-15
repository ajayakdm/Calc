package prog;

public class SwapString {

	public static void main(String[] args) 
	{
	
		String a="abc";
		String b="def";
		a+=b;
		int c=a.length();
		b=a.substring(0,a.length()-b.length());	
		a=a.substring(b.length(),a.length());
		
		System.out.println("b is "+b);
		System.out.println("a is "+a);

	}

}
