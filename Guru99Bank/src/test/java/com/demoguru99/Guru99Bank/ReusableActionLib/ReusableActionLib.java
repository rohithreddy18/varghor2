package com.demoguru99.Guru99Bank.ReusableActionLib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReusableActionLib {

	public WebDriver driver;
	public ReusableActionLib(WebDriver driver) {
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}
	
	public void clickonElement(String Object,String ObjectType) {
		
		findElement(Object,ObjectType).click();
	}
	
	public boolean isElementDisplayed(String Object,String ObjectType) {
		
		try {
			
			return findElement(Object, ObjectType).isDisplayed();
			
		}
		catch(Exception e) {
			
			return false;
		
		}
		
	}
	
	public void InputTextOnElement(String Object,String ObjectType, String inputText) {
		
		try {
			
			findElement(Object, ObjectType).sendKeys(inputText);
			
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
		
	}
	
	public String ConfigParameter(String ConfigParameter) throws IOException {
		
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\rohit\\eclipse-workspace\\Guru99Bank\\src\\test\\java\\com\\demoguru99\\Guru99Bank\\Base\\config.properties");
			
			Properties pr = new Properties();
			pr.load(fis);
			return pr.getProperty(ConfigParameter);
		} 
		
		
		
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	public WebElement findElement(String Object,String ObjectType) {
		String elementvalue=readObject(Object);
		//input[@id='email']
		
		
		if(ObjectType.equalsIgnoreCase("ID")) {
			return driver.findElement(By.id(elementvalue));
		}
		else if (ObjectType.equalsIgnoreCase("name")) {
			return driver.findElement(By.name(elementvalue));
		}
		else if (ObjectType.equalsIgnoreCase("class")) {
			return driver.findElement(By.className(elementvalue));
		}
		else if (ObjectType.equalsIgnoreCase("Linktext")) {
			return driver.findElement(By.linkText(elementvalue));
		}
		else if (ObjectType.equalsIgnoreCase("Partiallinktext")) {
			return driver.findElement(By.partialLinkText(elementvalue));
		}
		else if (ObjectType.equalsIgnoreCase("CSS selector")) {
			return driver.findElement(By.cssSelector(elementvalue));
		}
		
		else if (ObjectType.equalsIgnoreCase("XPATH")) {
			return driver.findElement(By.xpath(elementvalue));
		}
		return null;
	}
	
	public String readObject(String Objectproperty ) {
		
		try {
		
		FileInputStream fis=new FileInputStream("C:\\Users\\rohit\\eclipse-workspace\\Guru99Bank\\src\\test\\java\\com\\demoguru99\\Guru99Bank\\ObjectRepository\\ObjectRepository.properties");
		Properties  pr=new Properties ();
		pr.load(fis);
		return  pr.getProperty(Objectproperty); 
		}
		catch(Exception e) {
			return null;
		}
		
	}
	
	/*public String ConfigLink(String Link) throws IOException {
		
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\rohit\\eclipse-workspace\\Guru99Bank\\src\\test\\java\\com\\demoguru99\\Guru99Bank\\Base\\config.properties");
			Properties pr = new Properties();
			pr.load(fis);
			return pr.getProperty(Link);
		} 
		
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	} */
}
