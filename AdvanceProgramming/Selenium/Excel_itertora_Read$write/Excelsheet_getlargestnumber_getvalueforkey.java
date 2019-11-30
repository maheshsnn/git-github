package Excel_itertora_Read$write;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelsheet_getlargestnumber_getvalueforkey {

	public static void main(String[] args) throws Exception {
		HashMap<ArrayList, ArrayList> hs = new HashMap<ArrayList, ArrayList>();
		String x = "";
		String y = "";

		ArrayList<String> al1 = Excelsheet_getlargestnumber_getvalueforkey.Excelred(2);
		ArrayList<String> al2 = Excelsheet_getlargestnumber_getvalueforkey.Excelred(1);

		hs.put(al1, al2);

		int largest = Integer.parseInt(al1.get(0));

		for (int i = 0; i < al1.size(); i++) {

			int check = Integer.parseInt(al1.get(i));

			if (check > largest) {
				largest = check;

			}

		}

		String se = String.valueOf(largest);

		for (int j = 0; j < al1.size(); j++) {
			if (al1.get(j).equals(se)) {

				System.out.println(+largest + "=" + al2.get(j));

			}
		}

	}

	
	
	
	
	
	public static ArrayList Excelred(int colno) throws IOException {

		FileInputStream fis = new FileInputStream("G:\\rrrr.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet s = wb.getSheetAt(0);

		Iterator<Row> itr = s.iterator();
		ArrayList<String> al = new ArrayList();

		while (itr.hasNext()) {
			Row row = itr.next();
			al.add(row.getCell(colno).getStringCellValue());
		}

		return al;

	}

}
