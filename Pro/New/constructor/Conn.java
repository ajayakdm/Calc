package constructor;

public class Conn {

	static void con2()
	{
		con1();
	}
	static void con1()
	{
		con2();
		
	}
	
	public static void main(String[] args) 
	{
	Conn c=new Conn();
	System.out.println("hh");
	
	}

}
