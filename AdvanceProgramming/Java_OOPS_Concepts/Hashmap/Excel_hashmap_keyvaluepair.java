package Hashmap;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_hashmap_keyvaluepair {

	public static void main(String[] args) throws Exception {

		HashMap<ArrayList, ArrayList> hss = new HashMap<ArrayList, ArrayList>();

		ArrayList<String> al1 = Excel_hashmap_keyvaluepair.Excelread(2);
		ArrayList<String> al2 = Excel_hashmap_keyvaluepair.Excelread(1);

		hss.put(al1, al2);

		int largest = Integer.parseInt(al1.get(0));
		
		int secondlargest=Integer.parseInt(al1.get(0));

		for (int i = 0; i < al1.size(); i++) {
			
			int check = Integer.parseInt(al1.get(i));

			if (check > largest) {
				largest = check;
				System.out.println(largest);
			}
			else if(check>secondlargest)
			{
				secondlargest=check;
				System.out.println(secondlargest);
			}
		}
		
		

		for (int j = 0; j < al1.size(); j++) {
			
			if (Integer.parseInt(al1.get(j)) ==largest) {
				// System.out.println(j);
				System.out.println(largest + "  =  " + al2.get(j));
			}
		}

	}

	public static ArrayList Excelread(int colno) throws Exception {

		// HashMap<String, String> hs = new HashMap<String, String>();

		ArrayList al = new ArrayList();

		FileInputStream fis = new FileInputStream("G:\\rrrr.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet s = wb.getSheetAt(0);

		Iterator<Row> itr = s.iterator();

		while (itr.hasNext()) {
			al.add(itr.next().getCell(colno).getStringCellValue());
		}

		return al;

	}

}
