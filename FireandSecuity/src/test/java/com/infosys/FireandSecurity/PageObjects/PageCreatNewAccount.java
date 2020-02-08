package com.infosys.FireandSecurity.PageObjects;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import com.infosys.FireandSecuity.BrowserFactory.AppConstants;
import com.infosys.FireandSecurity.ReusableActionLib.ReusableActionlib;

import junit.framework.Assert;

public class PageCreatNewAccount extends ReusableActionlib {
	
	public WebDriver driver;
	
	String Firstname="Devendra";
	String Lastname="naidu";
	String Email="pacharla96@gmail.com";
	String password="HelloWorld";
	String DOB_Date="20";
	String DOB_Month="1";
	String DOB_Year="1990";
	

	public PageCreatNewAccount(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	
	public void clickOncreateNewAccountbutton() {
		try {
			clickOnElement("CreateAccount_XPATH", "XPATH");
			Reporter.log("Create new Account button has been clicked");
		}
		catch(Exception e) {
			Reporter.log("Create new Account button has not been clicked");
			Assert.fail();
		}
		
	}
	
	public void EnterFirstname() {
		
		try {
			InputTextOnElement("FirstName_XPATH", "XPATH", Firstname);
			Reporter.log("Firstname has been entered in Create new Account Page");
		}
		catch(Exception e) {
			Reporter.log("Firstname has not been entered in Create new Account Page");
		Assert.fail();
		}
	}
	
public void EnterLastName() {
		
		try {
			InputTextOnElement("Surename_XPATH", "XPATH", Lastname);
			Reporter.log("Lastname has been entered in Create new Account Page");
		}
		catch(Exception e) {
			Reporter.log("Lastname has not been entered in Create new Account Page");
		Assert.fail();
		}
	
}

public void EnterEmail() {
	
	try {
		InputTextOnElement("EmailAddress_XPATH", "XPATH", Email);
		Reporter.log("Email has been entered in Create new Account Page");
	}
	catch(Exception e) {
		Reporter.log("Email has not been entered in Create new Account Page");
	Assert.fail();
	}

}

public void EnterPassword() {
	
	try {
		InputTextOnElement("Password_XPATH", "XPATH", password);
		Reporter.log("Password has been entered in New Password field");
	}
	catch(Exception e) {
		Reporter.log("Email has not been entered in New Password field");
	Assert.fail();
	}

}

public void selectDateFromDOB() {
	try {
handlingDropDownOption("BirthDate_XPATH", "XPATH", "Index", "26");
Reporter.log("Date has been selected from the DOB Dropdown");
	}
	catch(Exception e) {
		Reporter.log("Date has not been selected from the DOB Dropdown");
		Assert.fail();
	}
}
	
	public void selectMonthFromDOB() {
		try {
	handlingDropDownOption("BirthMonth_XPATH", "XPATH", "value", "13");
	Reporter.log("Month has been selected from the DOB Dropdown");
		}
		catch(Exception e) {
			Reporter.log("Month has not been selected from the DOB Dropdown");
			Assert.fail();
		}
}
	
	public void selectYearFromDOB() {
		try {
	handlingDropDownOption("BirthYear_XPATH", "XPATH", "SelectByValue", "1995");
	Reporter.log("Year has been selected from the DOB Dropdown");
		}
		catch(Exception e) {
			Reporter.log("Year has not been selected from the DOB Dropdown");
			Assert.fail();
		}
}
	
	

}
