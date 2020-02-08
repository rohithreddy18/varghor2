 package Drivers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
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
	
	/*@BeforeMethod
	@Parameters({"browser"})
	public void browserlaunch(String browser) {
		
		System.out.println(browser);
		
		//String browsername=browser;
		
		Browser1 bf=new Browser1(driver);
		this.driver=bf.getBrowser(browser);
		
	}*/
	
	@AfterMethod
	public void browserclose() {
		System.out.println("We are in after method");
		Reporter.log("We are in after method");
	}
	
	@Test(enabled=true,priority=-2,groups= {"Regression","Sanity"})
	public void secondTest() {
		System.out.println("Second Test Execution");
		Reporter.log("Second Test Execution");
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/intl/en-GB/gmail/about/#");
		driver.manage().window().maximize();
	}
	
	@Test (groups= {"Sanity"})
	public void firstTest() {
		System.out.println(System.getProperty("user.dir"));
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\Drivers\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		driver=new ChromeDriver(options);
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
	}
	
	@Test (groups= {"Sanity","Smoke"})
	public void firstTest1() {
		System.out.println(System.getProperty("user.dir"));
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\Drivers\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		driver=new ChromeDriver(options);
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
	}
	
	
	@Test ()
	public void Login() {
		System.out.println(System.getProperty("user.dir"));
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\Drivers\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		driver=new ChromeDriver(options);
		Assert.fail();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
	}
	
	
	@Test (dependsOnMethods="Login",alwaysRun=true)
	public void accountBalance() {
		System.out.println(System.getProperty("user.dir"));
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\Drivers\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		driver=new ChromeDriver(options);
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
	}
	
	
}
