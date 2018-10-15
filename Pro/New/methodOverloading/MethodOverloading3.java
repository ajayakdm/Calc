package methodOverloading;

public class MethodOverloading3 {

	public void m1(float a)
	{
		System.out.println("int--method");
	}
	
	public void m1(int... a)
	{
		System.out.println("int.....--method");
	}
	public static void main(String[] args) 
	{
		MethodOverloading3 mo=new MethodOverloading3();
	    
	    mo.m1();
	    mo.m1(10);
	    mo.m1();
	   

	}

}
