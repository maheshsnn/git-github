package Abstractclass;

public abstract class Abstract_class {
	
	//Constructors can be declared in Abstract classes

	//abstract method
	abstract public void m1();
	
	abstract public void m3();
	
	//concrete method 
	public void m2()
	{
		System.out.println("concrete method");
	}
	
	
}

abstract class chid extends Abstract_class
{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}
	

}
