package constructor;

public class SingleTonDesignPattern_02 {

	public static void main(String[] args) {
		Test1 t=Test1.getTest1();

	}

}
class Test1
{
private static Test1 t=null;
private Test1()
{
	System.out.println("Singleton class approach 2");
}
public static Test1 getTest1()
	{
	if(t==null) 
	{
	t=new Test1();
	}
	return t;
	}

}
