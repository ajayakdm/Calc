package TypeCasting;

public class Parent 
{
	 int i=10;
	    {
	    	m1();
	    	System.out.println("Parent first instance block");
	    }
	    Parent()
	    {
	    	System.out.println("Parent constructor executing");
	    }
	    
	    
		public static void main(String[] args) 
		{
			Parent i=new Parent();
			
			System.out.println("main");
		}
		public void m1()
		{
			System.out.println(j);
		}
		{
			System.out.println("Parent second instance block");
		}
		int j=20;
}

class Child extends Parent
{
	int i=15;
    {
    	m1();
    	System.out.println("Child first instance block");
    }
    Child()
    {
    	System.out.println("Child constructor executing");
    }
    
    
	public static void main(String[] args) 
	{
		//Child i=new Child();
		Parent p=new Child();
		
		System.out.println("main");
	}
	public void m1()
	{
		System.out.println(j);
	}
	{
		System.out.println("Child second instance block");
	}
	int j=40;	
}
