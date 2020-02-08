package Drivers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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



public class Test1 {
	
	WebDriver driver;

	public Test1() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
	@BeforeSuite
	public void preConditions() {
		System.out.println("We are in Before Suite");
		Reporter.log("We are in Before Suite");
	}
	
	@AfterSuite
	public void postConditions() {
		System.out.println("We are in Before Suite");
		Reporter.log("We are in Before Suite");
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
	
	/*@Test(enabled=true,priority=-2)
	public void secondTest() {
		System.out.println("Second Test Execution");
		Reporter.log("Second Test Execution");
	}*/
	
	
	
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
		
		Browser1 bf=new Browser1(driver);
		this.driver=bf.getBrowser(browser);
		
	}
	
	@Test
	public void FirstTest() {
			//drop down select function usage.
			driver.get("https://www.webfx.com/blog/web-design/50-examples-of-drop-down-navigation-menus-in-web-designs/");
			driver.manage().window().maximize();
			Select choice = new Select(driver.findElement(By.xpath("//select[@id='blog-cat-dropdown']")));
			choice.selectByIndex(2);
			
			/* List<WebElement> allopts = choice.getOptions();
			System.out.println(allopts.size());
			for(int i=0;i<allopts.size();i++) {
				System.out.println(allopts.get(i).getText()); */
			}
			//System.out.println(choice.getFirstSelectedOption().getText());
			
		}




