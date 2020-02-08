import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserExp {


	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		
		String browser ="chrome";
		// TODO Auto-generated method stub
		
		if(browser.equals("chrome")) {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\rohit\\Desktop\\Browsers\\chromedriver.exe");
		
		
/*DesiredCapabilities caps=DesiredCapabilities.chrome();
System.out.println(caps.getBrowserName());*/

ChromeOptions options=new ChromeOptions();

	driver=new ChromeDriver(options);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("www.google.com/intl/en-GB/gmail/about/#");
		driver.manage().window().maximize();
		
	Thread.sleep(5000);
	
	
	
	//WebElement   signin=	driver.findElement(By.xpath("//li[@class='h-c-header__cta-li g-mail-nav-links--mobile  link--last']/a[text()[normalize-space()='Sign in']]"));
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();" ,driver.findElement(By.xpath("//li[@class='h-c-header__cta-li g-mail-nav-links--mobile  link--last']/a[text()[normalize-space()='Sign in']]")));
		
		
		
		//driver.findElement(By.xpath("//li[@class='h-c-header__cta-li g-mail-nav-links--mobile  link--last']/a[text()[normalize-space()='Sign in']]")).click();
	//	Thread.sleep(000);
		
		Set<String> allwindows=driver.getWindowHandles();
		System.out.println(allwindows.size());
		Iterator<String> itr=allwindows.iterator();
		String parentwindow=itr.next();
		String childwindow =itr.next();
		driver.switchTo().window(childwindow);
		
		
		
		
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='email']"))).sendKeys("rohith17.reddy@gmail.com");
		
		/*driver.findElement(By.xpath("//input[@type='email']")).click();
		driver.findElement(By.xpath("//input[@type='email']"))
		.sendKeys("rohith17.reddy@gmail.com");*/
		
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		
		Thread.sleep(8000);
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Sunny$1994");
		
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(8000);
		
		driver.close();
	}
	
	else {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\rohit\\Desktop\\Browsers\\geckodriver.exe");
		
		FirefoxOptions options=new FirefoxOptions();
		
		driver=new FirefoxDriver(options);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://www.google.com/intl/en-GB/gmail/about/#");
			driver.manage().window().maximize();
			
		Thread.sleep(5000);
		
		
		
		//WebElement   signin=	driver.findElement(By.xpath("//li[@class='h-c-header__cta-li g-mail-nav-links--mobile  link--last']/a[text()[normalize-space()='Sign in']]"));
			
			JavascriptExecutor js=(JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();" ,driver.findElement(By.xpath("//li[@class='h-c-header__cta-li g-mail-nav-links--mobile  link--last']/a[text()[normalize-space()='Sign in']]")));
			
			

			
			
		
			
			//driver.findElement(By.xpath("//li[@class='h-c-header__cta-li g-mail-nav-links--mobile  link--last']/a[text()[normalize-space()='Sign in']]")).click();
		//	Thread.sleep(000);
			
			Set<String> allwindows=driver.getWindowHandles();
			System.out.println(allwindows.size());
			Iterator<String> itr=allwindows.iterator();
			String parentwindow=itr.next();
			String childwindow =itr.next();
			driver.switchTo().window(childwindow);
			
			
			
			WebDriverWait wait=new WebDriverWait(driver,20);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='email']"))).sendKeys("rohith17.reddy@gmail.com");
			
			/*driver.findElement(By.xpath("//input[@type='email']")).click();
			driver.findElement(By.xpath("//input[@type='email']"))
			.sendKeys("rohith17.reddy@gmail.com");*/
			
			driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
			
			Thread.sleep(8000);
			
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Sunny$1994");
			
			driver.findElement(By.xpath("//span[text()='Next']")).click();

		
	}
}}
