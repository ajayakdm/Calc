package otherProgram;

public class Done {

	public static void main(String[] args) 
	{
		int count=1;
		int count1=0;
	boolean element=false;
	
	while(!element)
	{
		if(count==3)
		{
			System.out.println("element desplayed at" +count);
			element=true;
		}
		else 
		{
			System.out.println("element not visibled for " + ++count1 +" times");
		}
		count++;
	}

	}

}
