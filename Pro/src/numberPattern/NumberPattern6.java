package numberPattern;

public class NumberPattern6 
{public static void main(String[]rgs) {
	for (int i=5;i>=1;i--)
	{
		for (int j=5;j>=i;j--)
		{
			System.out.print(j);
		}
		System.out.println();
	}
	}
/*output
5
54
543
5432
54321
*/}
