package methodOverloading;

public class MethodOverloading4 {
	public void m1(Animal a)
	{
		System.out.println("Animal--version");
	}
	public void m1(Dog a)
	{
		System.out.println("Dog--version");
	}
	public static void main(String[] args)
	{
		MethodOverloading4 mo=new MethodOverloading4();
		Animal a=new Animal();
		mo.m1(a);
		Dog d=new Dog();
		mo.m1(d);
		Animal a1=new Dog();
	    mo.m1(a1);
		
   
	}

}
   class Animal
   {}
   class Dog extends Animal
   {}
