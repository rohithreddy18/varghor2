package work;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test1 {
	
	WebDriver driver;

	public Test1() {
		// TODO Auto-generated constructor stub
	}
	
	@BeforeSuite
	public void preConditions() {
		System.out.println(" We are in before suite");
		Reporter.log("we are in before suite");
	}
	
	@AfterSuite
	public void postConditions() {
		System.out.println(" We are in before suite");
		Reporter.log("we are in before suite");
	}
	
	@BeforeTest
	public void preTestConditions() {
		System.out.println(" We are in before suite");
		
		Reporter.log("we are in before suite");
	}
	
	@AfterTest
	public void postTestConditions() {
		System.out.println(" We are in before suite");
		Reporter.log("we are in before suite");
	}
	
	@BeforeClass
	public void preClassConditions() {
		System.out.println(" We are in before suite");
		Reporter.log("we are in before suite");
	}
	
	@AfterClass
	public void postClassConditions() {
		System.out.println(" We are in before suite");
		Reporter.log("we are in before suite");
	}
	
	@BeforeMethod
	@Parameters({"browser"})
	public void browserlaunch(String browser) {
		System.out.println(browser);
		FetchBrowser b = new FetchBrowser(driver);
		this.driver=b.getbrowser(browser);
	}
	
	@AfterMethod
	public void browserclose() {
		System.out.println("We are in after method");
		Reporter.log("We are in after method");
	}
	
	@Test(priority=-2, groups= {"Sanity","Regression"})
	public void secondTest() {
		//System.out.println("Second Test Execution");
		//Reporter.log("Second Test Execution");
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/intl/en-GB/gmail/about/#");
		driver.manage().window().maximize();
	}
	
	@Test(groups= {"Smoke"})
	public void firstTest() {
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
	}
	
	
}
