import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class BrowserData {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
System.setProperty("webdriver.chrome.driver", "C:\\Users\\rohit\\Desktop\\Browsers\\chromedriver.exe");
		
		ChromeOptions options=new ChromeOptions();
		driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		String b=driver.getTitle();//div[@class='_ihd _3ma mbs _6n _6s _6v']
		System.out.println(b);
		String a=driver.findElement(By.xpath("//input[@name='firstname']")).getAttribute("aria-label");
		System.out.println(a);
		
		//System.out.println(driver.findElement(By.xpath("//div[@class='mbs _52lq fsl fwb fcb']/span")).getText());
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("//a[@title='Take a look at Instagram']")).click();
		
		
		Set<String> windowhandles=driver.getWindowHandles();
		System.out.println(windowhandles.size());
		
		/*//Using Iterator
		Iterator<String> itr=windowhandles.iterator();
		
		
		System.out.println(itr.hasNext());
		
		while(itr.hasNext()){
			String item=itr.next();
			
			driver.switchTo().window(item);
			System.out.println(driver.getWindowHandle());
			break;
			
		}*/
		
		
		
		//Using for -each loop
		
	String currentwindow=	driver.getWindowHandle();
	for(String tab:windowhandles) {
		
		if(tab.equals(currentwindow)) {
			
		}
		else {
			driver.switchTo().window(tab);
			break;
		}
		
	}
	
		
		
		
	System.out.println(driver.getTitle());
	
	
	driver.navigate().to("https://portal.hdfc.com/campaign/new");
	System.out.println(driver.findElements(By.xpath("//select[@name='type_of_loa']")).size());
	System.out.println("Find elemenets check is passed");
	Select sel=new Select(driver.findElement(By.xpath("//select[@name='type_of_loan']")));
	//driver.findElements(By.xpath("//select[@name='type_of_loan']"));
	sel.selectByIndex(3);
	sel.selectByValue("IMP");
	
	
	
	List<WebElement> allopts=sel.getOptions();
	System.out.println(allopts.size());
	for(int i=0;i<allopts.size();i++) {
		System.out.println(allopts.get(i).getText());
		
		
		
	}
	
	System.out.println(sel.getFirstSelectedOption().getText());

	//sel.deselectByValue("IMP");
	
	
	Thread.sleep(30000);
	driver.navigate().refresh();
	Thread.sleep(9000);
	driver.navigate().back();
	
	
	
	
	
	/*sel.selectByVisibleText("1");
	sel.selectByValue("HOU");*/
	
		
		
		//System.out.println(driver.getWindowHandle());
	
	}

}
