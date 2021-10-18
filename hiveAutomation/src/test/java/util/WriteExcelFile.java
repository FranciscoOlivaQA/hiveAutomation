package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelFile {

	public WriteExcelFile() {
		// TODO Auto-generated constructor stub
	}
	
	public void writeExcel(String filepath, String sheetName, String[] dataToWrite) throws IOException {
		File file = new File(filepath);
		
		FileInputStream inputStream = new FileInputStream(file);
		
		XSSFWorkbook newWorkbook = new XSSFWorkbook(inputStream);
		
		XSSFSheet newSheet = newWorkbook.getSheet(sheetName);
		
		int rowCount = newSheet.getLastRowNum() - newSheet.getFirstRowNum();
		
		XSSFRow row = newSheet.getRow(0);
		
		XSSFRow newRow = newSheet.createRow(rowCount+1);
		
		for(int i = 0; i< row.getLastCellNum(); i++ ) {
			XSSFCell newCell = newRow.createCell(i);
			newCell.setCellValue(dataToWrite[i]);
		}
	}

}
