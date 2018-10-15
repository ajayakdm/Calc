package prog;

public class Swap2NumWithoutThirdVar {

	public static void main(String[] args) 
	{
		
		System.out.println("Before Swap ");
	int x=25;
	int y=15;
	System.out.println("x is "+x);
	System.out.println("y is "+y);
    x=x+y;
    y=x-y;
    x=x-y;
    System.out.println("After swap ");
    System.out.println("x is "+x);
	System.out.println("y is "+y);
	
	
	}

}
