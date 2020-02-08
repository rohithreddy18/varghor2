package com.utc.testing;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
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

import com.utc.BrowserFactory.BrowserFactory;



public class TestBrowser2 {
	
	WebDriver driver;

	
	@BeforeSuite
	public void Precondtios() {
		System.out.println("We are in Before Suite");
		Reporter.log("We are in Before Suite");
	}
	
	@AfterSuite
	public void Postcondtios() {
		System.out.println("We are in After Suite");
		Reporter.log("We are in After Suite");
	}
	
	@BeforeTest
	public void precondtionstest() {
		System.out.println("We are in Before Test");
		Reporter.log("We are in Before Test");
	}
	
	@AfterTest
	public void postcondtionstest() {
		System.out.println("We are in After Test");
		Reporter.log("We are in After Test");
	}
	
	@BeforeClass
	public void precondtionsClass() {
		System.out.println("We are in Before Class");
		Reporter.log("We are in Before Class");
	}
	
	@AfterClass
	public void postcondtionsClass() {
		System.out.println("We are in After Class");
		Reporter.log("We are in After Class");
	}

	
/*	@Test
	public void firstTest() {
		//System.out.println("First Test Execution");
		Reporter.log("First Test Execution");
		System.out.println(browser);
		
		//String browser = "chrome";
		if(browser=="chrome"){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\rohit\\Desktop\\Browsers\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			driver = new ChromeDriver(options);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			//drop down select function usage.
			driver.get("https://www.webfx.com/blog/web-design/50-examples-of-drop-down-navigation-menus-in-web-designs/");
			Reporter.log("Browser launched");
			driver.manage().window().maximize();
			
			Select choice = new Select(driver.findElement(By.xpath("//select[@id='blog-cat-dropdown']")));
			List<WebElement> allopts = choice.getOptions();
			
			for(int i=0;i<allopts.size();i++) {
				System.out.println(allopts.get(i).getText());
			}
			System.out.println(choice.getFirstSelectedOption().getText());
			Reporter.log(choice.getFirstSelectedOption().getText()+"is selected");
			choice.selectByIndex(2);
			Reporter.log("Option selected");
	
			
			
		}
			
	}*/
	
	@Test(enabled=true,priority=-2)
	public void secondTest() {
		System.out.println("Second Test Execution");
		Reporter.log("Second Test Execution");
	}
	
	
	
	@AfterMethod
	public void browserclose() {
		System.out.println("We are in after method");
		Reporter.log("We are in after method");
	}
	
	
	
	@BeforeMethod
	@Parameters({"browser"})
	public void browserlaunch(String browser) {
		
		System.out.println(browser);
		
		//String browsername=browser;
		
		BrowserFactory bf=new BrowserFactory(driver);
		this.driver=bf.getBrowser(browser);
		
	}
	
	@Test
	public void FirstTest() {
			//drop down select function usage.
			driver.get("https://www.webfx.com/blog/web-design/50-examples-of-drop-down-navigation-menus-in-web-designs/");
			driver.manage().window().maximize();
			Select choice = new Select(driver.findElement(By.xpath("//select[@id='blog-cat-dropdown']")));
			choice.selectByIndex(2);
			
			List<WebElement> allopts = choice.getOptions();
			System.out.println(allopts.size());
			for(int i=0;i<allopts.size();i++) {
				System.out.println(allopts.get(i).getText());
			}
			System.out.println(choice.getFirstSelectedOption().getText());
			
		}
}
	
	
	
		

