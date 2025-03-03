package convertExceltofeature;

import java.io.FileInputStream;
import java.io.PrintWriter;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ExcelToFeature {

	public static void main(String[] args) {
		  // Step 1: Provide the path to the Excel file and the output feature file.
        String excelFilePath = "E:\\Automation testing\\Excel.feature.xlsx";
        String featureFilePath = "C:\\Users\\vanitha.d\\eclipse-workspace\\Automation_Step_By_Step\\test-output.feature";
        
        try (
            // Step 2: Open the Excel file and prepare to read it
            FileInputStream file = new FileInputStream(excelFilePath);
         
            Workbook workbook = WorkbookFactory.create(file);
            
            // Step 3: Prepare to write to the feature file
            PrintWriter featureWriter = new PrintWriter(featureFilePath);
        ) {
            Sheet sheet = workbook.getSheetAt(0);  // Get the first sheet in the Excel file
            
            String previousFeature = "";
            String previousScenario = "";
            
            // Step 4: Loop through each row in the Excel sheet
            for (Row row : sheet) {
                if (row.getRowNum() == 0) continue;  // Skip the header row
                
                // Get the values from the Excel columns
                String feature = row.getCell(0).getStringCellValue();  // Feature Name
                String scenario = row.getCell(1).getStringCellValue(); // Scenario Name
                String stepType = row.getCell(2).getStringCellValue(); // Step Type (Given, When, Then)
                String stepDesc = row.getCell(3).getStringCellValue(); // Step Description
                
                // Step 5: Write the feature only if it's a new one
                if (!feature.equals(previousFeature)) {
                    featureWriter.println("Feature: " + feature);
                    previousFeature = feature;
                }
                
                // Step 6: Write the scenario only if it's a new one
                if (!scenario.equals(previousScenario)) {
                    featureWriter.println("  Scenario: " + scenario);
                    previousScenario = scenario;
                }
                
                // Step 7: Write the step (Given, When, Then)
                featureWriter.println("    " + stepType + " " + stepDesc);
            }
            
            // Step 8: Inform the user that the feature file has been created
            System.out.println("Feature file created successfully at: " + featureFilePath);
        
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
