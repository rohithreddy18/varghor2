package com.infosys.FireandSecurity.PageObjects;

import org.openqa.selenium.WebDriver;

import com.infosys.FireandSecurity.ReusableActionLib.ReusableActionlib;

import junit.framework.Assert;

public class ForgotPassword extends ReusableActionlib {
	
	public WebDriver driver;

	public ForgotPassword(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
		this.driver=driver;
	}
	
	public void clickOnForgotPassword() {
		
		try {
			clickOnElement("ForgettenScreenUser_XPATH","XPATH");
		}
		catch(Exception e) {
			Assert.fail();
		}
	}

}
