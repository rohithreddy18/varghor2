package com.demoguru99.Guru99Bank.Browser;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import com.demoguru99.Guru99Bank.ReusableActionLib.ReusableActionLib;

public class BrowserFactory extends ReusableActionLib {
	
	public WebDriver driver;

	public BrowserFactory(WebDriver driver) {
		super(driver);
		//this.driver=driver;
		// TODO Auto-generated constructor stub
	}
	
	public WebDriver getbrowser(String browser) throws IOException {
		
		browser = ConfigParameter(browser);
		
		if(browser.equalsIgnoreCase("chrome")) {
			System.out.println(System.getProperty("user.dir"));
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\java\\Drivers\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			driver= new ChromeDriver(options);
		}
		
		else {
			System.out.println(System.getProperty("user.dir"));
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\src\\test\\java\\Drivers\\geckodriver.exe");
			FirefoxOptions options=new FirefoxOptions();
			
			driver=new FirefoxDriver(options);
		}
		
		return driver;
		
	}
	
	
	
	
	
}
