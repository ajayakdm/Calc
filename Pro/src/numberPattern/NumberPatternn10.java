package numberPattern;

public class NumberPatternn10 {

	public static void main(String[] args) 
	{int n=1;
		for (int i=1;i<=5;i++)
		    {
			for(int j=1;j<5-i;j++)
			{
				System.out.print(" ");
			}
			for (int k=1;k<=i;k++) 
			{
				System.out.print(n+" ");
				n++;
		    }
			System.out.println();

	}
		/*output
		    1 
		   2 3 
		  4 5 6 
		 7 8 9 10 
		11 12 13 14 15 
*/
}}
