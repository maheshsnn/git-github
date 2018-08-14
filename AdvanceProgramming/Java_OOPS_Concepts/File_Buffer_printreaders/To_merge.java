package File_Buffer_printreaders;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class To_merge {
	
	
	public static void main(String[] args) throws IOException {
		
		
		PrintWriter pw=new PrintWriter("G:\\Filewriter.txt");
		
		BufferedReader br1=new BufferedReader(new FileReader("G:\\input.txt"));
		String line1=br1.readLine();
		
		BufferedReader br2=new BufferedReader(new FileReader("G:\\Delete.txt"));
		String target=br2.readLine();
		
		
		while(line1!=null)
		{
			pw.println(line1);
		line1=br1.readLine();
		}
		while(target!=null)
		{
			pw.println(target);
			target=br2.readLine();
			
		}
		System.out.println("done"); 
		   pw.flush();
		     br1.close();
		     pw.close();
		
	}

}
