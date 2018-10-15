package methodOverloading;

public class MethodOverloading1 {

	/* In overloading compiler is 
	always responce to perform 
	method resolution based on 
	refrence type by the compiler only*/

	public void m1(int a)
	{
		System.out.println("int version");
	}
	public void m1(float a)
	{
		System.out.println("float version");
	}
	public void m1(String a)
	{
		System.out.println("String version");
	}
	public void m1(StringBuffer a)
	{
		System.out.println("StringBuffer version");
	}
	public void m1(Object a)
	{
		System.out.println("Object version");
	}
	
	
	
	public static void main(String[] args) 
	{
		MethodOverloading1 mo=new MethodOverloading1();
		mo.m1(10f);
		mo.m1(12);
		mo.m1('d');
		mo.m1("ajay");
		mo.m1(new StringBuffer("uday"));
		//mo.m1(null);--------------------ambiguous problem
		mo.m1(new Object());

	}

}
