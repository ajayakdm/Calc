package genaral;

import java.util.Scanner;

class Acount
{   int count=1;
	private double balance=123456.89;
	private int pin=1234;
	
	public double get_Balance()
	{
		
			return balance;
		
	}
	public void validation(int pin)
	{
		if(this.pin==pin)
		{
			System.out.println("balance amount is "+balance);
		}
		else if(count<3)
		{
			System.out.println("Entered pin was wrong try again");
			count++;
		}
		else
		{
			System.out.println("Entered pin was wrong your atm pin blocked");
		}
	}
	
}
public class Encapsulation {
	
	public static void main(String[] args) 
	{
		
		Acount a=new Acount();
		System.out.println("Enter your pin");
        Scanner scr=new Scanner(System.in);
        for (int i=0;i<=2;i++) {
        	int pin=scr.nextInt();
            a.validation(pin);
        }
       
        
      //  a.validation(pin);
        
	}

}
