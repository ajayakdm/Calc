package starPattern;

public class star4 {

	public static void main(String[] args) 
	{
		int n=5;
		int c=n-1;
	for(int i=0;i<=n;i++)
	{
		for (int j=0;j<=c;j++)
		
			System.out.print(" ");
			c--;
		for(int k=0;k<=i;k++) {
			System.out.print("*");
		}
		System.out.println();
		
		/*output
		 
	      *
	     **
	    ***
	   ****
	  *****
	 ******
	 
	 */

		
		
	}

	}

}
