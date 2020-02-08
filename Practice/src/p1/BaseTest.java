package p1;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class BaseTest {

	public BaseTest() {
		// TODO Auto-generated constructor stub
	}
	
	WebDriver driver=null;
	ExtentReports reports;
	ExtentTest test;
	
	@BeforeClass
	public void declareReports() {
		reports=new ExtentReports("C:\\Users\\rohit\\eclipse-workspace\\Practice\\test-output\\ExtReports\\reportss.html");
	}
	
	@BeforeMethod
	@Parameters({"browser"})
	public void getBrowser(String browser) {
		System.out.println(browser);
		BrowserFactory br=new BrowserFactory();
		driver=br.browserLaunch(browser);
		driver.get("https://www.spicejet.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void testCase01_Search() throws Throwable {
		reports.startTest("testCase01_Search");
		SearchOption so=new SearchOption(driver);
		so.clickOnRoundTrip();
		test.log(LogStatus.PASS, "Clicked on roundtrip button");
		so.clickOnOneTrip();
		test.log(LogStatus.PASS, "Clicked on onetrip button");
		so.clickOnRoundTrip();
		test.log(LogStatus.PASS, "Clicked on roundtrip button");
		so.clickDownArrowOfStartPoint();
		test.log(LogStatus.PASS, "Clicked on start point select button");
		so.clickOnStartPoint();
		test.log(LogStatus.PASS, "Clicked on starting point");
		so.clickOnDestinationPoint();
		test.log(LogStatus.PASS, "Clicked on destination point");
		so.clickOnDepartDate();
		test.log(LogStatus.PASS, "selected the departure date");
		so.clickOnReturnDateCalender();
		test.log(LogStatus.PASS, "Clicked on return date calender");
		so.clickOnReturnDate();
		test.log(LogStatus.PASS, "Selected the return date");
		so.clickOnPassengerChooseButton();
		test.log(LogStatus.PASS, "Clicked on passenger select option");
		so.clickOnAdultSelectButton();
		test.log(LogStatus.PASS, "Clicked on Adults select button");
		so.clickOnSearchOption();
		test.log(LogStatus.PASS, "Clicked on Search button");
		File sc=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sc, new File("C:\\Users\\rohit\\eclipse-workspace\\Practice\\test-output\\Screen\\shot.pnj"));
		
	}
	@AfterTest
	public void closeTest() {
		
	}
	@AfterClass
	public void closeReports() {
		reports.flush();
	}
}
