package otherProgram;

public class RangeOfArmstrongNum {

	public static void main(String[] args) 
	{
		long rem,arm=0,num;
		for (long i=0;i<=10000;i++ )
		{
			num=i;
			while(num>0) 
			{
				rem=num%10;
				arm=arm+(rem*rem*rem);
				num/=10;
				
			}
			if(arm==i) 
			{
				System.out.print(i+" ");
			}
			arm=0;
		}

	}

}
