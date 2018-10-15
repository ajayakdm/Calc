package static_And_InstanceBlock;

public class StaticControlFlow {
    
	static int i=10;
	static 
	{	
	m1();
	System.out.println("first static method");
	}
	
	//public static void main(String[] args) 
	{
	m1();
	System.out.println("main method");
	}
	public static void m1()
	{
		System.out.println(j);
	}
	static
	{
		System.out.println("second static method");
	}
	static int j=20;
	

}
