package p2;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo1 {

	public Demo1() {
		// TODO Auto-generated constructor stub
	}
	static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rohit\\eclipse-workspace\\Practice\\src\\p2\\chromedriver.exe");
		
		ChromeOptions options=new ChromeOptions();
		driver=new ChromeDriver(options);
		driver.get("https://google.com");
		String title=driver.getTitle();
		assertEquals(title, "Google");
}
}