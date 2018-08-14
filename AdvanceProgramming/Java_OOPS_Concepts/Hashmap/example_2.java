package Hashmap;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class example_2 {
	public static void main(String[] args) throws IOException {
		
		
		example_2 ss=new example_2();
		System.out.println(ss.getdata().get("mahesh"));
	}
	
	
	public Map<String,String>getdata() throws IOException
	{
		
		HashMap<String,String>hsm=new HashMap<>();
		
			
		FileInputStream fis=new FileInputStream("G:\\rrrr.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet s=wb.getSheetAt(0);
		
		
		Iterator<Row>itr=s.iterator();
		
		while(itr.hasNext())
		{
			
			Row row=itr.next();
			
			
			Iterator<Cell>cell=row.iterator();
			
			while(cell.hasNext())
			{
				Cell cells=cell.next();
				
				
				cells.setCellType(CellType.STRING);
				
				hsm.put(cells.getStringCellValue(),cell.next().getStringCellValue());
				//System.out.println(cells.getStringCellValue(),cell);
			}
		}
		return hsm;
		
	}

}
