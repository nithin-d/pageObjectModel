package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class HotelPage extends GenericWrappers{
	
	public HotelPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
	
	public HotelPage waitsec(int time) {
		waitProperty(time);
		return this;
		
	}
	
	public HotelPage switchWindow() {
		switchToLastWindow();
		return this;
		
	}
	public LoginPage clickOnLogin() {
		clickByXpath(prop.getProperty("HotelPage.Login.XPath"));
		return new LoginPage(driver,test);
	}
	
	public HotelPage EnterCityOrHotelName(String data) {
		enterByXpath(prop.getProperty("HotelPage.CityOrHotelName.XPath"), data);
		return this;
	}
	
	public HotelPage clickOnRequiredHotelName(String value) {
		
		clickByXpath(prop.getProperty("HotelPage.RequiredHotelName.XPath"),value);
		//clickByXpath("//span[text()='"+value+"']/..");
		return this;
	}
	
	public HotelPage clickOnCheckIn() {
		clickByXpath(prop.getProperty("HotelPage.CheckIn.XPath"));
		return this;
	}
	
	public HotelPage clickOnCheckInDateDropdown() {
		
		clickByXpath(prop.getProperty("HotelPage.CheckInDateDropdown.XPath"));
		return this;
	}
	
	public HotelPage clickOnCheckInDateYear(String value) {
		
		clickByXpath(prop.getProperty("HotelPage.CheckInDateYear.XPath"),value);
		//clickByXpath("//span[text()='"+year+"']");
		return this;
	}
	
	public HotelPage clickOnCheckInDateMonth(String value) {
		clickByXpath(prop.getProperty("HotelPage.CheckInDateMonth.XPath"),value);
		//clickByXpath("//span[text()='"+month+"']");
		return this;
	}
	
	public HotelPage clickOnCheckInDate(String value) {
		clickByXpath(prop.getProperty("HotelPage.CheckInDate.XPath"),value);
		//clickByXpath("//span[text()='"+date+"']");
		return this;
	}
	
	public HotelPage clickOnCheckOut() {
	
		clickByXpath(prop.getProperty("HotelPage.CheckOut.XPath"));
		return this;
	}
	
	public HotelPage clickOnCheckOutDropdown() {
		
		clickByXpath(prop.getProperty("HotelPage.CheckOutDateDropdown.XPath"));
		return this;
	}
	
	public HotelPage clickOnCheckOutYear(String value) {
		//clickByXpath("//span[text()='"+year+"']");
		clickByXpath(prop.getProperty("HotelPage.CheckOutDateYear.XPath"),value);
		return this;
	}
	
	public HotelPage clickOnCheckOutMonth(String value) {
		//clickByXpath("//span[text()='"+month+"']");
		clickByXpath(prop.getProperty("HotelPage.CheckOutDateMonth.XPath"),value);
		return this;
	}
	
	public HotelPage clickOnCheckOutDate(String value) {
		clickByXpath(prop.getProperty("HotelPage.CheckOutDate.XPath"),value);
		//clickByXpath("//span[text()='"+date+"']");
		return this;
	}
	
	public HotelPage clickOnNumberOfRoomAndGuest() {
		clickByXpath(prop.getProperty("HotelPage.NumberOfroomAndguest.XPath"));
		return this;
	}
	
	public HotelPage selectNoOfRoom(String value) {
		selectValueByXPath(prop.getProperty("HotelPage.Rooms.Xpath"), value);
		return this;
	}
	
	public HotelPage selectNoOfGuest(String value) {
		selectValueByXPath(prop.getProperty("HotelPage.Guests.XPath"), value);
		return this;
	}
	
	public HotelPage clickOnDone() {
		clickByXpath(prop.getProperty("HotelPage.Done.XPath"));
		return this;
	}
	
	public HotelListPage clickOnFindHotel() {
		clickByXpath(prop.getProperty("HotelPage.FindHotel.XPath"));
		return new HotelListPage(driver,test);
	}
	
}
