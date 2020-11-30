package Java_Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Hashmap_Excel_Reader {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Hashmap_Excel_Reader ss=new Hashmap_Excel_Reader();
		
		System.out.println(ss.getdata().get("mahesh"));

	}
	
	public HashMap<String,String>getdata() throws Exception
	{
		
		HashMap<String,String>testdata=new HashMap<>();
		
		FileInputStream fis=new FileInputStream("G:\\writeexcel.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet s=wb.getSheetAt(0);
		
		
		Iterator<Row>itr=s.iterator();
		
		while(itr.hasNext())
		{
			Row row=itr.next();
			
			Iterator<Cell>cellitr=row.iterator();
			
			while(cellitr.hasNext())
			{
			Cell cells=cellitr.next();
			cells.setCellType(CellType.STRING);
			testdata.put(cells.getStringCellValue(), cellitr.next().getStringCellValue());
			
		}
		
		
		
	}

		return testdata;
}
}