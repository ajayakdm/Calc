package otherProgram;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) 
	{
		Scanner scr=new Scanner(System.in);
		int num=scr.nextInt();
	int decimal=0,p=0;
	int number=num;
	while(num>0)
	{
		decimal+=((num%10)*Math.pow(2, p));
		num/=10;
		p++;
		
	}
	System.out.println("Decimal equivalent of binary number "+number+" is "+decimal);
    
	}

}
