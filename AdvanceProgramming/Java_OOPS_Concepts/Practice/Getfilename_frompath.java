package Practice;

public class Getfilename_frompath {
	
	
	public static void main(String[] args) {
		
		
		String s="G:\\Batchfiles\\Links.bat";
		
		String ss[]=s.split("\\.");
		System.out.println(ss[0]);
		
		int r=ss[0].lastIndexOf("\\");
		System.out.println(r);
		
		System.out.println(ss[0].substring(r+1, ss[0].length()));
		
		
	}

}
