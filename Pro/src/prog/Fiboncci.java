package prog;

import java.util.Scanner;

public class Fiboncci {

	public static void main(String[] args) 
	{
	Scanner scr=new Scanner(System.in);
	int count = scr.nextInt();
	
	int[] feb=new int[count];
	feb[0]=0;
	feb[1]=1;
	for (int i=2;i<count;i++)
	{
		feb[i]=feb[i-1]+feb[i-2];
		
	}
	for (int i=0;i<count;i++)
	{
System.out.print(feb[i] +" ");
	}}

}
