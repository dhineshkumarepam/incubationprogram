package testing;


import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class listener implements ITestListener {

	public void onTestSuccess(ITestResult result) {
		if (result.getStatus() == ITestResult.SUCCESS) {
			System.out.println("test pass");
			
		}
	}

	public void onTestFailure(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
			System.out.println("test Fail");
		}
	}

	public void onTestSkipped(ITestResult result) {
			}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}

	public void onStart(ITestContext context) {
		ExtentReport r = new ExtentReport();
	r.extent.createTest("test start");
	
	}

	public void onFinish(ITestContext context) {
	}
}
