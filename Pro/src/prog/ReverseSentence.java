package prog;

public class ReverseSentence {

	public static void main(String[] args) 
	{
		/*String s = "my name is Ajay Kadam";
		String[] words = s.split(" ");
		for (int i=0;i<words.length;i++)
		{
			String nn=words[i];
			for(int j=nn.length()-1;j>=0;j--) 
			{
			System.out.print(nn.charAt(j));	
			}
			System.out.print(" ");
		
		}*/
		
		
			String str="Hi java hello java";
			String[] str2=str.split(" ");
			for(int i=0;i<str2.length;i++)
			{
			
			String str1=str2[i];	
			for(int j=str1.length()-1;j>=0;j--)
			{
				System.out.print(str1.charAt(j));
			}
			System.out.print(" ");
		}

	}}


