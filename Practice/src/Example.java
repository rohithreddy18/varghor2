import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Example {

	public Example() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		String browser = "chrome";
		if(browser.equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\rohit\\Desktop\\Browsers\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			driver = new ChromeDriver(options);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://www.google.com/intl/en-GB/gmail/about/#");
			driver.manage().window().maximize();
			
			JavascriptExecutor js=(JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", driver.findElement(By.xpath("//li[@class='h-c-header__cta-li g-mail-nav-links--mobile  link--last']/a[text()[normalize-space()='Sign in']]")));
			
			Set<String> allwindows =driver.getWindowHandles();
			Iterator<String> itr=allwindows.iterator();
			while(itr.hasNext()){
				//itr.next();
				driver.switchTo().window(itr.next());
				
				}
			WebDriverWait wait = new WebDriverWait(driver,20);
			WebElement test=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='email']")));
			test.sendKeys ("9000833693");
			

			driver.findElement(By.xpath("//input[@type='email']")).sendKeys("rohith18.reddy@gmail.com");
			driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
			
			Thread.sleep(8000);
			
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("sunny1994");
			
			driver.findElement(By.xpath("//span[text()='Next']")).click();
				
			}
		}

	}


