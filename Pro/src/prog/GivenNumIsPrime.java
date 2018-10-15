package prog;

import java.util.Scanner;

public class GivenNumIsPrime {

	public static void main(String[] args) 
	{
		int x=0;
		Scanner scr=new Scanner(System.in);
	int n = scr.nextInt();
	for ( int i=2;i<n;i++)
    {
		if(n%i==0)
		{
			x=1;
		}
		
	}
	if(x==1)
	{
		System.out.println("Given number is not prime ");
		
	}
	else 
	{
		System.out.println("Given number is prime ");
	}
	}

}
