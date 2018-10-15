package static_And_InstanceBlock;
public class Initializzation {
	private static String m1(String msg)
	{
		System.out.println(msg);
		return msg;
	}
	public  Initializzation()
	{
		m=m1("3");
	}
	{
		m=m1("2");
	}
	static String m=m1("1");
	public static void main(String[] args) 
	{
		Object o=new  Initializzation();
	
	}

}
