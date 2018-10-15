package genaral;

import java.util.Scanner;

public class Sww {

	public static void main(String[] args) 
	{
		int originalPin=1234;
		
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter pin");
		int pin=scr.nextInt();
		double balance=12345.76;
		if(pin==originalPin) {
		System.out.println("Select any one of the following");
		System.out.println("1.Balance");
		System.out.println("2.Withdraw");
		int n=scr.nextInt();
		if(n==1)
		{
			
			System.out.println("your balance is "+balance);
		}
			
		else if(n==2)
		{
			
			System.out.println("Enter amount");
			int am=scr.nextInt();
			if(am<balance) {
			System.out.println("collect the cash your remaining balance is");
			System.out.println(         balance-am);
			}
			else 
			{
				System.out.println("invalid amount");
			}
		}
		else
		{
			System.out.println("Wrong option selected");
		}

}
		else{
			System.out.println("entered pin was wrong");
		}
		}}
