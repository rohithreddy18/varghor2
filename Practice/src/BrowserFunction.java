import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class BrowserFunction {
	
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		String browser = "chrome";


		if(browser=="chrome") {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\rohit\\Desktop\\Browsers\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			driver= new ChromeDriver(options);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://www.google.com/intl/en-GB/gmail/about/#");
			driver.manage().window().maximize();
			//driver.findElement(By.xpath("//li[@class='h-c-header__cta-li g-mail-nav-links--mobile  link--last']/a[@class='h-c-header__nav-li-link ']")).click();
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", driver.findElement(By.xpath("//li[@class='h-c-header__cta-li g-mail-nav-links--mobile  link--last']/a[@class='h-c-header__nav-li-link ']")) );
			Set<String> all = driver.getWindowHandles();
			Iterator<String> itr = all.iterator();
			while (itr.hasNext()){
				String item = itr.next();
				driver.switchTo().window(item);
				
			}
			
			
			driver.findElement(By.xpath("//input[@type='email']")).sendKeys("rohith18.reddy@gmail.com");
			driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
			
			Thread.sleep(8000);
			
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("sunny1994");
			driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
			
		
			driver.findElement(By.xpath("//div[@class='J-J5-Ji J-JN-M-I-Jm']/div[@class='G-asx T-I-J3 J-J5-Ji']")).click();
			driver.findElement(By.xpath("//div[text()='Unread']")).click();
			
			
			/*Select sel = new Select(driver.findElement(By.xpath("//div[@class='J-J5-Ji J-JN-M-I-Jm']/div[@class='G-asx T-I-J3 J-J5-Ji']")));
			sel.selectByIndex(3);
			System.out.println(driver.getTitle());*/
			
	
			
		}
	}
}
