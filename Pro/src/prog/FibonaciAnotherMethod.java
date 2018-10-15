package prog;

import java.util.Scanner;

public class FibonaciAnotherMethod {

	public static void main(String[] args) 
	{
	Scanner scr=new Scanner(System.in);
	int count=scr.nextInt();
	int num1=0; 
	int num2=1;
	int feb=0;
	System.out.print(num1 +" "+num2 +" ");
	for(int i=0;i<=count;i++)
	{
		feb=num1+num2;
		num1=num2;
		num2=feb;
		System.out.print(feb +" ");
	}

	}

}
