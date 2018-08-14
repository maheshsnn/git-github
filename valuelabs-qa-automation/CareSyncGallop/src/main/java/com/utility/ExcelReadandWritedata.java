	package com.utility;
	
	import java.io.FileInputStream;
	import java.io.FileOutputStream;
	import org.apache.poi.xssf.usermodel.XSSFCell;
	import org.apache.poi.xssf.usermodel.XSSFRow;
	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
		
	public class ExcelReadandWritedata{
	/**
	 * @Function to read and write data
	 * @param rowNo
	 * @param colNo
	 * @return
	 * @throws Exception
	 */
		static String Excelpath;
	@SuppressWarnings("unused")
	public static String Readcell(int rowNo,int colNo) throws Exception{
		Propertiesfile  pro=new Propertiesfile();
		 Excelpath=System.getProperty("user.dir")+System.getProperty("file.separator")+pro.Excel();
		FileInputStream fis=new FileInputStream(Excelpath);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet s=wb.getSheetAt(0);
		XSSFRow row=s.getRow(rowNo);
		XSSFCell cell=s.getRow(rowNo).getCell(colNo);
		String k=cell.toString();
		return k;
	}
	
	/**
	 * 
	 * @param rowNo
	 * @param colNo
	 * @param valuee
	 * @throws Exception
	 */
	public static  void Writecell(int rowNo,int colNo,boolean valuee) throws Exception{
		Propertiesfile  pro=new Propertiesfile();
		Excelpath=System.getProperty("user.dir")+System.getProperty("file.separator")+pro.Excel();
		FileInputStream fis=new FileInputStream(Excelpath);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet s=wb.getSheetAt(0);
		XSSFRow row=s.getRow(rowNo);
		XSSFCell cell=s.getRow(rowNo).getCell(colNo);
		if (cell==null){
		XSSFCell cell2=row.createCell(colNo);
		cell2.setCellValue(valuee);
	}
	else{
		cell.setCellValue(valuee);
	}
	fis.close();
	FileOutputStream fos=new FileOutputStream(pro.Excel());
	wb.write(fos);
	fos.close();
	
	}
	}
	
	
