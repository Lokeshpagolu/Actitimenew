package com.actitime.generic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.internal.ant.AntReporterConfig.Property;

public class FileLib {
	
	public String getProperty(String key) throws IOException {
		FileInputStream file=new FileInputStream("./data//commondata.property"); 
		
		Properties p = new Properties();
		p.load(file);	
		String data = p.getProperty(key);
		return data;
	
}
	public String getExcelData(String sheet, int row, int cell) throws IOException {
		FileInputStream file=new FileInputStream("./data//testscript1.xlsx"); 
		 Workbook wb = WorkbookFactory.create(file);
		 String data = wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		 
		 return data;
		
	}
	public void setExcelData(String sheet, int row, int cell) throws IOException {
		FileInputStream file=new FileInputStream("./data//testscript1.xlsx"); 
		 Workbook wb = WorkbookFactory.create(file);
		  wb.getSheet(sheet).getRow(row).getCell(cell).setCellValue("pass");
		  FileOutputStream fos=new FileOutputStream("./data//testscript1.xlsx");
		  wb.write(fos);
		  wb.close();
		  
	}
}