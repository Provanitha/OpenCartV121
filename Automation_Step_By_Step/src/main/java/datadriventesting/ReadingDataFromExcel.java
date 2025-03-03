package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

// Excel-->File-->WorkBook-->Sheets-->Rows-->Cells

public class ReadingDataFromExcel {

	public static void main(String[] args) throws IOException {
		
		
	//FileInputStream file= new FileInputStream(System.getProperty("user.dir")+"\\testdata\\data.xls");
	FileInputStream file= new FileInputStream("C:\\Users\\vanitha.d\\eclipse-workspace\\Automation_Step_By_Step\\testdata\\Data1.xls");
	
	HSSFWorkbook  workbook = new HSSFWorkbook(file);// (HSSFWorkbook for .xls files and XSSFWorkbook for .xlsx files),
	HSSFSheet sheet= workbook.getSheet("Sheet1");
	int totalrows  = sheet.getLastRowNum();
	int totalcells=sheet.getRow(1).getLastCellNum();
	
	System.out.println("total rows:"+ totalrows);// 5-->starts from 0
	System.out.println("total cells:"+ totalcells);//4-->starts from 1
	
	
	for(int r=0;r<=totalrows;r++) {
		
		HSSFRow row=sheet.getRow(r);
		for(int c=0;c<totalcells;c++) {
			HSSFCell cell=row.getCell(c);
			System.out.print(cell.toString()+ "\t");
			//is responsible for printing the content of each cell in the Excel sheet.
			//The toString() method is used to convert the cell's content (whatever type it may be, such as String, numeric, boolean, etc.)
             //into a string representation so that it can be easily printed.
		}
		System.out.println();
	}

	workbook.close();
	file.close();
	}

}
