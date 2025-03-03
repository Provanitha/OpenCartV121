package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFCell;
public class FullSheetReadingDataFormExceo {

	public static void main(String[] args) throws IOException {
     String excelfilepath= ".\\testdata\\StudentDetails.xlsx";
		//String excelfilepath =System.getProperty(("user.dir")  +  "\\testdata\\StudentDetails.xlsx");
      
      FileInputStream file = new FileInputStream(excelfilepath);
      XSSFWorkbook workbook = new XSSFWorkbook(file);
     // XSSFSheet sheet =workbook.getSheetAt(0);
     XSSFSheet sheet = workbook.getSheet("Sheet1");
      
   int rows=sheet.getLastRowNum();
   int cols = sheet.getRow(1).getLastCellNum(); // from row 1 we get all cell values
   
   System.out.println("total rows:" + rows);
   System.out.println("total cols:"  + cols);
   
   
   // using for loops we will get all data from excel sheet rows and cols
   
   for(int r=0; r<=rows; r++) {
	 XSSFRow row=  sheet.getRow(r);
	 
	 for (int c=0; c<cols; c++) {
		XSSFCell cell= row.getCell(c);
		System.out.print(cell.toString()+ "\t");
		
//switch(cell.getCellType())
//	{
//case STRING: System.out.println(cell.getStringCellValue());
//	             break;
//	case NUMERIC: System.out.println(cell.getNumericCellValue());
//	             break;
//	case BOOLEAN: System.out.println(cell.getBooleanCellValue());
//	              break;
//	}
	
	 }
	 System.out.println();
   }
      workbook.close();
      file.close();
	}

}
