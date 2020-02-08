package p1;

import org.openqa.selenium.WebDriver;

public class SearchOption extends ReusableLib {

	public SearchOption(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	
	public void clickOnRoundTrip() {
		clickOnElement("RoundTrip_Xpath", "xpath");
	}
	public void clickOnOneTrip() {
		clickOnElement("OneWay_Xpath", "xpath");
	}
	public void clickDownArrowOfStartPoint() {
		clickOnElement("FromArrowButton_Xpath", "xpath");
	}
	public void clickOnStartPoint() {
		clickOnElement("From_Xpath", "xpath");
	}
	public void clickOnDestinationPoint() {
		clickOnElement("To_Xpath", "xpath");
	}
	public void clickOnDepartDate() {
		clickOnElement("DepartDate_Xpath", "xpath");
	}
	public void clickOnReturnDateCalender() {
		clickOnElement("ReturnDateCal_Xpath", "xpath");
	}
	public void clickOnReturnDate() {
		clickOnElement("ReturnDate_Xpath", "xpath");
	}
	public void clickOnPassengerChooseButton() {
		clickOnElement("PassengersButton_Xpath", "xpath");
	}
	public void clickOnAdultSelectButton() {
		try {
			dropDownList("AdultDropDown_Xpath", "xpath","2");
		} 
		catch (Throwable e) {
			e.printStackTrace();
		}
	}
	public void clickOnSearchOption() {
		clickOnElement("SearchButton_Xpath", "xpath");
	}
	

}
