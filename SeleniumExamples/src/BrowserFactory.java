import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class BrowserFactory {
	
	String browser="chrome";
	
	 WebDriver driver;

	public BrowserFactory(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebDriver getBrowser() {
		
		if(browser.equalsIgnoreCase("chrome")) {
			System.out.println(System.getProperty("user.dir"));
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\Drivers\\chromedriver.exe");
			ChromeOptions options=new ChromeOptions();
			driver=new ChromeDriver(options);

		}
		else {
			System.out.println(System.getProperty("user.dir"));
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\src\\Drivers\\geckodriver.exe");
			
			FirefoxOptions options=new FirefoxOptions();
			
			driver=new FirefoxDriver(options);

		}
		return driver;
	}
	

}
