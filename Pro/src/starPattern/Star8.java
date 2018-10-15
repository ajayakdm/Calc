package starPattern;

public class Star8 {

	public static void main(String[] args) 
	{
	int n=5;
	int c=n-1;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=c;j++)
			System.out.print(" ");
		c--;
		for(int k=1;k<=2*i-1;k++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	c=1;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=c;j++)
		System.out.print(" ");
		c++;
		for(int k=1;k<=2*(n-i)-1;k++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
    /*output
	*
   ***
  *****
 *******
*********
 *******
  *****
   ***
    * */
     


	}

}
