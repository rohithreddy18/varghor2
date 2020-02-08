package com.infosys.FireandSecurity.Base;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.infosys.FireandSecuity.BrowserFactory.AppConstants;
import com.infosys.FireandSecuity.BrowserFactory.BrowserFactory;
import com.infosys.FireandSecurity.PageObjects.PageCreatNewAccount;
import com.infosys.FireandSecurity.PageObjects.PageLogin;
import com.infosys.FireandSecurity.ReusableActionLib.ReusableActionlib;
import com.infosys.FireandSecurity.util.ExcelRead;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public class BaseTest {
	
	public WebDriver driver=null;

	static ExtentTest test;
	static ExtentReports report;
	
	@BeforeSuite
	public void connectDB() {
		
	}
	
	@BeforeClass
	public void starttest() {
		report = new ExtentReports(System.getProperty("user.dir")+"\\ExtentReportResults.html");
	}
	
	@BeforeMethod
	public void browserlaunch() {
		
		BrowserFactory bf=new BrowserFactory(driver);
		//driver=	bf.getBrowser("Browsername");
		driver.get(AppConstants.URL);
		//test.log(LogStatus.PASS, "Navigated to the specified URL");
	
		
	
		
		
	}
	
	@AfterMethod
	public void closeofBrowser() {
		
		driver.close();
		
	}
	
	
	
	
	
	
	
	@Test (enabled=false)
	public void Testcase01() 
	{
		report.startTest("Testcase01");
		PageLogin pl=new PageLogin(driver);
		//pl.launchURL();
		pl.fbtitlevalidation();
		test.log(LogStatus.PASS, "Facebook valiadtion is successful");
		pl.verificationOfLogin();
		
	/*assertEquals(driver.findElement(By.xpath("").getText(), "facebook");*/
		test.log(LogStatus.PASS, "Login is successful");
		report.endTest(test);
	}
	
	@Test(dataProvider="userData",dataProviderClass = ExcelRead.class,enabled=false)
	public void  FbLogin(String username, String password) {
		
		PageLogin pl=new PageLogin(driver);
		//pl.launchURL();
		pl.verificationOfLogin(username,password);
		
		
	}
	
	
	@Test(enabled=true)
	public void  TestCase2_CreateNewAccount() {
		report.startTest("TestCase2_CreateNewAccount");
		PageCreatNewAccount pcna=new PageCreatNewAccount(driver);
		//pl.launchURL();
		pcna.EnterFirstname();
		test.log(LogStatus.PASS, "Username entered is successful");
		pcna.EnterLastName();
		test.log(LogStatus.PASS, "Lastname entered is successful");
		pcna.EnterPassword();
		test.log(LogStatus.PASS, "Password entered is successful");
		pcna.selectDateFromDOB();
		test.log(LogStatus.PASS, "Date entered is successful");
		pcna.selectMonthFromDOB();
		test.log(LogStatus.PASS, "Month entered is successful");
		pcna.selectYearFromDOB();
		test.log(LogStatus.PASS, "Year entered is successful");
		report.endTest(test);
		
		
		
		
	}
	
	@AfterMethod
	public void closetest() {
	
		
	}
	
	@AfterClass
	public static void endTest()
	{	//report.endTest(test);
		report.flush();
	}
	
	@AfterSuite
	public void closeDB() {
		
	}

	

}
