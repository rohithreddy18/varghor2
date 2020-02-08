package Pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class BrowserFunction {

	public BrowserFunction(WebDriver driver) {
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	WebDriver driver;
	public WebDriver launchbrowser(String browser) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			System.out.println(System.getProperty("user.dir"));
			System.setProperty("webdriver.chrome.driver","C:\\Users\\rohit\\eclipse-workspace\\New\\src\\Pack1\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			driver=new ChromeDriver(options);
			
		}
		
		else if(browser.equalsIgnoreCase("firefox")) {
			System.out.println(System.getProperty("user.dir"));
			System.setProperty("webdriver.chrome.driver","C:\\Users\\rohit\\eclipse-workspace\\New\\src\\Pack1\\geckodriver.exe");
			FirefoxOptions options = new FirefoxOptions();
			driver=new FirefoxDriver(options);
		}
		else {
			System.out.println("please specify the browser correctly");
		}
		
		return driver;
	}

}
