package com.API_Testing.Listeners;


import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import com.relevantcodes.extentreports.ExtentReports;

import Utilities.Utils;
public class ExtentManager {

	static ExtentReports extent;
	//final static String filePath = "./test-output/html/Extent.html";
	final static String filePath = "C:\\API_Automation_Test_Results\\"+getCurrentDate()+"\\"+getCurrentTime()+"\\MyReport.html";
	public synchronized static ExtentReports getReporter(){
		if(extent==null) {
			extent = new ExtentReports(filePath, true);
		}
		extent.addSystemInfo("Automation Type","API Automation");
		try {
			extent.addSystemInfo("Executed URL",new Utils().getGlobalValues("baseUrl"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		extent.addSystemInfo("Banking Platform","OBDX(Oracle Banking Digital Experience)");
		extent.addSystemInfo("Bank Name","Dont Know");
		extent.addSystemInfo("Location","India");
		extent.loadConfig(new File("C:\\WebApplication\\API Automation\\TestNG_RestAssuredFramework\\configue.xml"));
		return extent;
	}
	
	public static String getCurrentDate() {
		   DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		   LocalDateTime now = LocalDateTime.now();
		   return dtf.format(now);
	}
	public static String getCurrentTime() {
		Date date = new Date();
        SimpleDateFormat formatTime = new SimpleDateFormat("hh.mm aa");
        String time = formatTime.format(date);
        return time;
}
}