package numberPattern;

public class NumberPattern3 {

	public static void main(String[] args) 
	{
	for (int i=1;i<=5;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(i);
		}
		System.out.println();
	}
    for(int i=4;i>=1;i--)
    {
	for (int j=1;j<=i;j++)
	{
		System.out.print(i);
	}
	System.out.println();
	}
	}
    /*output
	1
	22
	333
	4444
	55555
	4444
	333
	22
	1
*/

}
