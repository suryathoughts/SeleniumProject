package com.tests;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.pages.OrangeHrmLoginPage;

import resources.TestBase;

public class OrangeHrmTest extends TestBase {

	@BeforeTest
	public void initialize() throws IOException {
		driver = intializeDriver();
		driver.get(prop.getProperty("orangehrmurl"));
	}

	@Test(dataProvider = "getData")
	public void Orange(String Username, String Pass) throws IOException {
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		while (it.hasNext()) {
			driver.switchTo().window(it.next());
		}
		OrangeHrmLoginPage l = new OrangeHrmLoginPage(driver);
		l.getUser().sendKeys(Username);
		l.pass().sendKeys(Pass);
		l.ln().click();
	}

	@DataProvider
	public Object[][] getData() throws InterruptedException {
		Object[][] data = new Object[2][2];
		data[0][0] = "Abhimanyu";
		data[0][1] = "1234";
		Thread.sleep(4000);
		data[1][0] = "Arjun";
		data[1][1] = "3451";

		return data;

	}

	@AfterTest
	public void TearDown() throws InterruptedException {
		Thread.sleep(4000);
		driver.quit();
	}

}
