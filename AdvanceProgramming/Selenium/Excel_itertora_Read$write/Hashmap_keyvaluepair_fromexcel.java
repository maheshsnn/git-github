package Excel_itertora_Read$write;

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

		Hashmap_keyvaluepair_fromexcel ss = new Hashmap_keyvaluepair_fromexcel();

		System.out.println((ss.getdata().get("srinivas")));
	}

	public Map<String, String> getdata() throws IOException {

		HashMap<String, String> testdatafromexcel = new HashMap<>();

		FileInputStream fis = new FileInputStream("G:\\rrrr.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet s = wb.getSheetAt(0);

		Iterator<Row> itr = s.iterator();

		while (itr.hasNext()) {
			Row row = itr.next();

			Iterator<Cell> celliterator = row.iterator();

			while (celliterator.hasNext()) {
				Cell cell = celliterator.next();

				cell.setCellType(CellType.STRING);

				testdatafromexcel.put(cell.getStringCellValue(), celliterator.next().getStringCellValue());

			}

		}

		fis.close();
		return testdatafromexcel;

	}
}
