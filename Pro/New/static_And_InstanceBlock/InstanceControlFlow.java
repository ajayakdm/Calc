package static_And_InstanceBlock;

public class InstanceControlFlow {
    int i=10;
    {
    	m1();
    	System.out.println("first instance block");
    }
    InstanceControlFlow()
    {
    	System.out.println("constructor executing");
    }
    
    
	public static void main(String[] args) 
	{
		InstanceControlFlow i=new InstanceControlFlow();
		
		System.out.println("main");
	}
	public void m1()
	{
		System.out.println(j);
	}
	{
		System.out.println("ssecond instance block");
	}
	int j=20;
}
