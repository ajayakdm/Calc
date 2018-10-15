package starPattern;

public class Star5 {

	public static void main(String[] args) 
	{
		int n=5;
		int c=1;
	for(int i=n;i>=0;i--)
	{
		for(int j=0;j<=c;j++) 
		
			System.out.print(" ");
			c++;
		for(int k=0;k<=i;k++) {
		
			System.out.print("*");
		}
			
		
		System.out.println();
	}
   /*output
   *****
    ****
     ***
      **
       *
*/

	}

}
