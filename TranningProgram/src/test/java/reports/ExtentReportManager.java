package reports;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager implements ITestListener {
	
	public ExtentReports extentReports;
	public ExtentTest test;
	public ExtentSparkReporter sparkReporter;
	
	
	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
	System.out.println("Testing started....");
	sparkReporter = new ExtentSparkReporter("./report/automation_report.html");
	sparkReporter.config().setDocumentTitle("Automation Report");
	sparkReporter.config().setReportName("Functiona Testing");
	sparkReporter.config().setTheme(Theme.DARK);
	
	extentReports = new ExtentReports();
	extentReports.attachReporter(sparkReporter);
	
	extentReports.setSystemInfo("Computer Namne", "localhoat");
	extentReports.setSystemInfo("Environmnet", "QA");
	extentReports.setSystemInfo("Tester Name", "Karuna");
	extentReports.setSystemInfo("OS", "Windows");
	extentReports.setSystemInfo("Browser Name", "Browser");
	
	}
	 
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		//test = extentReports.createTest(result.getName());
		//test.log(Status.INFO, "Test case started : "+result.getName());
		System.out.println(result.getName()+" Started");
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		test = extentReports.createTest(result.getName());
		test.log(Status.PASS, "Test case passes is : "+result.getName());
		System.out.println(result.getName()+" PASSED");

	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		test = extentReports.createTest(result.getName());
		test.log(Status.FAIL, "Test case failed is : "+result.getName());
		test.log(Status.FAIL, "Test case failed cause is : "+result.getThrowable());
		System.out.println(result.getName()+" Failed");

	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		test= extentReports.createTest(result.getName());
		test.log(Status.SKIP, "Test case skipped is : "+result.getName());
		System.out.println(result.getName()+ " SKIPED");

	}
	
	
	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		extentReports.flush();
		System.out.println("Testing finished....");

	}

}
