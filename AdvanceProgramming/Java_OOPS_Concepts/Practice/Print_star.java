package Practice;

public class Print_star {

	public static void main(String[] args) {
		
	int k=1;

		for (int i = 0; i < 3; i++) {
			
			for(int j=0;j<k;j++){
			
			System.out.print("*");
			
			}	
			k=k+2;
			System.out.println();
		
		}
		
		
      for (int i = 0; i <=3; i++) {
			
			for(int j=0;j<=i;j++){
			
			System.out.print("*");
			
			}	
			//k=k+2;
			System.out.println();
		
		}
		
	}

}
