package com.API_Testing.Listeners;


import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TreeMap;
import java.util.regex.Pattern;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class BaseTest {

	public static String PARENT_TEST_RESULT_FOLDER_PATH;
	public static String ExtendReportPath;
	public static String reportName;
	public static String start;
	public static String end;
	static String starttime;
	public static Integer PASSED_TC_COUNTER = 0, FAILED_TC_COUNTER = 0, SKIPPED_TC_COUNTER = 0;
	public static List<String> userType;
	//public static LinkedHashMap<String, String> getCommandValuesMap;
	public static String strAPIUrl;
	public static String OBAPI_host;
	public static TreeMap<String, String> testDataMap;
	public static String Duration;
	SimpleDateFormat dtf = new SimpleDateFormat("dd/MM/yy hh:mm:ss.sss aa");
	public static String BROWSERNAME;
	public static String VERSION;
	public static String BankingPlatform = "Dont Know";
	public static ThreadLocal<String> dateTime = new ThreadLocal<String>();


	@BeforeClass(alwaysRun = true)
	public void beforeClass() throws Exception {
		userType = new ArrayList<String>();
		reportName = "";
		reportName=this.getClass().getName().replace(".", " ").split(" ")[1];
		//reportName = this.getClass().getName().split(Pattern.quote("."))[4].replace("Test", "");
		String name = this.getClass().getName().replace(".", " ").split(" ")[1];
		System.out.println("Report Name "+name);
		userType.add("API AUTOMATION");
		new APIExtentManager().GenerateEx_report();
	}



	@AfterClass(alwaysRun = true)
	public void afterClass() {
		APIExtentManager.apiextent.endTest(APIExtentManager.apitest);
		APIExtentManager.apiextent.flush();
	}


	@BeforeSuite(alwaysRun = true)
	public void beforeSuite() throws Exception {
		//		getCommandValuesMap = new LinkedHashMap<>();
		PARENT_TEST_RESULT_FOLDER_PATH = new GenerateReportParentFolder().GenerateParentTestResultWrapper();
		start = dtf.format(Calendar.getInstance().getTime());
		//		getCommandValuesMap = new Fillo().getTestDataFromExcel("RUN_CONFIGURATION_SETUP", "18", "", "");
		//		boolean isValidURL = isValid(getCommandValuesMap.get("OBAPI_host"));
		//		if (!isValidURL)
		//			OBAPI_host = "http://" + getCommandValuesMap.get("OBAPI_host");
	}

	@AfterSuite(alwaysRun = true)
	public void afterSuite() throws Exception {
		end = dtf.format(Calendar.getInstance().getTime());
		Date d1 = dtf.parse(start);
		Date d2 = dtf.parse(end);
		long difference_In_Time = d2.getTime() - d1.getTime();
		long difference_In_Timwe = (difference_In_Time / 1000);
		long difference_In_Seconds = (difference_In_Time / 1000) % 60;
		long difference_In_Minutes = (difference_In_Time / (1000 * 60)) % 60;
		long difference_In_Hours = (difference_In_Time / (1000 * 60 * 60)) % 24;
		long difference_In_Days = (difference_In_Time / (1000 * 60 * 60 * 24)) % 365;
		Duration = difference_In_Days + " Days, " + difference_In_Hours + " Hrs, " + difference_In_Minutes + " Min, "
				+ difference_In_Seconds + " Sec and " + difference_In_Timwe + " MS";
		//new ExecutionStatusReport().generateAutomationExecutionReport();
		System.out.println("******************************** TEST REPORT *****************************************");
		System.out.println("Project Name - UZB");
		String timeStamp = new SimpleDateFormat("EEE MMM dd yyyy HH:mm:ss", java.util.Locale.ENGLISH)
				.format(Calendar.getInstance().getTime());
		System.out.println("Report Date - " + timeStamp);
		System.out.println("Execution By - " + System.getProperty("user.name"));
		System.out.println("Execution Start Time - " + start);
		System.out.println("Execution End Time - " + end);
		LocalTime.now();
		// DateTimeFormatter formatter5= DateTimeFormatter.ofPattern("dd/MM/yy
		// hh:mm:ss.000");
		// Duration duration =
		// Duration.between(LocalTime.parse(start,formatter5),LocalTime.parse(
		// end,formatter5));
		System.out.println("Total time taken -  " + Duration.replace("PT", ""));
		System.out.println("************************* Summary  **************************");
		Integer GD = PASSED_TC_COUNTER + FAILED_TC_COUNTER;
		System.out.println("APIs Total Count - " + GD);
		System.out.println("APIs Executed Count - " + GD);
		System.out.println("Success API Calls - " + PASSED_TC_COUNTER);
		System.out.println("Failed API Calls- " + FAILED_TC_COUNTER);
		System.out.println(
				"Pass Percentage - " + String.valueOf((float) ((BaseTest.PASSED_TC_COUNTER * 100) / GD) + "%"));
		System.out.println(
				"Fail Percentage - " + String.valueOf((float) ((BaseTest.FAILED_TC_COUNTER * 100) / GD) + "%"));
		System.out.println("*****************************************************************************************");
	}

	//	private boolean isValid(String url) {
	//		/* Try creating a valid URL */
	//		try {
	//			new URL(url).toURI();
	//			return true;
	//		}
	//		// If there was an Exception
	//		// while creating URL object
	//		catch (Exception e) {
	//			return false;
	//		}
	//	}




	public String getDateTime1() {
		return dateTime.get();
	}


}
