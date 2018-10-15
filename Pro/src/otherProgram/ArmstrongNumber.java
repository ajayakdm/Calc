package otherProgram;

public class ArmstrongNumber {
	public static void main(String[] args) 
	{
	int number=123,reminder,arm=0;
	int total=number;
	while(number>0)
	{
		reminder=number%10;
		arm=arm+(reminder*reminder*reminder);
		number/=10;
	}
	if(total==arm)
		System.out.println("given number is Armstrong");
	else
		System.out.println("Given number is not Armstrong");
	System.out.println(arm);
	}

}
