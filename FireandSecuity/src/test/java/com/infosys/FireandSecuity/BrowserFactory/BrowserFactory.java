package com.infosys.FireandSecuity.BrowserFactory;
import java.io.FileNotFoundException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

import com.infosys.FireandSecurity.ReusableActionLib.ReusableActionlib;

public  class BrowserFactory extends ReusableActionlib{
	
	//String browser="chrome";
	
	
String URL="https://rohithreddy:015ddc85-26b9-44ab-a549-481cfd2abb1e@ondemand.saucelabs.com:443/wd/hub";
	
	 public WebDriver driver;

	public BrowserFactory(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	

	
	
	public WebDriver getBrowser(String browser, String platform) {
		
	browser =configparameter(browser);
	
	String [] browserdetails=browser.split("_");
	browser=browserdetails[0];
String	browserversion =browserdetails[1];
		
		if(browser.equalsIgnoreCase("chrome")) {
			System.out.println(System.getProperty("user.dir"));
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\java\\Drivers\\chromedriver.exe");
			/*ChromeOptions options=new ChromeOptions();
			
			MutableCapabilities sauceOptions = new MutableCapabilities();
*/
			ChromeOptions browserOptions = new ChromeOptions();
			browserOptions.setExperimentalOption("w3c", true);
			browserOptions.setCapability("platformName", platform);
			browserOptions.setCapability("browserVersion", browserversion);
		
			
			
			driver=new ChromeDriver(browserOptions);
			
			//RemoteWebDriver(URL));
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			System.out.println(System.getProperty("user.dir"));
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\src\\test\\java\\Drivers\\geckodriver.exe");
			
			FirefoxOptions options=new FirefoxOptions();
			
			driver=new FirefoxDriver(options);

		}
		else {
			System.out.println(System.getProperty("user.dir"));
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\src\\test\\java\\Drivers\\geckodriver.exe");
			InternetExplorerOptions options=new InternetExplorerOptions();
			driver=new InternetExplorerDriver(options);
		}
		return driver;
	}
	

}
