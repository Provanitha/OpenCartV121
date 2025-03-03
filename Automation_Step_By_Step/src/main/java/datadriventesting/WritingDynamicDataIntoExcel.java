package datadriventesting;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class WritingDynamicDataIntoExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        FileOutputStream file= new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\myfile_DynamicData.xls");
		HSSFWorkbook  workbook = new HSSFWorkbook();
		HSSFSheet sheet=workbook.createSheet("DynamicData");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many rows?");
		int noOfrows=sc.nextInt();
		
		System.out.println("Enter how many columns?"); 
		int noOfcolmns = sc.nextInt();
		
		for(int r=0;r<noOfrows;r++) {
			
			HSSFRow Cuurentrow=sheet.createRow(r);
			for(int c=0;c<noOfcolmns;c++) {
				HSSFCell cell=Cuurentrow.createCell(c);
				cell.setCellValue(sc.next());
			}
		}
	
		
		workbook.write(file);
		
		workbook.close();
		file.close();
		
		System.out.println("file is created----");
		
	}

}
