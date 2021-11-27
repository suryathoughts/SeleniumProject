package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrangeHrmLoginPage {
	
	public WebDriver driver;
	
		By userid = By.id("txtUsername");
		By pass = By.id("txtPassword");
		By login = By.id("btnLogin");
	
	
	public OrangeHrmLoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
	}

	public WebElement getUser()
	{
		return driver.findElement(userid);
	}
	
	public WebElement pass()
	{
		return driver.findElement(pass);
	}
	
	public WebElement ln()
	{
		return driver.findElement(login);
	}

}
