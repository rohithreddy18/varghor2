package Work2;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DateDemo {

	public DateDemo() {
		// TODO Auto-generated constructor stub
	}
	static WebDriver driver;
	
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rohit\\eclipse-workspace\\New\\src\\Work2\\chromedriver.exe");
		ChromeOptions Options=new ChromeOptions();
		driver=new ChromeDriver(Options);
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		String val= driver.findElement(By.xpath("//span[@id='view_fulldate_id_1']")).getText();
		SimpleDateFormat formatter4=new SimpleDateFormat("E, MMM dd yyyy");
		SimpleDateFormat formatter1=new SimpleDateFormat("dd/MM/yyyy");
		Date selectedDate= formatter4.parse(val);
		
	}
}
