package constructor;

public class SingleTonDesignPattern_01  {

	public static void main(String[] args) 
	{
	Test t1=Test.getTest();
	Test t2=Test.getTest();

	}

}
 class Test
 {
	 private static Test  t=new Test();
	 private Test()
	 {
		 System.out.println("Singleton class approach 1");
	 }
	public static Test getTest()
	{
		return t;
	}
	
 }
