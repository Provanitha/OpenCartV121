package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	public static FileInputStream fi;
	public static FileOutputStream fo;
	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;
	public static XSSFRow row;
	public static XSSFCell cell;
	public static CellStyle style;
	String path;
	
	public ExcelUtils(String path) {
		this.path=path;
	}
	
	public  int getRowCount(String sheetName, int rownum) throws IOException {
		fi= new FileInputStream(path);
		workbook= new XSSFWorkbook(fi);
		sheet=workbook.getSheet(sheetName);
		int rowcount=sheet.getLastRowNum();
		workbook.close();
		fi.close();
		return rowcount;
	}
	
	public  int getCellCount(String sheetName, int rownum) throws IOException {
		fi= new FileInputStream(path);
		workbook= new XSSFWorkbook(fi);
		sheet=workbook.getSheet(sheetName);
		row=sheet.getRow(rownum);
		int cellCount= row.getLastCellNum();
		
		workbook.close();
		fi.close();
		return cellCount;
		}
	public  String getCellData(String sheetName, int rownum, int colnum) throws IOException {
		fi= new FileInputStream(path);
		workbook= new XSSFWorkbook(fi);
		sheet=workbook.getSheet(sheetName);
		row=sheet.getRow(rownum);
		cell=row.getCell(colnum);
		
		DataFormatter formatter =new DataFormatter();
		String data;
		
		try {
			//data=cell.toString();
		
			data= formatter.formatCellValue(cell);
		}catch(Exception e){
			data="";
			
			
		}
		
		workbook.close();
		fi.close();
		return data;
		}
	
	public  void setCellData(String sheetName,  int rownum, int colnum, String data) throws IOException {
		File xlfile1 = new File(path);
		if(!xlfile1.exists()) { // if file not exist create new file
			workbook= new XSSFWorkbook();
			fo=new FileOutputStream(path);
			workbook.write(fo);
		}
		fi= new FileInputStream(path);
		workbook= new XSSFWorkbook(fi);
		
		if(workbook.getSheetIndex(sheetName)==-1) // IF SHEET not exist then create new sheet
			workbook.createSheet(sheetName);
		sheet=workbook.getSheet(sheetName);
		
		if(sheet.getRow(rownum)==null) // if row not exist then create new row
			sheet.createRow(rownum);
		row=sheet.getRow(rownum);
		
		
		
		cell=row.createCell(colnum);
		cell.setCellValue(data);
		fo=new FileOutputStream(path);
		workbook.write(fo);
		workbook.close();
		fi.close();
		fo.close();
		
	}
	
	public  void fillGreenColor(String sheetName, int rownum, int colnum) throws IOException {
		fi= new FileInputStream(path);
		workbook= new XSSFWorkbook(fi);
		sheet=workbook.getSheet(sheetName);
		row=sheet.getRow(rownum);
		cell=row.getCell(colnum);
		
		style=workbook.createCellStyle();
		
		style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		
		cell.setCellStyle(style);
		workbook.write(fo);
		workbook.close();
		fi.close();
		fo.close();
		
	}
	public  void fillRedColor(String sheetName, int rownum, int colnum) throws IOException {
		fi= new FileInputStream(path);
		workbook= new XSSFWorkbook(fi);
		sheet=workbook.getSheet(sheetName);
		row=sheet.getRow(rownum);
		cell=row.getCell(colnum);
		
		style=workbook.createCellStyle();
		
		style.setFillForegroundColor(IndexedColors.BLUE.getIndex());
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		
		cell.setCellStyle(style);
		workbook.write(fo);
		workbook.close();
		fi.close();
		fo.close();
		
	}
		
}	
	

