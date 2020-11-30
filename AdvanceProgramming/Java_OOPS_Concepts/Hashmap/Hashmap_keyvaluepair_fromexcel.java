package Hashmap;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Hashmap_keyvaluepair_fromexcel {

	public static void main(String[] args) throws IOException {
		
	//	Hashmap_keyvaluepair_fromexcel  ss = new Hashmap_keyvaluepair_fromexcel();

		System.out.println(Hashmap_keyvaluepair_fromexcel.getdata().get("mahesh"));
	}

	public static HashMap<String, String> getdata() throws IOException {

		HashMap<String, String> testdatafromexcel = new HashMap<>();

		FileInputStream fis = new FileInputStream("G:\\writeexcel.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet s = wb.getSheetAt(0);

		Iterator<Row> itr = s.iterator();

		while (itr.hasNext()) {
			Row row = itr.next();

			Iterator<Cell> cell = row.iterator();

			while (cell.hasNext()) {
				
				Cell cellitr = cell.next();

				cellitr.setCellType(CellType.STRING);

				testdatafromexcel.put(cellitr.getStringCellValue(), cell.next().getStringCellValue());

			}

		}

		//fis.close();
		return testdatafromexcel;

	}
}
