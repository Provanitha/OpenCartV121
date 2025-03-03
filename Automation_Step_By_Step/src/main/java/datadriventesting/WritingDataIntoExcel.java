package datadriventesting;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

//Excel-->File-->WorkBook-->Sheets-->Rows-->Cells
public class WritingDataIntoExcel {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream file= new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\myfile.xls");
		

		HSSFWorkbook  workbook = new HSSFWorkbook();
		HSSFSheet sheet=workbook.createSheet("Data");
		HSSFRow row1=sheet.createRow(0);
		row1.createCell(0).setCellValue("Java");
		row1.createCell(1).setCellValue(12345);
		row1.createCell(2).setCellValue("Automation");
		
		HSSFRow row2=sheet.createRow(1);
		row2.createCell(0).setCellValue("Python");
		row2.createCell(1).setCellValue(3);
		row2.createCell(2).setCellValue("test");
		
		HSSFRow row3=sheet.createRow(2);
		row3.createCell(0).setCellValue("C#");
		row3.createCell(1).setCellValue(5);
		row3.createCell(2).setCellValue("hybrid");
		
		
		workbook.write(file);
		
		workbook.close();
		file.close();
		
		System.out.println("myfile is created");
		
		
		
		
	}

}
