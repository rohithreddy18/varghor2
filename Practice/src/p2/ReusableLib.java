package p2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ReusableLib {

	public ReusableLib(WebDriver driver) {
		this.driver=driver;
	}
	WebDriver driver;
	
	public String readObject(String parameter) throws Throwable {
		
		FileInputStream fis=new FileInputStream("C:\\Users\\rohit\\eclipse-workspace\\Practice\\src\\p2\\ObjectRepository.properties");
		Properties pr=new Properties();
		pr.load(fis);
		return pr.getProperty(parameter);
	}
	
	public WebElement findElement(String Object,String Locator) throws Throwable {
		
		
		String path=readObject(Object);
		if(Locator.equalsIgnoreCase("Xpath")) {
			return driver.findElement(By.xpath(path));
		}
		else if(Locator.equalsIgnoreCase("cssSelector")) {
			return driver.findElement(By.xpath(path));
		}
		else {
			return null;
		}
	}
	
	public void dropDownList(String Object,String Locator,String Value) throws Throwable {
		Select sc=new Select(findElement(Object,Locator));
		sc.selectByVisibleText(Value);
	}
	
	public void clickOnElement(String Object,String Locator) {
		try {
			findElement(Object, Locator).click();
		} 
		catch (Throwable e) {
			
			e.printStackTrace();
		}
	}
	

}
