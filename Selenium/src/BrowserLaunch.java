import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserLaunch {
	static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rohit\\Desktop\\Browsers\\chromedriver.exe");
		
		ChromeOptions options=new ChromeOptions();
		driver=new ChromeDriver(options);
		driver.get("https://google.com");
		String title=driver.getTitle();
		//assert
		
		
	}

}
