package constructor;
public class CountNoOfobjectCreated {
	static int count=0;
	{
		count++;
	}
	CountNoOfobjectCreated()
	{
		
	}
	CountNoOfobjectCreated(int a)
	{
		
	}
	CountNoOfobjectCreated(double a)
	{
		
	}
	
	
	public static void main(String[] args) 
	{
		CountNoOfobjectCreated c=new CountNoOfobjectCreated();
		CountNoOfobjectCreated c1=new CountNoOfobjectCreated(10);
		CountNoOfobjectCreated c2=new CountNoOfobjectCreated(23.5);
		CountNoOfobjectCreated c3=new CountNoOfobjectCreated();
		System.out.println("The no of object created "+count);
		
		
	}

}
