package prog;

public class Test {

	public static void main(String[] args) 
	{
   String sentence="hi my name is java";
   String[] str=sentence.split(" ");
   for(int i=0;i<str.length;i++) 
   {
	   String word=str[i];
	   for(int j=word.length()-1;j>=0;j--) 
	   {
		   System.out.print(word.charAt(j));
	   }
	   System.out.print(" ");
   }
    
    }
}
