package otherProgram;

import java.util.Scanner;

public class AngleOfClockHands {

	public static void main(String[] args) 
	{
	Scanner scr=new Scanner(System.in);
	System.out.println("Enter the minute number");
	int minute=scr.nextInt();
	System.out.println("Enter the hour number");
	int hour=scr.nextInt();
	double formula=((11.00/2)*minute)-30*hour;
	double angle=Math.abs(formula);
	System.out.println("first angle is "+angle+" degree");
	System.out.println("Second angle is "+(360-angle)+" degree");
	
	
	
	
	}

}
