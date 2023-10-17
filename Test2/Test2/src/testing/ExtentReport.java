package testing;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReport {
	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports extent;
	public static ExtentTest test;
	public static String dateName;
	public static String  Screenshotpath ;
	public static String path;
	
	public static void setExtent( ) {
		dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		path = System.getProperty("user.dir") + "\\Report\\Node_Report" + dateName.toString();
        File file = new File(path);
        file.mkdir();
        Screenshotpath = path + "\\Screenshot";
        File screenfile = new File(Screenshotpath);
        screenfile.mkdir();
        htmlReporter = new ExtentHtmlReporter(path+"\\Node__Report.html");
        htmlReporter.loadXMLConfig(System.getProperty("user.dir") + "/extent.config.xml");
		
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		
	}
	public static void endReport() {
		extent.flush();
	}
	public static void main(String[] args) {
		setExtent( );
		endReport();
	}
	}

