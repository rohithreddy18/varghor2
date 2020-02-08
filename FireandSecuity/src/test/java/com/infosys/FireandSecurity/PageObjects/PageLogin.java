package com.infosys.FireandSecurity.PageObjects;

import org.openqa.selenium.WebDriver;

import com.infosys.FireandSecuity.BrowserFactory.AppConstants;
import com.infosys.FireandSecurity.ReusableActionLib.ReusableActionlib;

import junit.framework.Assert;

public class PageLogin extends ReusableActionlib {
	
	public WebDriver driver;

	public PageLogin(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	
	public void EnterUsername(String username) {

		try {

			InputTextOnElement("LoginEmail_XPATH", "XPATH",username );
		}

		catch (Exception e) {
			Assert.fail();
		}
	}

	public void EnterPassword(String Password) {

		try {

			InputTextOnElement("LoginPassword_XPATH", "XPATH", Password);
		}

		catch (Exception e) {
			Assert.fail();
		}
	}

	public void clickOnLOginButton() {
		try {
			clickOnElement("Loginbutton_XPATH", "XPATH");
		}

		catch (Exception e) {
			Assert.fail();
		}
	}
	
	public void launchURL() {
	String URL=	configparameter("URL");
	

		driver.get(URL);
	
	}
	
	public void fbtitlevalidation() {

		try {

			if (isElementDisplayed("FacebookImage_XPATH", "XPATH") == true) {

			} else {
				Assert.fail();
			}
		} catch (Exception e) {

		}
	}
	
	public void verificationOfLogin() {
		EnterUsername(AppConstants.Username);
		EnterPassword(AppConstants.password);
		clickOnLOginButton();
		
	}
	
	public void verificationOfLogin(String Username, String Password) {
		EnterUsername(Username);
		EnterPassword(Password);
		clickOnLOginButton();
		
	}
	
	
	public void verificationOfLogin(String Username) {
		EnterUsername(Username);
		EnterPassword("Dev");
		clickOnLOginButton();
		
	}
	

}
