package static_And_InstanceBlock;
public class Static_And_Instance_ControlFlow {
	{
		System.out.println("First instance block");
	}
	static{
		System.out.println("First static block");
	}
	Static_And_Instance_ControlFlow()
	{
		System.out.println("constructor");
	}
	
	public static void main(String[] args) 
	{
		//Static_And_Instance_ControlFlow si=new Static_And_Instance_ControlFlow();
		System.out.println("main");
		Static_And_Instance_ControlFlow si2=new Static_And_Instance_ControlFlow();


	}
	{
		System.out.println("second instance block");
	}
	static{
		System.out.println("Second static block");
	} 
}

