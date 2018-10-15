package prog;

import java.util.Scanner;

public class NumberPalindrome {

	public static void main(String[] args)
	{
		
		Scanner scr=new Scanner(System.in);
		int num=scr.nextInt();
	int reminder,rev=0,original;
	original=num;
	while(num>0) 
	{
	reminder=num%10;
	rev=(rev*10)+reminder;
	num=num/10;
	}
	
	if(original==rev)
	{
		System.out.println("given number is a palindrome");
	}
	else
	{
		System.out.println("Given number is not palindrome");
	}
	}

    }
