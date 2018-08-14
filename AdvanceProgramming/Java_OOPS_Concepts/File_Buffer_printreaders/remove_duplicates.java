package File_Buffer_printreaders;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class remove_duplicates {
	
	
	public static void main(String[] args) throws IOException {
		
		
		
		PrintWriter pw=new PrintWriter("G:\\input.txt");
	
	BufferedReader br=new BufferedReader(new FileReader("G:\\Delete.txt"));
	String line=br.readLine();
	
	boolean available;
	
	while(line!=null)
	{
		available= false;
		
		BufferedReader bw=new BufferedReader(new FileReader("G:\\input.txt"));
		String target=bw.readLine();
		
		while(target!=null)
		{
			if(line.equals(target))
			{
				available=true;
				break;
			}
			target=bw.readLine();
			
		}
		if(available=false)
		{
			pw.print(target);
			
		}
		line=br.readLine();
		System.out.println("done");
		
		   pw.flush();
		     br.close();
		     pw.close();
	}
	
}
}