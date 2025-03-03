package datadriventesting;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class WritingDatainSpecificRowAndCell {

	public static void main(String[] args) throws IOException {

		FileOutputStream file= new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\myfileRandomData.xls");
		HSSFWorkbook  workbook = new HSSFWorkbook();
		HSSFSheet sheet=workbook.createSheet("RandomData");
		
		HSSFRow row=sheet.createRow(4);
		HSSFCell cell=row.createCell(6);
		
		
		cell.setCellValue("Automatinmg");
		
		workbook.close();
		file.close();
		
		System.out.println("RandomData file is created---");
		
	}

}
