package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenSample {
	
	public static void main(String[] args) throws IOException {	
		
                 //Accessing file
		
		File file=new File("C:\\Users\\USER\\Desktop\\Prakash\\Bookfeb.xlsx");
		
		//Inputstream
		
		FileInputStream input=new FileInputStream(file);
		
		//Accessing workbook
		
		Workbook book=new XSSFWorkbook(input);
		
		//Accessing sheet
		
		Sheet sheet = book.getSheet("Sheet1");
		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		
		System.out.println("Total number of rows  :"+physicalNumberOfRows);
		
		//Access the rows
		
		Row row = sheet.getRow(0);
		
		int physicalNumberOfCells = row.getPhysicalNumberOfCells();
		
		System.out.println("Total number of cells  :"+physicalNumberOfCells);
		
		//Access the cell
		
		Cell cell = row.getCell(0);
		
		
		//Get data from the cell
		
		String stringCellValue = cell.getStringCellValue();
		
		System.out.println(stringCellValue);
		
	}

}
