package methodOverloading;

public class MethodOverloading2 {
	
	public void m1(int a,float b)
	{
		System.out.println("int--float version");
	}
	public void m1(float a,int b)
	{
		System.out.println("float--int version");
	}

	public static void main(String[] args) 
	{
		MethodOverloading2 mo2=new MethodOverloading2();
		mo2.m1(10, 10.5f);
		mo2.m1(10.5f,20);
 //mo2.m1(10,12);---The method m1(int, float) is ambiguous for the type MethodOverloading2
		
		/*mo2.m1(10.5f,12.5f);
		 
		The method m1(float, int) in 
		the type MethodOverloading2 
		is not applicable for 
		the arguments (float, float)*/
	}

}
