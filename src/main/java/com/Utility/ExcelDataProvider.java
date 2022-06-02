package com.Utility;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	XSSFWorkbook wb;
	public ExcelDataProvider() throws Exception {
		String excelpath="C:\\Users\\admin\\eclipse-workspace\\Vision_FrameDemo\\TestData\\Data.xlsx";
		FileInputStream file= new FileInputStream(excelpath);
		wb=new XSSFWorkbook(file);
	}
	public String getStringData(String Sheetname, int row, int column) {
		return wb.getSheet(Sheetname).getRow(row).getCell(column).getStringCellValue();
	}

}
