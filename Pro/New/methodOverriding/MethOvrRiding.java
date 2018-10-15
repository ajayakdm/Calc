package methodOverriding;

/*   in overriding method resolution always 
	takes care by JVM based on runtime object
	and hence overriding is also consider as 
	run time polymorphism or dynamic polymorpism 
	or late binding*/
class P
	{
	public Object m1()
	{
		System.out.println("parents Property");
		return null;
	}
	}
class C extends P  
	{
	public String m1()
	{
		System.out.println("Only Child Property");
		return null;
	}
	
	}
public class MethOvrRiding {
	
 
	
	public static void main(String[] args) 
	{
	P p=new P();
	p.m1();
	C c=new C();
	c.m1();
	P p1;
	p1=new C();
    p1.m1();
	

	}

}
