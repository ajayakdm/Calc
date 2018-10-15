package otherProgram;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) 
	{
		Scanner scr=new Scanner(System.in);
		int num=scr.nextInt();
		int number=num;
		
		
		for(int i=num-1;i>0;i--)
		{
			num*=i;
			
		}
		System.out.println(number +"! is " +num);
	
	}

}
