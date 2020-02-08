package p1;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.google.common.io.Files;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import org.apache.commons.io.FileUtils;

public class SpiceJet {
	
	WebDriver driver=null;
	static String Browser="firefox";
	ExtentReports report;
	ExtentTest test;

	public SpiceJet() {
		// TODO Auto-generated constructor stub
	}
	
	@BeforeClass
	public void reports() {
		report = new ExtentReports("C:\\Users\\rohit\\eclipse-workspace\\FireandSecuity\\test-output\\Reports\\reportdata.html");
	}
	
	@BeforeMethod
	public void getBrowser() {
		BrowserFactory br=new BrowserFactory();
		driver=br.browserLaunch(Browser);
		driver.get("https://www.spicejet.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void searchOperation() throws Throwable {
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@id='ctl00_mainContent_ddl_originStation1_CTXTaction']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()=' Hyderabad (HYD)']")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//span[@id='ctl00_mainContent_ddl_destinationStation1_CTXTaction']")).click();
		//Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@text='Goa (GOI)'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//td[@data-month='10']//a[text()=28]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='picker-second']//button[@class='ui-datepicker-trigger']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//td[@data-month='11']//a[text()='2']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		Thread.sleep(3000);
		Select sc=new Select(driver.findElement(By.xpath("//select[@name='ctl00$mainContent$ddl_Adult']")));
		sc.selectByVisibleText("2");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='ctl00$mainContent$btn_FindFlights']")).click();
		File screen=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screen, new File("C:\\Users\\rohit\\eclipse-workspace\\Practice\\test-output\\screenshot.png"));
	}
}
