package com.API_Testing.Listeners;



import java.io.File;
import java.net.InetAddress;
import java.net.URI;
import java.net.URL;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.io.FileUtils;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.NetworkMode;

public class APIExtentManager {

	
	public static ExtentReports apiextent;
	public static ExtentTest apitest;
	public static String obdxHost;
	public static String obdxPort;

	public void GenerateEx_report() throws Exception {
		String folder = GenerateExtentedReport();
		init_Report(folder);
	}

	public String GenerateExtentedReport() throws Exception {
		List<String> folderPaths = new ArrayList<String>();
		boolean ss_folder_isExits = BaseTest.PARENT_TEST_RESULT_FOLDER_PATH == null
				&& BaseTest.PARENT_TEST_RESULT_FOLDER_PATH.isEmpty();
		if (ss_folder_isExits)
			throw new Exception("Parent Folder Dosen't Exits");
		folderPaths.add(BaseTest.PARENT_TEST_RESULT_FOLDER_PATH + "\\" + BaseTest.reportName);
		for (String folderPath : folderPaths) {
			if (folderPath.contains("null"))
				continue;
			if (!(new File(folderPath)).exists()) {
				Files.createDirectories(new File(folderPath).toPath());
			}
		}
		return folderPaths.get(0);
	}

	public void init_Report(String ER_Folder) throws Exception {
		String vConfigPath = new File("configue.xml").getAbsolutePath();
		String f = new File("Resources/bank image.svg").getAbsoluteFile().toString();
		String f2 = ER_Folder + "\\bank image.svg";
		FileUtils.copyFile(new File(f), new File(f2));
		apiextent = new ExtentReports(ER_Folder + "\\" + BaseTest.reportName + ".html", true, NetworkMode.OFFLINE);
		apiextent.loadConfig(new File(vConfigPath));
		apiextent.addSystemInfo("OS", System.getProperty("os.name"));
		apiextent.addSystemInfo("Java Version", System.getProperty("java.runtime.version"));
		apiextent.addSystemInfo("Automation Type", "API Testing");
		// apiextent.addSystemInfo("Tested API URL", BaseInit.strAPIUrl);
		apiextent.addSystemInfo("Banking Platform", "Dont Know");
		
//		String strNumber;
//		if (BaseInit.getCommandValuesMap.get("OBAPI_Version").contains("-"))
//			strNumber = BaseInit.getCommandValuesMap.get("OBAPI_Version").substring(0,
//					BaseInit.getCommandValuesMap.get("OBAPI_Version").indexOf("-"));
//		else if (BaseInit.getCommandValuesMap.get("OBAPI_Version").contains("v")
//				|| BaseInit.getCommandValuesMap.get("OBAPI_Version").contains("V")) {
//			Pattern textPattern = Pattern.compile("(?=.*[A-Z]).+$");
//			boolean iscaps = textPattern.matcher(BaseInit.getCommandValuesMap.get("OBAPI_Version")).matches();
//			if (iscaps)
//				strNumber = BaseInit.getCommandValuesMap.get("OBAPI_Version").replace("V", "");
//			else
//				strNumber = BaseInit.getCommandValuesMap.get("OBAPI_Version").replace("v", "");
//		} else
//			strNumber = BaseInit.getCommandValuesMap.get("OBAPI_Version");
//		apiextent.addSystemInfo("OBAPI Version", strNumber);
//		String sp;
//		boolean bnlip = ip(BaseInit.getCommandValuesMap.get("OBAPI_host"));
//		if (bnlip) {
//			String Strconverurl;
//			boolean bnlurl = BaseInit.getCommandValuesMap.get("OBAPI_host").startsWith("http");
//			boolean bnlurl1 = BaseInit.getCommandValuesMap.get("OBAPI_host").startsWith("https");
//			if (!bnlurl || !bnlurl1)
//				Strconverurl = "http://" + BaseInit.getCommandValuesMap.get("OBAPI_host");
//			else
//				Strconverurl = BaseInit.getCommandValuesMap.get("OBAPI_host");
//			URI uri = new URI(Strconverurl);
//			URL url = uri.toURL();
//			InetAddress address = InetAddress.getByName(url.getHost());
//			String temp = address.toString();
//			sp = temp.substring(temp.indexOf("/") + 1, temp.length());
//			obdxHost = sp;
//			obdxPort = String.valueOf(url.getPort());
//			apiextent.addSystemInfo("obdxHost", obdxHost);
//			apiextent.addSystemInfo("obdxPort", obdxPort);
//		} else {
//			sp = BaseInit.getCommandValuesMap.get("OBAPI_host").startsWith("sit") ? "SIT"
//					: BaseInit.getCommandValuesMap.get("OBAPI_host").startsWith("uat") ? "UAT" : "UAT";
//		}
		apiextent.addSystemInfo("API Environment", "SIT");
		apiextent.addSystemInfo("Bank Name", "UZB");
		apiextent.addSystemInfo("Project Name", "UZB Automation");
		// apiextent.addSystemInfo("API Call",BaseInit.strAPIUrl);
		Locale locale = Locale.getDefault();
		apiextent.addSystemInfo("Location", locale.getDisplayCountry());
		InetAddress myIP = InetAddress.getLocalHost();
		apiextent.addSystemInfo("Host Address", myIP.getHostAddress());
	}

	public static boolean ip(String text) {
		Pattern p = Pattern.compile(
				"^((0|1[0-9]{0,2}|2[0-9]?|2[0-4][0-9]|25[0-5]|[3-9][0-9]?)\\.){3}(0|1[0-9]{0,2}|2[0-9]?|2[0-4][0-9]|25[0-5]|[3-9][0-9]?)");
		Matcher m = p.matcher(text);
		return m.find();
	}

}
