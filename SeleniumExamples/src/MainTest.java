import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainTest {

	
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=null;
		
		
		BrowserFactory bf=new BrowserFactory(driver);
		driver=bf.getBrowser();
		
		
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		/*driver.get("https://www.google.com/intl/en-GB/gmail/about/#");
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
		
		driver.findElement(By.xpath("//input[@type='email']")).click();
		driver.findElement(By.xpath("//input[@type='email']"))
		.sendKeys("rohith17.reddy@gmail.com");
		
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		
		Thread.sleep(8000);
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Sunny$1994");
		
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(8000);*/
		
		//Frame handling
		/*driver.get("https://timesofindia.indiatimes.com/");
	
		
		Thread.sleep(90000);
		
		
		List<WebElement> frames =driver.findElements(By.xpath("//iframe"));
		System.out.println(frames.size());
		//driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='google_ads_iframe_/7176/TOI/TOI_Home/TOI_Home_Home_New/TOI_HP_NW_ATF_300_0']")));
		Thread.sleep(9000);
		driver.switchTo().frame(1);
		
		System.out.println(driver.getTitle());
		try {
		driver.findElement(By.xpath("//div[@id='google_image_div']")).click();
		}
		catch(Exception e){
			System.out.println("Exception thrown for frame");
			e.printStackTrace();
		
		}
		driver.switchTo().defaultContent();*/
		
		//WebBased Alert Handling
		
		/*driver.get("https://retail.onlinesbi.com/retail/login.htm");
		driver.findElement(By.xpath("//a[text()='CONTINUE TO LOGIN']")).click();
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("testing");
		driver.findElement(By.xpath("//input[@title='Login']")).click();
		Thread.sleep(12000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Testingpassword");
*/		
		// click, Double click,send keys methods in action class
		
		/*driver.get("https://retail.onlinesbi.com/retail/login.htm");
		
		WebElement login=driver.findElement(By.xpath("//a[text()='CONTINUE TO LOGIN']"));
		Actions action=new Actions (driver);
		
		action.moveToElement(login).click().build().perform();
		Thread.sleep(5000);
		action.moveToElement(driver.findElement(By.xpath("//input[@name='userName']"))).sendKeys("testing").build().perform();
		Thread.sleep(5000);
		action.moveToElement(driver.findElement(By.xpath("//input[@title='Login']"))).doubleClick().build().perform();
		Thread.sleep(5000);*/
		
		//Right click on the element
		
		/*Actions action=new Actions (driver);
		driver.get("https://www.google.com/");
		action.moveToElement(driver.findElement(By.xpath("//img[@alt='Google']"))).contextClick().build().perform();
		Thread.sleep(5000);*/
		
		driver.get("https://www.moneycontrol.com/");
		Actions action=new Actions (driver);

		
		action.moveToElement(driver.findElement(By.xpath("//div[@class='toplinks1']/a[text()='Stocks']"))).clickAndHold().release(driver.findElement(By.xpath("//div[@class='searchBox clearfix FL']/div/form/input[@id='search_str']"))).build().perform();
		action.dragAndDrop(driver.findElement(By.xpath("//div[@class='toplinks1']/a[text()='Stocks']")), driver.findElement(By.xpath("//div[@class='searchBox clearfix FL']/div/form/input[@id='search_str']"))).build().perform();
		Thread.sleep(5000);
		
		
		
		
		//action.moveByOffset(788, 801).click().build().perform();
		
		//System.out.println(driver.findElement(By.xpath("//a[text()='CONTINUE TO LOGIN']")).getLocation());
		
				
		driver.quit();
		
	}
	
	

}
