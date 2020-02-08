package p1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class BrowserFactory {
	
	WebDriver driver;

	public BrowserFactory() {
		// TODO Auto-generated constructor stub
	}
	
	public WebDriver browserLaunch(String browser) {
		if(browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\rohit\\eclipse-workspace\\Practice\\src\\p1\\chromedriver.exe");
			ChromeOptions co=new ChromeOptions();
			driver=new ChromeDriver(co);
			return driver;
		}
		else if(browser.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\rohit\\eclipse-workspace\\Practice\\src\\p1\\geckodriver.exe");
			FirefoxOptions fo=new FirefoxOptions();
			driver=new FirefoxDriver(fo);
			return driver;
		}
		else {
			System.out.println("enter the browser name correctly");
			return null;
		}
	}
}
