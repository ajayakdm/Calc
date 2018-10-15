
package prog;

import java.util.Scanner;

public class RangeOfPrimeNum {

	public static void main(String[] args) 
	{
		Scanner scr=new Scanner(System.in);
		int num=scr.nextInt();
		for (int i=2;i<=num;i++){
		for (int j=2;j<=i;j++) {
	if(j==i)
	{
		System.out.print(i +" ");
	}
	if(i%j==0)
	{
		break;
	}
	}
	}
	
			

	}

}
