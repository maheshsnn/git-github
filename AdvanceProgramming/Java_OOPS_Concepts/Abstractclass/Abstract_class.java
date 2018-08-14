package Abstractclass;

public abstract class Abstract_class {
	
	//Constructors can be declared in Abstract classes

	//abstract method
	abstract public void m1();
	
	//concrete method 
	public void m2()
	{
		System.out.println("concrete method");
	}
	
	
}

class chid extends Abstract_class
{
	
public void m1()
{
	System.out.println("abstract method overriding");
	
}
}
