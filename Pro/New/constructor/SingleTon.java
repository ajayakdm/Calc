package constructor;

public class SingleTon {

	private SingleTon()
	{
		
	}
	public static SingleTon getTSingleTon() 
	{
	return t;	
	}
	
		 private static SingleTon t=new SingleTon();	
	
	public static void main(String[] args)
	{}
	
	

}
