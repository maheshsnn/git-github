package enumss;





public class enum_class {

	enum beer
	{
		kf,ko,bd;
	}
	
	public static void main(String[] args) {
		
		
		beer b=beer.bd;
		System.out.println("test  "+b);//to print single value from enums

	
		beer[] j=beer.values();
		
		for(beer y:j)
		{
			System.out.println(y);
		}
	}
}
