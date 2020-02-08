package work;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
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

public class Test2 {
	
	WebDriver driver;

	public Test2() {
		// TODO Auto-generated constructor stub
	}
	
	@BeforeSuite
	public void preconditions() {
		System.out.println("we are in before suite");
		Reporter.log("we are in before suite");
	}
	
	@AfterSuite
	public void postconditions() {
		System.out.println("we are in before suite");
		Reporter.log("we are in before suite");
	}
	
	@BeforeTest
	public void pretestconditions() {
		System.out.println("we are in before test");
		Reporter.log("we are in before test");
	}
	
	@AfterTest
	public void posttestconditions() {
		System.out.println("we are in after test");
		Reporter.log("we are in after test");
	}
	
	@BeforeClass
	public void preclassconditions() {
		System.out.println("we are in before class");
		Reporter.log("we are in before class");
	}
	
	@AfterClass
	public void postclassconditions() {
		System.out.println("we are in after class");
		Reporter.log("we are in after class");
	}
	
	@BeforeMethod
	@Parameters({"browser"})
	public void browserlaunch(String browser) {
		System.out.println(browser);
		FetchBrowser c = new FetchBrowser(driver);
		this.driver=c.getbrowser(browser);
	}
	
	@AfterMethod
	public void browserclose() {
		System.out.println("We are in after method");
		Reporter.log("We are in after method");
	}
	
	@Test()
	public void firstTest() {
			//drop down select function usage.
			Assert.fail();
			driver.get("https://www.webfx.com/blog/web-design/50-examples-of-drop-down-navigation-menus-in-web-designs/");
			driver.manage().window().maximize();
			Select choice = new Select(driver.findElement(By.xpath("//select[@id='blog-cat-dropdown']")));
			choice.selectByIndex(2);
			
			
	}
	
	@Test(dependsOnMethods="firstTest",alwaysRun=true)
	public void secondTest() {
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
	}
}
