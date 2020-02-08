package com.demoguru99.Guru99Bank.PageObjects;



import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.demoguru99.Guru99Bank.Browser.AppConstants;
import com.demoguru99.Guru99Bank.ReusableActionLib.ReusableActionLib;


import junit.framework.Assert;

public class PageLogin extends ReusableActionLib {

	public PageLogin(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
	}
	
	public void EnterUsername(String username) {

		try {

			InputTextOnElement("LoginEmail_Xpath", "XPATH",username );
		}

		catch (Exception e) {
			Assert.fail();
		}
	}
	
	public void EnterPassword(String Password) {

		try {

			InputTextOnElement("LoginPassword_Xpath", "XPATH", Password);
		}

		catch (Exception e) {
			Assert.fail();
		}
	}
	
	public void clickOnLOginButton() {
		try {
			clickonElement("LoginButton_Xpath", "XPATH");
		}

		catch (Exception e) {
			Assert.fail();
		}
	}
	
	public void launchURL() throws IOException {
		String URL=	ConfigParameter("URL");
		

			driver.get(URL);
			
	} 
	
	public void verificationOfLogin() {
		EnterUsername(AppConstants.Username);
		EnterPassword(AppConstants.Password);
		clickOnLOginButton();
		
	}
	
	

}
