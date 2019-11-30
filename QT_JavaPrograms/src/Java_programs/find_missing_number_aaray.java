package Java_programs;

public class find_missing_number_aaray {

	public static void main(String[] args) {
		int[] a={1,2,3,4,5,6,7,8,10};
		
		System.out.println(getmissednum(a));
	}

	static int getmissednum(int[] a)
	{
		
		
		int n=a.length;
		
		System.out.println("ghfh   "+n);

		for(int i=0;i<n;i++)
		{
			if(a[i]!=(i+1))
			{
				return (i+1);
				}
		}
		return n;
		
		
	}
	
}
