package testing;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.epam.tat.module4.Calculator;

public class ParalelTC extends ExtentReport{
	static ExtentTest test ;
	private Calculator calculator;
	 ExtentReport e ;
	 ExtentReports extent2;
	 public static ExtentHtmlReporter htmlReporter;
		public static ExtentReports extent;
		public static String dateName;
		public static String  Screenshotpath ;
		public static String path;
	 @BeforeSuite
	private void teststart() {
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
	 @AfterSuite
	 private void testEnd() {
		 extent.flush();
	}
	 
	@Test
	private void Paralel() {
		System.out.println("Test Pass");
	}

}
