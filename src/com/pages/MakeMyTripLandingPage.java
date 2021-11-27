package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MakeMyTripLandingPage {

	public WebDriver driver;

	By homepage = By.cssSelector("div.landingContainer");
	By close = By.xpath("//span[@class='langCardClose']");
	By from = By.xpath("//span[text()='From']");
	By from1 = By.xpath("//input[@placeholder='From']");
	By to = By.xpath("//span[text()='To']");
	By to1 = By.xpath("//input[@placeholder='To']");
	By cal = By.xpath("//span[text()='DEPARTURE']");
	By date = By
			.xpath("//div[@class='DayPicker-Day DayPicker-Day--selected'] [contains(@aria-label, 'Sun Nov 28 2021')]");
	By trinfo = By.xpath("//div[@class='fsw_inputBox flightTravllers inactiveWidget ']");
	By pass = By.xpath("//ul[@class='guestCounter font12 darkText gbCounter']/li[contains(@data-cy, 'adults-3')]");
	By key = By.xpath("//button[@class='primaryBtn btnApply pushRight']");
	By stfare = By.xpath("//div[@class='makeFlex hrtlCenter']/ul/li[3]/p[1]");
	By submit = By.xpath("//a[@class='primaryBtn font24 latoBold widgetSearchBtn ']");
	By value = By.id("btnLogin");

	public MakeMyTripLandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub

		this.driver = driver;
	}

	public WebElement gethomepage() {
		return driver.findElement(homepage);
	}

	public WebElement getclose() {
		return driver.findElement(close);
	}

	public WebElement stationFrom() {
		return driver.findElement(from);
	}

	public WebElement Station() {
		return driver.findElement(from1);
	}

	public WebElement stationName() {
		return driver.findElement(value);
	}

	public WebElement StaionTO() {
		return driver.findElement(to);
	}

	public WebElement StaionT() {
		return driver.findElement(to1);
	}

	public WebElement calender() {
		return driver.findElement(cal);
	}

	public WebElement datepicker() {
		return driver.findElement(date);
	}

	public WebElement Travellercalss01() {
		return driver.findElement(trinfo);
	}

	public WebElement travellerclass() {
		return driver.findElement(pass);
	}

	public WebElement Applybutton() {
		return driver.findElement(key);
	}

	public WebElement StudentFare() {
		return driver.findElement(stfare);
	}

	public WebElement Search() {
		return driver.findElement(submit);
	}
}
