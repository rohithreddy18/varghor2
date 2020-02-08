import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestBrowser {

	public static void main(String[] args) {
	
		WebDriver driver;
		
		String browser = "chrome";
		
		if(browser=="chrome") {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\rohit\\Desktop\\Browsers\\chromedriver.exe");
			ChromeOptions options=new ChromeOptions();

			driver=new ChromeDriver(options);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("www.google.com/intl/en-GB/gmail/about/#");
			driver.manage().window().maximize();
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click()", driver.findElement(By.xpath("//li[@class='h-c-header__cta-li g-mail-nav-links--mobile  link--last']/a[text()[normalize-space()='Sign in']]")));
			
			Set<String> allwindows=driver.getWindowHandles();
			System.out.println(allwindows.size());
			Iterator<String> itr=allwindows.iterator();
			//String parentwindow=itr.next();
			//String childwindow =itr.next();
			//driver.switchTo().window(childwindow);
			
			while(itr.hasNext()){
				String item=itr.next();
				
				driver.switchTo().window(item);
				System.out.println(driver.getWindowHandle());
				break;
			}
			
			WebDriverWait wait = new WebDriverWait(driver,20);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='email']"))).sendKeys("rohith17.reddy@gmail.com");
		}
	}
	
}
