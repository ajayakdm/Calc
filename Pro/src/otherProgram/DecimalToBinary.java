
package otherProgram;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) 
	{
		Scanner scr=new Scanner(System.in);
		 int num = scr.nextInt();
		 int number=num;
		 int binary[] = new int[7];
	     int index = 0;
	     
	     while(num > 0){
	       binary[index++] = num%2;
	       
	       num = num/2;
	       
	     }
	     System.out.print("Decimal number " +number +" binary equivalent is " );
	     for(int i = index-1;i >= 0;i--)
	     {
	       System.out.print(binary[i]);
	     }

 
	     }
}
