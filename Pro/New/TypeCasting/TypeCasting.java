package TypeCasting;

public class TypeCasting {

	public static void main(String[] args) 
	{
	B a=new B();
	A b=new B();
	A c=(B)b;
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	

	}

}

class A
{
	
}

class B extends A
{
	
}
