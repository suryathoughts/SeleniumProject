package com.tests;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pages.MakeMyTripLandingPage;

import resources.TestBase;

public class Travel extends TestBase {
	
	@BeforeTest
	public void initialize() throws IOException
	{
		driver = intializeDriver();
		driver.get(prop.getProperty("travelurl"));
	}
	@Test
	public void Trav() throws InterruptedException
	{
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> it=windows.iterator();
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
		}
		
		MakeMyTripLandingPage LT = new MakeMyTripLandingPage(driver);
		driver.manage().window().maximize();
		LT.getclose().click();
		LT.gethomepage().click();
//		Alert alert = driver.switchTo().alert();
//		alert.dismiss();
		LT.stationFrom().click();
		Thread.sleep(3000);
		LT.Station().sendKeys("vtz");
		Thread.sleep(7000);
		for(int i=1; i<3; i++)
		{
			LT.Station().sendKeys(Keys.ARROW_DOWN);
		}
		Thread.sleep(2000);
		LT.Station().sendKeys(Keys.ENTER);
		LT.StaionTO().click();
		Thread.sleep(4000);
		LT.StaionT().sendKeys("del");
		Thread.sleep(7000);
		for(int i=1; i<2; i++)
		{
			LT.StaionT().sendKeys(Keys.ARROW_DOWN);
		}
		LT.StaionT().sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		LT.calender().click();
		Thread.sleep(3000);
		LT.datepicker().click();
		Thread.sleep(4000);
		LT.Travellercalss01().click();
		Thread.sleep(5000);
		LT.travellerclass().click();
		Thread.sleep(7000);
		LT.Applybutton().click();
		LT.StudentFare().click();
		LT.Search().click();
		
		
		
	}

}
