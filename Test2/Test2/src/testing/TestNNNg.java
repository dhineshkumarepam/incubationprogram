package testing;


import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.epam.tat.module4.Calculator;

public class TestNNNg extends ExtentReport  {
	 private Calculator calculator;
	 ExtentReport e ;
	 ExtentReports extent2;
	 public static ExtentTest test;
	 public static ExtentHtmlReporter htmlReporter;
		public static ExtentReports extent;
		public static String dateName;
		public static String  Screenshotpath ;
		public static String path;

	 
	 public TestNNNg() {
		 calculator = new Calculator();
	}
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
//		e= new ExtentReport();
//		e.setExtent();
//		 extent2 = e.extent;
//		 extent2.createTest("TestNg test");
	}
	 @AfterSuite
	 private void testEnd() {
		 extent.flush();
	}
	 
	@BeforeMethod
	private void rretes() {
		 test.createNode("test Start");
	}
	
	    @Test(dependsOnGroups = "Reg",groups = {"smoke"})
	    public void testAddPositive() {
	  
	        assertEquals(calculator.sum(2, 3), 5);
	    }

	    @Test(groups = {"smoke","Reg"})
	    public void testAddNegative() {
	        assertNotEquals(calculator.sum(5, -2), 3);
	    }

	    @Test(groups = {"smoke"})
	    public void testSubtractPositive() {
	        assertEquals(calculator.sub(10, 5), 5);
	    }

	    @Test(groups = {"Reg"})
	    public void testSubtractNegative() {
	        assertNotEquals(calculator.sub(8, 3), 4);
	    }

	    @Test(groups = {"Reg"})
	    public void testMultiplyPositive() {
	        assertEquals(calculator.mult(3, 4), 12);
	    }

	    @Test
	    public void testMultiplyNegative() {
	        assertNotEquals(calculator.mult(6, 7), 35);
	    }

	    @Test
	    public void testDividePositive() {
	        assertEquals(calculator.div(10, 2), 5);
	    }

	    @Test(expectedExceptions = IllegalArgumentException.class)
	    public void test1DivideByZero() {
	        calculator.div(5, 0);
	    }
	    @Test(expectedExceptions = IllegalArgumentException.class)
	    public void testDivideByZero() {
	        calculator.div(5, 0);
	    }

	    @Test(expectedExceptions = IllegalArgumentException.class)
	    public void testDivideByZeroWithNegativeOperand() {
	        calculator.div(10, -2);
	    }
	    
	    @DataProvider(name = "addTestData")
	    public Object[][] addTestData() {
	        return new Object[][] {
	            {2, 3, 5},     
	            {5, -2, 3},   
	            {0, 0, 0}     
	        };
	    }

	    @Test(dataProvider = "addTestData")
	    public void testAdd(int a, int b, int expected) {
	        assertEquals(calculator.sum(a, b), expected);
	    }
	    @AfterMethod
	    private void testcasesub() {
	    	test.createNode("test end");
		}
	}


	
