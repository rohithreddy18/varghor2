package Pack1;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Gmail {
	
	public Gmail() {
		// TODO Auto-generated constructor stub
	}

	//public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		

	//}//
	String BName = "Chrome";
	
	WebDriver driver;
	@BeforeMethod
	public void browseroperation() {
		BrowserFunction bf=new BrowserFunction(driver);
		driver=bf.launchbrowser(BName);
		driver.get("https://www.google.com/intl/en-GB/gmail/about/#");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@Test
	public void login() throws Throwable {
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",driver.findElement(By.xpath("//li[@class='h-c-header__cta-li g-mail-nav-links--mobile  link--last']//a[contains(text(),'Sign in')]")));
		
		//driver.findElement(By.xpath("//li[@class='h-c-header__cta-li g-mail-nav-links--mobile  link--last']//a[contains(text(),'Sign in')]")).click();
		
		Set<String> all = driver.getWindowHandles();
		System.out.println(all.size());
		Iterator<String> itr = all.iterator();
		while(itr.hasNext()) {
			driver.switchTo().window(itr.next());
		}
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='email']")));
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("rohith18.reddy@gmail.com");
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("sunny1994");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3']")).click();
		Thread.sleep(5000);
		driver.switchTo().frame("oauth2relay362647134");
		driver.findElement(By.xpath("//div[@class='aoD hl']")).sendKeys("rohith18.reddy@gmail.com");
		driver.findElement(By.xpath("//input[@name='subjectbox']")).sendKeys("Test1");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji aoO v7 T-I-atl L3']")).click();
	}

}
