package com.infosys.FireandSecurity.ReusableActionLib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class ReusableActionlib {
	
	public WebDriver driver;

	public ReusableActionlib(WebDriver driver) {
		
		this.driver=driver;
		
		// TODO Auto-generated constructor stub
	}
	
	public void handlingDropDownOption(String Object, String ObjectType, String dropvalType, String Value) {
		try {
			WebElement dropdown = findElement(Object, ObjectType);
			Select sel = new Select(dropdown);

			if (dropvalType.equalsIgnoreCase("Index")) {

				int index = Integer.parseInt(Value);
				sel.selectByIndex(index);
			} else if (dropvalType.equalsIgnoreCase("value")) {
				sel.selectByValue(Value);
			}

			else {
				sel.selectByVisibleText(Value);
			}

		} catch (Exception e) {
			Assert.fail();
			e.printStackTrace();
		}

	}
	
	public void clickOnElement(String Object,String ObjectType) {
		
		try {
			
			findElement(Object, ObjectType).click();
			
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
		
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
		
		FileInputStream fis=new FileInputStream("C:\\Users\\rohit\\eclipse-workspace\\FireandSecuity\\src\\test\\java\\com\\infosys\\FireandSecurity\\ObjectRepo\\ObjectRepostories.properties");
		Properties  pr=new Properties ();
		pr.load(fis);
		return  pr.getProperty(Objectproperty); 
		}
		catch(Exception e) {
			return null;
		}
		
	}
	
	
	public String configparameter(String configParmeter) {

		try {

			FileInputStream fis = new FileInputStream(
					"C:\\Users\\rohit\\eclipse-workspace\\FireandSecuity\\src\\test\\java\\com\\infosys\\FireandSecurity\\Base\\config.properties");
			Properties pr = new Properties();
			pr.load(fis);
			return pr.getProperty(configParmeter);
		} catch (Exception e) {
			return null;
		}

	}

}
