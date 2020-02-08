package com.demoguru99.Guru99Bank.Base;



import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.demoguru99.Guru99Bank.Browser.AppConstants;
import com.demoguru99.Guru99Bank.Browser.BrowserFactory;
import com.demoguru99.Guru99Bank.PageObjects.PageLogin;


public class BaseTest {

	public BaseTest() {
		// TODO Auto-generated constructor stub
	}
	
	public WebDriver driver=null;
	
	@BeforeSuite
	public void connectDB() {
		
	}
	
	@BeforeMethod
	public void browserlaunch() throws IOException {
		
		BrowserFactory bf = new BrowserFactory(driver);
		driver = bf.getbrowser("Browsername");
		driver.get(AppConstants.URL);
	}
	
	@AfterMethod
	public void closebrowser() {
		driver.close();
	}
	
	@Test
	public void  Testcase01() {
		
	PageLogin p1 = new PageLogin(driver);
	p1.verificationOfLogin();
		
	}
	
	@AfterSuite
	public void closeDB() {
		
	}
}

