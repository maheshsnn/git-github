package Buffer_printWriter_Programs;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Pr2 {

	public static void main(String[] args) throws IOException 
		{
			PrintWriter pw=new PrintWriter("G:\\mahesh.txt");
			
			BufferedReader br1=new BufferedReader(new FileReader("G:\\input.txt"));
			String line=br1.readLine();
			BufferedReader br2=new BufferedReader(new FileReader("G:\\Delete.txt"));
			String line2=br2.readLine();
			
			while(line!=null||line2!=null)
			{
				if(line!=null)
				pw.println(line);
				line=br1.readLine();
			
			
				if(line2!=null)
				pw.println(line2);
				line2=br2.readLine();
			
			}
			
			pw.flush();
			pw.close();
			
		}
		

	}
